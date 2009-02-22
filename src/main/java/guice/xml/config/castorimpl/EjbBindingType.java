/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package guice.xml.config.castorimpl;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class EjbBindingType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EjbBindingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _interface.
     */
    private java.lang.String _interface;

    /**
     * Field _jndiName.
     */
    private java.lang.String _jndiName;

    /**
     * Field _localHome.
     */
    private java.lang.String _localHome;

    /**
     * Field _annotatedWith.
     */
    private java.lang.String _annotatedWith;


      //----------------/
     //- Constructors -/
    //----------------/

    public EjbBindingType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'annotatedWith'.
     * 
     * @return the value of field 'AnnotatedWith'.
     */
    public java.lang.String getAnnotatedWith(
    ) {
        return this._annotatedWith;
    }

    /**
     * Returns the value of field 'interface'.
     * 
     * @return the value of field 'Interface'.
     */
    public java.lang.String getInterface(
    ) {
        return this._interface;
    }

    /**
     * Returns the value of field 'jndiName'.
     * 
     * @return the value of field 'JndiName'.
     */
    public java.lang.String getJndiName(
    ) {
        return this._jndiName;
    }

    /**
     * Returns the value of field 'localHome'.
     * 
     * @return the value of field 'LocalHome'.
     */
    public java.lang.String getLocalHome(
    ) {
        return this._localHome;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'annotatedWith'.
     * 
     * @param annotatedWith the value of field 'annotatedWith'.
     */
    public void setAnnotatedWith(
            final java.lang.String annotatedWith) {
        this._annotatedWith = annotatedWith;
    }

    /**
     * Sets the value of field 'interface'.
     * 
     * @param _interface
     * @param interface the value of field 'interface'.
     */
    public void setInterface(
            final java.lang.String _interface) {
        this._interface = _interface;
    }

    /**
     * Sets the value of field 'jndiName'.
     * 
     * @param jndiName the value of field 'jndiName'.
     */
    public void setJndiName(
            final java.lang.String jndiName) {
        this._jndiName = jndiName;
    }

    /**
     * Sets the value of field 'localHome'.
     * 
     * @param localHome the value of field 'localHome'.
     */
    public void setLocalHome(
            final java.lang.String localHome) {
        this._localHome = localHome;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * guice.xml.config.xml.EjbBindingType
     */
    public static guice.xml.config.castorimpl.EjbBindingType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.EjbBindingType) Unmarshaller.unmarshal(guice.xml.config.castorimpl.EjbBindingType.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
