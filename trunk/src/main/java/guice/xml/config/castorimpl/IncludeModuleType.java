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
 * Class IncludeModuleType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class IncludeModuleType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _moduleXmlList.
     */
    private java.util.Vector<java.lang.String> _moduleXmlList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncludeModuleType() {
        super();
        this._moduleXmlList = new java.util.Vector<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vModuleXml
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addModuleXml(
            final java.lang.String vModuleXml)
    throws java.lang.IndexOutOfBoundsException {
        this._moduleXmlList.addElement(vModuleXml);
    }

    /**
     * 
     * 
     * @param index
     * @param vModuleXml
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addModuleXml(
            final int index,
            final java.lang.String vModuleXml)
    throws java.lang.IndexOutOfBoundsException {
        this._moduleXmlList.add(index, vModuleXml);
    }

    /**
     * Method enumerateModuleXml.
     * 
     * @return an Enumeration over all java.lang.String elements
     */
    public java.util.Enumeration<java.lang.String> enumerateModuleXml(
    ) {
        return this._moduleXmlList.elements();
    }

    /**
     * Method getModuleXml.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getModuleXml(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._moduleXmlList.size()) {
            throw new IndexOutOfBoundsException("getModuleXml: Index value '" + index + "' not in range [0.." + (this._moduleXmlList.size() - 1) + "]");
        }
        
        return (java.lang.String) _moduleXmlList.get(index);
    }

    /**
     * Method getModuleXml.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getModuleXml(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._moduleXmlList.toArray(array);
    }

    /**
     * Method getModuleXmlAsReference.Returns a reference to
     * '_moduleXmlList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<java.lang.String> getModuleXmlAsReference(
    ) {
        return this._moduleXmlList;
    }

    /**
     * Method getModuleXmlCount.
     * 
     * @return the size of this collection
     */
    public int getModuleXmlCount(
    ) {
        return this._moduleXmlList.size();
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
    public void removeAllModuleXml(
    ) {
        this._moduleXmlList.clear();
    }

    /**
     * Method removeModuleXml.
     * 
     * @param vModuleXml
     * @return true if the object was removed from the collection.
     */
    public boolean removeModuleXml(
            final java.lang.String vModuleXml) {
        boolean removed = _moduleXmlList.remove(vModuleXml);
        return removed;
    }

    /**
     * Method removeModuleXmlAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeModuleXmlAt(
            final int index) {
        java.lang.Object obj = this._moduleXmlList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vModuleXml
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setModuleXml(
            final int index,
            final java.lang.String vModuleXml)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._moduleXmlList.size()) {
            throw new IndexOutOfBoundsException("setModuleXml: Index value '" + index + "' not in range [0.." + (this._moduleXmlList.size() - 1) + "]");
        }
        
        this._moduleXmlList.set(index, vModuleXml);
    }

    /**
     * 
     * 
     * @param vModuleXmlArray
     */
    public void setModuleXml(
            final java.lang.String[] vModuleXmlArray) {
        //-- copy array
        _moduleXmlList.clear();
        
        for (int i = 0; i < vModuleXmlArray.length; i++) {
                this._moduleXmlList.add(vModuleXmlArray[i]);
        }
    }

    /**
     * Sets the value of '_moduleXmlList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vModuleXmlList the Vector to copy.
     */
    public void setModuleXml(
            final java.util.Vector<java.lang.String> vModuleXmlList) {
        // copy vector
        this._moduleXmlList.clear();
        
        this._moduleXmlList.addAll(vModuleXmlList);
    }

    /**
     * Sets the value of '_moduleXmlList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param moduleXmlVector the Vector to set.
     */
    public void setModuleXmlAsReference(
            final java.util.Vector<java.lang.String> moduleXmlVector) {
        this._moduleXmlList = moduleXmlVector;
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
     * guice.xml.config.xml.IncludeModuleType
     */
    public static guice.xml.config.castorimpl.IncludeModuleType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.IncludeModuleType) Unmarshaller.unmarshal(guice.xml.config.castorimpl.IncludeModuleType.class, reader);
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
