package guice.xml.config;

/**
 * <p><b>Description:</b><br>
 * This class provides a Castor XML/Java implementation of external Guice configuration.
 * <p><b>Usage and remarks:</b><br>
 * The single static method should be passed the configuration filename to use.  It will then process the file
 * and return an instance of GuiceConfiguration
 * Providers don't work yet - this may be added in a later release.
 * <p>
 * <b>Copyright:</b> (c) 2007 Capgemini UK Plc, United Kingdom<br>
 * <b>Website:</b> <a href="http://www.capgemini.co.uk">http://www.capgemini.co.uk</a><br>
 * <b>email:</b> <a href="mailto:info@capgemini.co.uk">info@capgemini.co.uk</a>
 * <p>
 * <b>Created:</b> 3 Oct 2007 18:33:38<br>
 * <b>@author:</b> MPETZSCH<br>
 * <b>@since:</b> JDK 1.5<br>
 */
import guice.xml.config.castorimpl.GuiceConfiguration;
import guice.xml.config.utils.LogWrapper;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

public class CastorGuiceConfigReader {
	
	private static guice.xml.config.utils.LoggerIF logger = new LogWrapper(CastorGuiceConfigReader.class);
	
	public static GuiceConfiguration readConfig(String filename)
			throws GuiceExternalConfigReadException {
		
		logger.debug("Reading config from ", filename);
		
		Unmarshaller un = new Unmarshaller(GuiceConfiguration.class);
		GuiceConfiguration config;
		try {
			InputStream configStream = CastorGuiceConfigReader.class
					.getClassLoader().getResourceAsStream(filename);
			if (null == configStream){
				logger.fatal(CastorGuiceConfigReader.class, "Could not read ", filename, " from classpath");
				throw new FileNotFoundException("CastorGuiceConfigReader: could not read " + filename + " from classpath");
			}
			config = (GuiceConfiguration) un.unmarshal(new InputStreamReader(configStream));
		} catch (MarshalException e) {
			logger.fatal(CastorGuiceConfigReader.class, e, " [ ", filename, "]");
			System.err.println(("CastorGuiceConfigReader [ " + filename + "]: " + e.toString()));
			throw new GuiceExternalConfigReadException(e);
		} catch (ValidationException e) {
			logger.fatal(CastorGuiceConfigReader.class, e, " [ ", filename, "]");
			System.err.println(("CastorGuiceConfigReader [ " + filename + "]: " + e.toString()));
			throw new GuiceExternalConfigReadException(e);
		} catch (FileNotFoundException e) {
			logger.fatal(CastorGuiceConfigReader.class, e, " [ ", filename, "]");
			System.err.println(("CastorGuiceConfigReader [ " + filename + "]: " + e.toString()));
			throw new GuiceExternalConfigReadException(e);
		}
		return config;
	}
}
