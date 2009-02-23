package guice.xml.config;

/**
 * <p><b>Description:</b><br>
 * This is a base guice module which provides reading of external configuration in addition
 * to configuration through java.
 * <p><b>Usage and remarks:</b><br>
 * This module should be extended and the name of the configuration file should be passed
 * into its constructor from the child module. e.g. super("remote-app-guice-config.xml");
 * The module will then read and process the external configuration before also 
 * processing any configuration which has been hard coded into the extendConfigure method
 * on the child module.
 * <b>Created:</b> 3 Oct 2007 18:33:38<br>
 * <b>@author:</b> MPETZSCH<br>
 * <b>@since:</b> JDK 1.5<br>
 */
import static com.google.inject.matcher.Matchers.annotatedWith;
import static com.google.inject.matcher.Matchers.any;
import guice.xml.config.castorimpl.Binding;
import guice.xml.config.castorimpl.ConstantBinding;
import guice.xml.config.castorimpl.GuiceConfiguration;
import guice.xml.config.castorimpl.InterceptorBinding;
import guice.xml.config.castorimpl.JndiBinding;
import guice.xml.config.castorimpl.PropertiesBundleBinding;
import guice.xml.config.castorimpl.Property;
import guice.xml.config.castorimpl.ProviderBinding;
import guice.xml.config.castorimpl.StaticInjection;
import guice.xml.config.castorimpl.TrueSingletonBinding;
import guice.xml.config.castorimpl.types.ScopeType;
import guice.xml.config.extra.SingletonInternal;
import guice.xml.config.utils.LogWrapper;
import guice.xml.config.utils.LoggerIF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.aopalliance.intercept.MethodInterceptor;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.TypeLiteral;
import com.google.inject.jndi.JndiIntegration;
import com.google.inject.name.Names;

public abstract class ExternalConfigModule extends AbstractModule
{

	private LoggerIF logger = new LogWrapper(ExternalConfigModule.class);

	private String configFile;

	public ExternalConfigModule(String configFileName)
	{
		this.configFile = configFileName;
	}

	private List<GuiceConfiguration> readFile(String configFile,
			HashSet<String> processed) throws GuiceExternalConfigException
	{
		logger.debug("reading Guice config ", configFile);
		processed.add(configFile);

		List<GuiceConfiguration> configs = new ArrayList<GuiceConfiguration>();
		GuiceConfiguration config = CastorGuiceConfigReader
				.readConfig(configFile);
		configs.add(config);

		if (config.getModuleDependencies() != null
				&& config.getModuleDependencies().getModuleXml() != null)
		{
			for (String includedConfig : config.getModuleDependencies()
					.getModuleXml())
			{

				String use = includedConfig;
				if (!use.startsWith("./"))
				{
					use = "./" + use;
				}

				if (!processed.contains(use))
				{
					logger.debug(
							"Configuring Guice - included config ", use);

					List<GuiceConfiguration> incConfigs = readFile(use.trim(),
							processed);
					configs.addAll(incConfigs);
				} else
				{
					logger.debug(use,
							" already bound, will not bind again");
				}
			}
		}

		return configs;
	}

