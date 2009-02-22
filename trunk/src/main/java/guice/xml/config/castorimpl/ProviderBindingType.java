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
 * Class ProviderBindingType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ProviderBindingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _scope.
     */
    private guice.xml.config.castorimpl.types.ScopeType _scope;

    /**
     * Field _interface.
     */
    private java.lang.String _interface;

    /**
     * Field _provider.
     */
    private java.lang.String _provider;

    /**
     * Field _annotatedWith.
     */
    private java.lang.String _annotatedWith;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProviderBindingType() {
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
     * Returns the value of field 'provider'.
     * 
     * @return the value of field 'Provider'.
     */
    public java.lang.String getProvider(
    ) {
        return this._provider;
    }

    /**
     * Returns the value of field 'scope'.
     * 
     * @return the value of field 'Scope'.
     */
    public guice.xml.config.castorimpl.types.ScopeType getScope(
    ) {
        return this._scope;
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
     * Sets the value of field 'provider'.
     * 
     * @param provider the value of field 'provider'.
     */
    public void setProvider(
            final java.lang.String provider) {
        this._provider = provider;
    }

    /**
     * Sets the value of field 'scope'.
     * 
     * @param scope the value of field 'scope'.
     */
    public void setScope(
            final guice.xml.config.castorimpl.types.ScopeType scope) {
        this._scope = scope;
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
     * guice.xml.config.xml.ProviderBindingType
     */
    public static guice.xml.config.castorimpl.ProviderBindingType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.ProviderBindingType) Unmarshaller.unmarshal(guice.xml.config.castorimpl.ProviderBindingType.class, reader);
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
