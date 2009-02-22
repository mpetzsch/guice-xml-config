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
 * Class InterceptorBindingType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class InterceptorBindingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _matcher.
     */
    private java.lang.String _matcher;

    /**
     * Field _annotatedWith.
     */
    private java.lang.String _annotatedWith;

    /**
     * Field _interceptor.
     */
    private java.lang.String _interceptor;


      //----------------/
     //- Constructors -/
    //----------------/

    public InterceptorBindingType() {
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
     * Returns the value of field 'interceptor'.
     * 
     * @return the value of field 'Interceptor'.
     */
    public java.lang.String getInterceptor(
    ) {
        return this._interceptor;
    }

    /**
     * Returns the value of field 'matcher'.
     * 
     * @return the value of field 'Matcher'.
     */
    public java.lang.String getMatcher(
    ) {
        return this._matcher;
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
     * Sets the value of field 'interceptor'.
     * 
     * @param interceptor the value of field 'interceptor'.
     */
    public void setInterceptor(
            final java.lang.String interceptor) {
        this._interceptor = interceptor;
    }

    /**
     * Sets the value of field 'matcher'.
     * 
     * @param matcher the value of field 'matcher'.
     */
    public void setMatcher(
            final java.lang.String matcher) {
        this._matcher = matcher;
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
     * guice.xml.config.xml.InterceptorBindingType
     */
    public static guice.xml.config.castorimpl.InterceptorBindingType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.InterceptorBindingType) Unmarshaller.unmarshal(guice.xml.config.castorimpl.InterceptorBindingType.class, reader);
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
