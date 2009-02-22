package guice.xml.config;
/**
 * <p><b>Description:</b><br>
 * This exception is thrown when binding fails from an external configuration file.
 * <p><b>Usage and remarks:</b><br>
 * This runtime exception indicates total failure and bad configuration.
 * <p>
 * <b>Copyright:</b> (c) 2007 Capgemini UK Plc, United Kingdom<br>
 * <b>Website:</b> <a href="http://www.capgemini.co.uk">http://www.capgemini.co.uk</a><br>
 * <b>email:</b> <a href="mailto:info@capgemini.co.uk">info@capgemini.co.uk</a>
 * <p>
 * <b>Created:</b> 3 Oct 2007 18:33:38<br>
 * <b>@author:</b> MPETZSCH<br>
 * <b>@since:</b> JDK 1.5<br>
 */
@SuppressWarnings("serial")
public class GuiceExternalConfigException extends RuntimeException {
	public GuiceExternalConfigException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 
	 */
	public GuiceExternalConfigException(String msg) {
		super(msg);
	}
}
