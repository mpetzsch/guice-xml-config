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
 * Class TrueSingletonBindingType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class TrueSingletonBindingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _interface.
     */
    private java.lang.String _interface;

    /**
     * Field _implementation.
     */
    private java.lang.String _implementation;


      //----------------/
     //- Constructors -/
    //----------------/

    public TrueSingletonBindingType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'implementation'.
     * 
     * @return the value of field 'Implementation'.
     */
    public java.lang.String getImplementation(
    ) {
        return this._implementation;
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
     * Sets the value of field 'implementation'.
     * 
     * @param implementation the value of field 'implementation'.
     */
    public void setImplementation(
            final java.lang.String implementation) {
        this._implementation = implementation;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * guice.xml.config.xml.TrueSingletonBindingType
     */
    public static guice.xml.config.castorimpl.TrueSingletonBindingType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.TrueSingletonBindingType) Unmarshaller.unmarshal(guice.xml.config.castorimpl.TrueSingletonBindingType.class, reader);
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
