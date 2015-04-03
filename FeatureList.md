# Features #

This page lists at a high level the current features of this library with an example of each. **IT IS WORK IN PROGRESS AND NOT COMPLETE**

High level features:
  * Interface to Implementation binding
```
<binding>
    <Interface>guice.xml.config.test.dummys.BasicServiceIF</Interface>
    <Implementation>guice.xml.config.test.dummys.BasicServiceImpl</Implementation>
  </binding>
```
  * Interface to Implementation binding with Annotations
```
<binding>
    <Interface>guice.xml.config.test.dummys.BasicServiceIF</Interface>
    <Implementation>guice.xml.config.test.dummys.BasicServiceImpl</Implementation>    
    <AnnotatedWith>guice.xml.config.test.dummys.BasicServiceBlue</AnnotatedWith>			
</binding>
```
  * Interface to Implementation binding in Scopes
```
<binding scope="singleton">
    <Interface>guice.xml.config.test.dummys.BasicServiceIF</Interface>
    <Implementation>guice.xml.config.test.dummys.BasicServiceImpl</Implementation>    
    <AnnotatedWith>guice.xml.config.test.dummys.BasicServiceBlue</AnnotatedWith>			
</binding>
```
  * Constant Bindings (currently Strings only)
```
<constantBinding>
    <ConstantName>pool.maxSize</ConstantName>
    <ConstantValue>50</ConstantValue>
</constantBinding>
```
  * True Singleton bindings (cross injector - using static... :-/ )
```
<trueSingletonBinding>
    <Interface>guice.xml.config.test.dummys.ConnectionPoolIF</Interface>
    <Implementation>guice.xml.config.test.dummys.ConnectionPoolImpl</Implementation>
</trueSingletonBinding>
```
  * Provider bindings
```
<providerBinding>
    <Interface>guice.xml.config.test.dummys.NeedsAFactoryImpl</Interface>
    <Provider>guice.xml.config.test.dummys.IsAProvider</Provider>
</providerBinding>
```
  * Property bundle bindings - currently Strings only
```
<propertiesBundleBinding bundleName="poolingOptions">
    <property name="maxSize">50</property>
    <property name="minSize">10</property>
    <property name="exhaustAction">block</property>
</propertiesBundleBinding>
```
  * Static Injections
```
<staticInjection>
	<StaticClass>guice.xml.config.test.dummys.NastyStaticallyDependentClass</StaticClass>
</staticInjection>	
```
  * Interceptor bindings - current only Annotation and 'any' class driven
```
<interceptorBinding>
	<Matcher>any</Matcher>
	<AnnotatedWith>guice.xml.config.test.dummys.Timed</AnnotatedWith>
	<Interceptor>guice.xml.config.test.dummys.TimingInterceptor</Interceptor>
</interceptorBinding>
```
  * JNDI Bindings
```
<jndiBinding>
	<Interface>commonj.timers.TimerManager</Interface>
	<JndiName>java:comp/env/tm/MonkeyTimerManager</JndiName>
	<AnnotatedWith>guice.xml.config.test.dummys.Monkey</AnnotatedWith>
</jndiBinding>
```