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
 * Class PropertiesBundleBindingType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertiesBundleBindingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bundleName.
     */
    private java.lang.String _bundleName;

    /**
     * Field _propertyList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.Property> _propertyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertiesBundleBindingType() {
        super();
        this._propertyList = new java.util.Vector<guice.xml.config.castorimpl.Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final guice.xml.config.castorimpl.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.addElement(vProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final int index,
            final guice.xml.config.castorimpl.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(index, vProperty);
    }

    /**
     * Method enumerateProperty.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.Property elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.Property> enumerateProperty(
    ) {
        return this._propertyList.elements();
    }

    /**
     * Returns the value of field 'bundleName'.
     * 
     * @return the value of field 'BundleName'.
     */
    public java.lang.String getBundleName(
    ) {
        return this._bundleName;
    }

    /**
     * Method getProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.Property at the given
     * index
     */
    public guice.xml.config.castorimpl.Property getProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("getProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.Property) _propertyList.get(index);
    }

    /**
     * Method getProperty.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.Property[] getProperty(
    ) {
        guice.xml.config.castorimpl.Property[] array = new guice.xml.config.castorimpl.Property[0];
        return (guice.xml.config.castorimpl.Property[]) this._propertyList.toArray(array);
    }

    /**
     * Method getPropertyAsReference.Returns a reference to
     * '_propertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.Property> getPropertyAsReference(
    ) {
        return this._propertyList;
    }

    /**
     * Method getPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyCount(
    ) {
        return this._propertyList.size();
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
     */
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     * Method removeProperty.
     * 
     * @param vProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeProperty(
            final guice.xml.config.castorimpl.Property vProperty) {
        boolean removed = _propertyList.remove(vProperty);
        return removed;
    }

    /**
     * Method removePropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.Property removePropertyAt(
            final int index) {
        java.lang.Object obj = this._propertyList.remove(index);
        return (guice.xml.config.castorimpl.Property) obj;
    }

    /**
     * Sets the value of field 'bundleName'.
     * 
     * @param bundleName the value of field 'bundleName'.
     */
    public void setBundleName(
            final java.lang.String bundleName) {
        this._bundleName = bundleName;
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProperty(
            final int index,
            final guice.xml.config.castorimpl.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("setProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }
        
        this._propertyList.set(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyArray
     */
    public void setProperty(
            final guice.xml.config.castorimpl.Property[] vPropertyArray) {
        //-- copy array
        _propertyList.clear();
        
        for (int i = 0; i < vPropertyArray.length; i++) {
                this._propertyList.add(vPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_propertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyList the Vector to copy.
     */
    public void setProperty(
            final java.util.Vector<guice.xml.config.castorimpl.Property> vPropertyList) {
        // copy vector
        this._propertyList.clear();
        
        this._propertyList.addAll(vPropertyList);
    }

    /**
     * Sets the value of '_propertyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyVector the Vector to set.
     */
    public void setPropertyAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.Property> propertyVector) {
        this._propertyList = propertyVector;
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
     * guice.xml.config.xml.PropertiesBundleBindingType
     */
    public static guice.xml.config.castorimpl.PropertiesBundleBindingType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.PropertiesBundleBindingType) Unmarshaller.unmarshal(guice.xml.config.castorimpl.PropertiesBundleBindingType.class, reader);
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