	@Override
	protected void configure()
	{
		logger.debug("Binding Guice with ", configFile);

		List<GuiceConfiguration> allConfigs = readFile(configFile,
				new HashSet<String>());

		GuiceConfiguration topConfig = allConfigs.get(0);

		logger.debug("Binding Guice with ", allConfigs.size(),
				" config files");

		// some useful sysout
		/*
		 * StringBuilder builder = new StringBuilder(); builder.append("Binding
		 * Guice module
		 * ").append(topConfig.getConfigName().toUpperCase()).append(" with ");
		 * for (GuiceConfiguration conf : allConfigs) { if
		 * (!conf.getConfigName().equals(topConfig.getConfigName())) {
		 * builder.append("[").append(conf.getConfigName()).append("]"); } }
		 * System.out.println(builder.toString());
		 */

		bind(Context.class).to(InitialContext.class);

		for (GuiceConfiguration config : allConfigs)
		{
			logger.info(getClass(), "Binding guice config [", topConfig
					.getConfigName(), "]", (config != topConfig ? ".["
					+ config.getConfigName() + "]" : ""));

			logger.debug(config.getConfigName(),
					"## configuring all standard bindings");
			for (Binding binding : config.getBinding())
			{
				try
				{
					Class iface = Class.forName(binding.getInterface());
					Class impl = Class.forName(binding.getImplementation());
					ScopeType scope = binding.getScope();

					if (binding.getAnnotatedWith() == null)
					{
						logger.debug(config.getConfigName(),
								"# Binding interface: ", iface, " to impl: ",
								impl, " scope?: ", scope);
						if (ScopeType.SINGLETON.equals(scope))
						{
							logger.debug(config.getConfigName(),
									"# binding singleton ", iface,
									" to impl: ", impl);
							bind(iface).to(impl).in(Scopes.SINGLETON);
						} {
							bind(iface).to(impl);
						}
					} else
					{
						Class annot = Class.forName(binding.getAnnotatedWith());
						logger.debug(config.getConfigName(),
								"# Binding interface: ", iface, " to impl: ",
								impl, " annotated with: ", annot, " scope?: ",
								scope);
						if (ScopeType.SINGLETON.equals(scope))
						{
							logger.debug(config.getConfigName(),
									"# binding singleton ", iface,
									" to impl: ", impl, " annotated with ",
									annot);
							bind(iface).annotatedWith(annot).to(impl).in(
									Scopes.SINGLETON);
						} else
						{
							bind(iface).annotatedWith(annot).to(impl);
						}
					}
				} catch (ClassNotFoundException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from Standard Binding Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from Standard Binding Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				}
			}

			logger.debug(config.getConfigName(),
					"## configuring all true singleton bindings");
			for (TrueSingletonBinding binding : config
					.getTrueSingletonBinding())
			{
				try
				{
					Class iface = Class.forName(binding.getInterface());
					Class impl = Class.forName(binding.getImplementation());

					logger.debug(config.getConfigName(),
							"# Binding interface: ", iface, " as true singleton to implementation ", impl);
					bind(iface).annotatedWith(SingletonInternal.class).to(impl);
					bind(iface).toProvider(new guice.xml.config.extra.TrueSingletonProvider<Object>(iface));
				} catch (ClassNotFoundException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from True Singleton Binding Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from True Singleton Binding Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				}
			}

			// ###################

			logger.debug(config.getConfigName(),
					"## configuring all provider bindings");
			for (ProviderBinding binding : config.getProviderBinding())
			{
				try
				{
					Class iface = Class.forName(binding.getInterface());
					Class provider = Class.forName(binding.getProvider());
					ScopeType scope = binding.getScope();

					if (binding.getAnnotatedWith() == null)
					{
						logger.debug(config.getConfigName(),
								"# Binding interface: ", iface,
								" to provider: ", provider, " scope?: ", scope);
						if (ScopeType.SINGLETON.equals(scope))
						{
							logger.debug(config.getConfigName(),
									"# binding singleton ", iface,
									" to impl: ", provider);
							bind(iface).toProvider(provider).in(
									Scopes.SINGLETON);
						} else
						{
							bind(iface).toProvider(provider);
						}
					} else
					{
						Class annot = Class.forName(binding.getAnnotatedWith());
						logger.debug(config.getConfigName(),
								"# Binding interface: ", iface,
								" to provider: ", provider,
								" annotated with: ", annot, " scope?: ", scope);
						if (ScopeType.SINGLETON.equals(scope))
						{
							logger.debug(config.getConfigName(),
									"# binding singleton ", iface,
									" to impl: ", provider, " annotated with ",
									annot);
							bind(iface).annotatedWith(annot).toProvider(
									provider).in(Scopes.SINGLETON);
						} else
						{
							bind(iface).annotatedWith(annot).toProvider(
									provider);
						}
					}
				} catch (ClassNotFoundException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from Provider Binding Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from Provider Binding Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				}
			}

			logger.debug(config.getConfigName(),
					"## configuring all constant bindings");
			for (ConstantBinding constant : config.getConstantBinding())
			{
				String constantName = constant.getConstantName();
				String constantValue = constant.getConstantValue();

				logger.debug(config.getConfigName(),
						"# Binding constant ", constantName, " to value '",
						constantValue, "'");

				bindConstant().annotatedWith(Names.named(constantName)).to(
						constantValue);
			}

			logger.debug(config.getConfigName(),
					"## configuring all property bundle bindings");
			for (PropertiesBundleBinding bundle : config
					.getPropertiesBundleBinding())
			{
				logger.debug(
						"Binding properties bundle with name ", bundle
								.getBundleName());
				Map<String, String> properties = new HashMap<String, String>();
				for (Property prop : bundle.getPropertyAsReference())
				{
					properties.put(prop.getName(), prop.getContent());
				}

				bind(new TypeLiteral<Map<String, String>>()
				{
				}).annotatedWith(
						com.google.inject.name.Names.named(bundle
								.getBundleName())).toInstance(
						Collections.unmodifiableMap(properties));

			}

			logger.debug(config.getConfigName(),
					" ## configuring all static injection requests");
			for (StaticInjection injection : config.getStaticInjection())
			{
				try
				{
					Class staticClass = Class.forName(injection
							.getStaticClass());

					logger.debug(config.getConfigName(),
							"# Requesting static injection for ", staticClass);

					requestStaticInjection(staticClass);
				} catch (ClassNotFoundException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from Static Injection Config in BaseExternalModule while reading ",
									configFile, ":", config.getConfigName(),
									" item is: ", injection.getStaticClass());
					System.err
							.println("Exception from Static Injection Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ "item is "
									+ injection.getStaticClass()
									+ ":: "
									+ e.toString());
				}
			}

			logger.debug(config.getConfigName(),
					" ## configuring all interceptor bindings");
			for (InterceptorBinding interceptor : config
					.getInterceptorBinding())
			{
				try
				{
					Class impl = Class.forName(interceptor.getInterceptor());
					MethodInterceptor inc = (MethodInterceptor) impl
							.newInstance();
					String matcher = interceptor.getMatcher();
					Class annot = Class.forName(interceptor.getAnnotatedWith());

					logger.debug(config.getConfigName(),
							"# Binding interceptor: ", impl
									+ " to annotation: ", annot);

					bindInterceptor(any(), annotatedWith(annot), inc);
				} catch (ClassNotFoundException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from Interceptor Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from Interceptor Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				} catch (IllegalAccessException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from Interceptor Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from Interceptor Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				} catch (InstantiationException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from Interceptor Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from Interceptor Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				}
			}

			logger.debug(config.getConfigName(),
					" ## configuring all JNDI bindings");
			for (JndiBinding jndi : config.getJndiBinding())
			{
				try
				{
					Class iface = Class.forName(jndi.getInterface());
					String jndiName = jndi.getJndiName();
					ScopeType scope = jndi.getScope();

					if (jndi.getAnnotatedWith() == null)
					{
						logger.debug(config.getConfigName(),
								"# Binding interface: ", iface,
								" to jndiName: ", jndiName, " scope?: ", scope);

						if (ScopeType.SINGLETON.equals(scope))
						{
							bind(iface).toProvider(
									JndiIntegration.fromJndi(iface, jndiName))
									.in(Scopes.SINGLETON);
						} else
						{
							bind(iface).toProvider(
									JndiIntegration.fromJndi(iface, jndiName));
						}
					} else
					{
						Class annot = Class.forName(jndi.getAnnotatedWith());
						logger.debug(config.getConfigName(),
								"# Binding interface: ", iface,
								" to jndiName: ", jndiName,
								" annotated with: ", annot, " scope?: ", scope);
						if (ScopeType.SINGLETON.equals(scope))
						{
							bind(iface).annotatedWith(annot).toProvider(
									JndiIntegration.fromJndi(iface, jndiName))
									.in(Scopes.SINGLETON);
						} else
						{
							bind(iface).annotatedWith(annot).toProvider(
									JndiIntegration.fromJndi(iface, jndiName));
						}
					}
				} catch (ClassNotFoundException e)
				{
					addError(e);
					logger
							.error(
									getClass(),
									e,
									"Exception from JNDI Config in BaseExternalModule while reading ",
									configFile, ": ", config.getConfigName());
					System.err
							.println("Exception from JNDI Config BaseExternalModule while reading "
									+ configFile
									+ ": "
									+ config.getConfigName()
									+ ":: "
									+ e.toString());
				}
			}
		}

		// call any implementing sub classes' extend method
		logger.debug(
				"Calling extendConfigure following configure of ", configFile,
				"...");
		extendConfigure();
		logger.debug("extendConfigure of ", configFile,
				" completed...");
	}

	protected abstract void extendConfigure();
}
