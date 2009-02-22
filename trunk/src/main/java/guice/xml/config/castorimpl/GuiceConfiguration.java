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
 * Class GuiceConfiguration.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class GuiceConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _configName.
     */
    private java.lang.String _configName;

    /**
     * Field _moduleDependencies.
     */
    private guice.xml.config.castorimpl.ModuleDependencies _moduleDependencies;

    /**
     * Field _bindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.Binding> _bindingList;

    /**
     * Field _jndiBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.JndiBinding> _jndiBindingList;

    /**
     * Field _ejbBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.EjbBinding> _ejbBindingList;

    /**
     * Field _trueSingletonBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.TrueSingletonBinding> _trueSingletonBindingList;

    /**
     * Field _providerBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.ProviderBinding> _providerBindingList;

    /**
     * Field _interceptorBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.InterceptorBinding> _interceptorBindingList;

    /**
     * Field _constantBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.ConstantBinding> _constantBindingList;

    /**
     * Field _propertiesBundleBindingList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.PropertiesBundleBinding> _propertiesBundleBindingList;

    /**
     * Field _staticInjectionList.
     */
    private java.util.Vector<guice.xml.config.castorimpl.StaticInjection> _staticInjectionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GuiceConfiguration() {
        super();
        this._bindingList = new java.util.Vector<guice.xml.config.castorimpl.Binding>();
        this._jndiBindingList = new java.util.Vector<guice.xml.config.castorimpl.JndiBinding>();
        this._ejbBindingList = new java.util.Vector<guice.xml.config.castorimpl.EjbBinding>();
        this._trueSingletonBindingList = new java.util.Vector<guice.xml.config.castorimpl.TrueSingletonBinding>();
        this._providerBindingList = new java.util.Vector<guice.xml.config.castorimpl.ProviderBinding>();
        this._interceptorBindingList = new java.util.Vector<guice.xml.config.castorimpl.InterceptorBinding>();
        this._constantBindingList = new java.util.Vector<guice.xml.config.castorimpl.ConstantBinding>();
        this._propertiesBundleBindingList = new java.util.Vector<guice.xml.config.castorimpl.PropertiesBundleBinding>();
        this._staticInjectionList = new java.util.Vector<guice.xml.config.castorimpl.StaticInjection>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBinding(
            final guice.xml.config.castorimpl.Binding vBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._bindingList.addElement(vBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBinding(
            final int index,
            final guice.xml.config.castorimpl.Binding vBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._bindingList.add(index, vBinding);
    }

    /**
     * 
     * 
     * @param vConstantBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConstantBinding(
            final guice.xml.config.castorimpl.ConstantBinding vConstantBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._constantBindingList.addElement(vConstantBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vConstantBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConstantBinding(
            final int index,
            final guice.xml.config.castorimpl.ConstantBinding vConstantBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._constantBindingList.add(index, vConstantBinding);
    }

    /**
     * 
     * 
     * @param vEjbBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEjbBinding(
            final guice.xml.config.castorimpl.EjbBinding vEjbBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._ejbBindingList.addElement(vEjbBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vEjbBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEjbBinding(
            final int index,
            final guice.xml.config.castorimpl.EjbBinding vEjbBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._ejbBindingList.add(index, vEjbBinding);
    }

    /**
     * 
     * 
     * @param vInterceptorBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInterceptorBinding(
            final guice.xml.config.castorimpl.InterceptorBinding vInterceptorBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._interceptorBindingList.addElement(vInterceptorBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vInterceptorBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInterceptorBinding(
            final int index,
            final guice.xml.config.castorimpl.InterceptorBinding vInterceptorBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._interceptorBindingList.add(index, vInterceptorBinding);
    }

    /**
     * 
     * 
     * @param vJndiBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJndiBinding(
            final guice.xml.config.castorimpl.JndiBinding vJndiBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._jndiBindingList.addElement(vJndiBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vJndiBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJndiBinding(
            final int index,
            final guice.xml.config.castorimpl.JndiBinding vJndiBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._jndiBindingList.add(index, vJndiBinding);
    }

    /**
     * 
     * 
     * @param vPropertiesBundleBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertiesBundleBinding(
            final guice.xml.config.castorimpl.PropertiesBundleBinding vPropertiesBundleBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._propertiesBundleBindingList.addElement(vPropertiesBundleBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertiesBundleBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertiesBundleBinding(
            final int index,
            final guice.xml.config.castorimpl.PropertiesBundleBinding vPropertiesBundleBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._propertiesBundleBindingList.add(index, vPropertiesBundleBinding);
    }

    /**
     * 
     * 
     * @param vProviderBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProviderBinding(
            final guice.xml.config.castorimpl.ProviderBinding vProviderBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._providerBindingList.addElement(vProviderBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vProviderBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProviderBinding(
            final int index,
            final guice.xml.config.castorimpl.ProviderBinding vProviderBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._providerBindingList.add(index, vProviderBinding);
    }

    /**
     * 
     * 
     * @param vStaticInjection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStaticInjection(
            final guice.xml.config.castorimpl.StaticInjection vStaticInjection)
    throws java.lang.IndexOutOfBoundsException {
        this._staticInjectionList.addElement(vStaticInjection);
    }

    /**
     * 
     * 
     * @param index
     * @param vStaticInjection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStaticInjection(
            final int index,
            final guice.xml.config.castorimpl.StaticInjection vStaticInjection)
    throws java.lang.IndexOutOfBoundsException {
        this._staticInjectionList.add(index, vStaticInjection);
    }

    /**
     * 
     * 
     * @param vTrueSingletonBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrueSingletonBinding(
            final guice.xml.config.castorimpl.TrueSingletonBinding vTrueSingletonBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._trueSingletonBindingList.addElement(vTrueSingletonBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vTrueSingletonBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrueSingletonBinding(
            final int index,
            final guice.xml.config.castorimpl.TrueSingletonBinding vTrueSingletonBinding)
    throws java.lang.IndexOutOfBoundsException {
        this._trueSingletonBindingList.add(index, vTrueSingletonBinding);
    }

    /**
     * Method enumerateBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.Binding elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.Binding> enumerateBinding(
    ) {
        return this._bindingList.elements();
    }

    /**
     * Method enumerateConstantBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.ConstantBinding
     * elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.ConstantBinding> enumerateConstantBinding(
    ) {
        return this._constantBindingList.elements();
    }

    /**
     * Method enumerateEjbBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.EjbBinding elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.EjbBinding> enumerateEjbBinding(
    ) {
        return this._ejbBindingList.elements();
    }

    /**
     * Method enumerateInterceptorBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.InterceptorBinding
     * elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.InterceptorBinding> enumerateInterceptorBinding(
    ) {
        return this._interceptorBindingList.elements();
    }

    /**
     * Method enumerateJndiBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.JndiBinding elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.JndiBinding> enumerateJndiBinding(
    ) {
        return this._jndiBindingList.elements();
    }

    /**
     * Method enumeratePropertiesBundleBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.PropertiesBundleBinding
     * elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.PropertiesBundleBinding> enumeratePropertiesBundleBinding(
    ) {
        return this._propertiesBundleBindingList.elements();
    }

    /**
     * Method enumerateProviderBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.ProviderBinding
     * elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.ProviderBinding> enumerateProviderBinding(
    ) {
        return this._providerBindingList.elements();
    }

    /**
     * Method enumerateStaticInjection.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.StaticInjection
     * elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.StaticInjection> enumerateStaticInjection(
    ) {
        return this._staticInjectionList.elements();
    }

    /**
     * Method enumerateTrueSingletonBinding.
     * 
     * @return an Enumeration over all
     * guice.xml.config.xml.TrueSingletonBinding
     * elements
     */
    public java.util.Enumeration<guice.xml.config.castorimpl.TrueSingletonBinding> enumerateTrueSingletonBinding(
    ) {
        return this._trueSingletonBindingList.elements();
    }

    /**
     * Method getBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.Binding at the given
     * index
     */
    public guice.xml.config.castorimpl.Binding getBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bindingList.size()) {
            throw new IndexOutOfBoundsException("getBinding: Index value '" + index + "' not in range [0.." + (this._bindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.Binding) _bindingList.get(index);
    }

    /**
     * Method getBinding.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.Binding[] getBinding(
    ) {
        guice.xml.config.castorimpl.Binding[] array = new guice.xml.config.castorimpl.Binding[0];
        return (guice.xml.config.castorimpl.Binding[]) this._bindingList.toArray(array);
    }

    /**
     * Method getBindingAsReference.Returns a reference to
     * '_bindingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.Binding> getBindingAsReference(
    ) {
        return this._bindingList;
    }

    /**
     * Method getBindingCount.
     * 
     * @return the size of this collection
     */
    public int getBindingCount(
    ) {
        return this._bindingList.size();
    }

    /**
     * Returns the value of field 'configName'.
     * 
     * @return the value of field 'ConfigName'.
     */
    public java.lang.String getConfigName(
    ) {
        return this._configName;
    }

    /**
     * Method getConstantBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.ConstantBinding at
     * the given index
     */
    public guice.xml.config.castorimpl.ConstantBinding getConstantBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._constantBindingList.size()) {
            throw new IndexOutOfBoundsException("getConstantBinding: Index value '" + index + "' not in range [0.." + (this._constantBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.ConstantBinding) _constantBindingList.get(index);
    }

    /**
     * Method getConstantBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.ConstantBinding[] getConstantBinding(
    ) {
        guice.xml.config.castorimpl.ConstantBinding[] array = new guice.xml.config.castorimpl.ConstantBinding[0];
        return (guice.xml.config.castorimpl.ConstantBinding[]) this._constantBindingList.toArray(array);
    }

    /**
     * Method getConstantBindingAsReference.Returns a reference to
     * '_constantBindingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.ConstantBinding> getConstantBindingAsReference(
    ) {
        return this._constantBindingList;
    }

    /**
     * Method getConstantBindingCount.
     * 
     * @return the size of this collection
     */
    public int getConstantBindingCount(
    ) {
        return this._constantBindingList.size();
    }

    /**
     * Method getEjbBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.EjbBinding at the
     * given index
     */
    public guice.xml.config.castorimpl.EjbBinding getEjbBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ejbBindingList.size()) {
            throw new IndexOutOfBoundsException("getEjbBinding: Index value '" + index + "' not in range [0.." + (this._ejbBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.EjbBinding) _ejbBindingList.get(index);
    }

    /**
     * Method getEjbBinding.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.EjbBinding[] getEjbBinding(
    ) {
        guice.xml.config.castorimpl.EjbBinding[] array = new guice.xml.config.castorimpl.EjbBinding[0];
        return (guice.xml.config.castorimpl.EjbBinding[]) this._ejbBindingList.toArray(array);
    }

    /**
     * Method getEjbBindingAsReference.Returns a reference to
     * '_ejbBindingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.EjbBinding> getEjbBindingAsReference(
    ) {
        return this._ejbBindingList;
    }

    /**
     * Method getEjbBindingCount.
     * 
     * @return the size of this collection
     */
    public int getEjbBindingCount(
    ) {
        return this._ejbBindingList.size();
    }

    /**
     * Method getInterceptorBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.InterceptorBinding at
     * the given index
     */
    public guice.xml.config.castorimpl.InterceptorBinding getInterceptorBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._interceptorBindingList.size()) {
            throw new IndexOutOfBoundsException("getInterceptorBinding: Index value '" + index + "' not in range [0.." + (this._interceptorBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.InterceptorBinding) _interceptorBindingList.get(index);
    }

    /**
     * Method getInterceptorBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.InterceptorBinding[] getInterceptorBinding(
    ) {
        guice.xml.config.castorimpl.InterceptorBinding[] array = new guice.xml.config.castorimpl.InterceptorBinding[0];
        return (guice.xml.config.castorimpl.InterceptorBinding[]) this._interceptorBindingList.toArray(array);
    }

    /**
     * Method getInterceptorBindingAsReference.Returns a reference
     * to '_interceptorBindingList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.InterceptorBinding> getInterceptorBindingAsReference(
    ) {
        return this._interceptorBindingList;
    }

    /**
     * Method getInterceptorBindingCount.
     * 
     * @return the size of this collection
     */
    public int getInterceptorBindingCount(
    ) {
        return this._interceptorBindingList.size();
    }

    /**
     * Method getJndiBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.JndiBinding at the
     * given index
     */
    public guice.xml.config.castorimpl.JndiBinding getJndiBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._jndiBindingList.size()) {
            throw new IndexOutOfBoundsException("getJndiBinding: Index value '" + index + "' not in range [0.." + (this._jndiBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.JndiBinding) _jndiBindingList.get(index);
    }

    /**
     * Method getJndiBinding.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.JndiBinding[] getJndiBinding(
    ) {
        guice.xml.config.castorimpl.JndiBinding[] array = new guice.xml.config.castorimpl.JndiBinding[0];
        return (guice.xml.config.castorimpl.JndiBinding[]) this._jndiBindingList.toArray(array);
    }

    /**
     * Method getJndiBindingAsReference.Returns a reference to
     * '_jndiBindingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.JndiBinding> getJndiBindingAsReference(
    ) {
        return this._jndiBindingList;
    }

    /**
     * Method getJndiBindingCount.
     * 
     * @return the size of this collection
     */
    public int getJndiBindingCount(
    ) {
        return this._jndiBindingList.size();
    }

    /**
     * Returns the value of field 'moduleDependencies'.
     * 
     * @return the value of field 'ModuleDependencies'.
     */
    public guice.xml.config.castorimpl.ModuleDependencies getModuleDependencies(
    ) {
        return this._moduleDependencies;
    }

    /**
     * Method getPropertiesBundleBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.PropertiesBundleBinding
     * at the given index
     */
    public guice.xml.config.castorimpl.PropertiesBundleBinding getPropertiesBundleBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertiesBundleBindingList.size()) {
            throw new IndexOutOfBoundsException("getPropertiesBundleBinding: Index value '" + index + "' not in range [0.." + (this._propertiesBundleBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.PropertiesBundleBinding) _propertiesBundleBindingList.get(index);
    }

    /**
     * Method getPropertiesBundleBinding.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.PropertiesBundleBinding[] getPropertiesBundleBinding(
    ) {
        guice.xml.config.castorimpl.PropertiesBundleBinding[] array = new guice.xml.config.castorimpl.PropertiesBundleBinding[0];
        return (guice.xml.config.castorimpl.PropertiesBundleBinding[]) this._propertiesBundleBindingList.toArray(array);
    }

    /**
     * Method getPropertiesBundleBindingAsReference.Returns a
     * reference to '_propertiesBundleBindingList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.PropertiesBundleBinding> getPropertiesBundleBindingAsReference(
    ) {
        return this._propertiesBundleBindingList;
    }

    /**
     * Method getPropertiesBundleBindingCount.
     * 
     * @return the size of this collection
     */
    public int getPropertiesBundleBindingCount(
    ) {
        return this._propertiesBundleBindingList.size();
    }

    /**
     * Method getProviderBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.ProviderBinding at
     * the given index
     */
    public guice.xml.config.castorimpl.ProviderBinding getProviderBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._providerBindingList.size()) {
            throw new IndexOutOfBoundsException("getProviderBinding: Index value '" + index + "' not in range [0.." + (this._providerBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.ProviderBinding) _providerBindingList.get(index);
    }

    /**
     * Method getProviderBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.ProviderBinding[] getProviderBinding(
    ) {
        guice.xml.config.castorimpl.ProviderBinding[] array = new guice.xml.config.castorimpl.ProviderBinding[0];
        return (guice.xml.config.castorimpl.ProviderBinding[]) this._providerBindingList.toArray(array);
    }

    /**
     * Method getProviderBindingAsReference.Returns a reference to
     * '_providerBindingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.ProviderBinding> getProviderBindingAsReference(
    ) {
        return this._providerBindingList;
    }

    /**
     * Method getProviderBindingCount.
     * 
     * @return the size of this collection
     */
    public int getProviderBindingCount(
    ) {
        return this._providerBindingList.size();
    }

    /**
     * Method getStaticInjection.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.StaticInjection at
     * the given index
     */
    public guice.xml.config.castorimpl.StaticInjection getStaticInjection(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._staticInjectionList.size()) {
            throw new IndexOutOfBoundsException("getStaticInjection: Index value '" + index + "' not in range [0.." + (this._staticInjectionList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.StaticInjection) _staticInjectionList.get(index);
    }

    /**
     * Method getStaticInjection.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.StaticInjection[] getStaticInjection(
    ) {
        guice.xml.config.castorimpl.StaticInjection[] array = new guice.xml.config.castorimpl.StaticInjection[0];
        return (guice.xml.config.castorimpl.StaticInjection[]) this._staticInjectionList.toArray(array);
    }

    /**
     * Method getStaticInjectionAsReference.Returns a reference to
     * '_staticInjectionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.StaticInjection> getStaticInjectionAsReference(
    ) {
        return this._staticInjectionList;
    }

    /**
     * Method getStaticInjectionCount.
     * 
     * @return the size of this collection
     */
    public int getStaticInjectionCount(
    ) {
        return this._staticInjectionList.size();
    }

    /**
     * Method getTrueSingletonBinding.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * guice.xml.config.xml.TrueSingletonBinding
     * at the given index
     */
    public guice.xml.config.castorimpl.TrueSingletonBinding getTrueSingletonBinding(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trueSingletonBindingList.size()) {
            throw new IndexOutOfBoundsException("getTrueSingletonBinding: Index value '" + index + "' not in range [0.." + (this._trueSingletonBindingList.size() - 1) + "]");
        }
        
        return (guice.xml.config.castorimpl.TrueSingletonBinding) _trueSingletonBindingList.get(index);
    }

    /**
     * Method getTrueSingletonBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public guice.xml.config.castorimpl.TrueSingletonBinding[] getTrueSingletonBinding(
    ) {
        guice.xml.config.castorimpl.TrueSingletonBinding[] array = new guice.xml.config.castorimpl.TrueSingletonBinding[0];
        return (guice.xml.config.castorimpl.TrueSingletonBinding[]) this._trueSingletonBindingList.toArray(array);
    }

    /**
     * Method getTrueSingletonBindingAsReference.Returns a
     * reference to '_trueSingletonBindingList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.Vector<guice.xml.config.castorimpl.TrueSingletonBinding> getTrueSingletonBindingAsReference(
    ) {
        return this._trueSingletonBindingList;
    }

    /**
     * Method getTrueSingletonBindingCount.
     * 
     * @return the size of this collection
     */
    public int getTrueSingletonBindingCount(
    ) {
        return this._trueSingletonBindingList.size();
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
    public void removeAllBinding(
    ) {
        this._bindingList.clear();
    }

    /**
     */
    public void removeAllConstantBinding(
    ) {
        this._constantBindingList.clear();
    }

    /**
     */
    public void removeAllEjbBinding(
    ) {
        this._ejbBindingList.clear();
    }

    /**
     */
    public void removeAllInterceptorBinding(
    ) {
        this._interceptorBindingList.clear();
    }

    /**
     */
    public void removeAllJndiBinding(
    ) {
        this._jndiBindingList.clear();
    }

    /**
     */
    public void removeAllPropertiesBundleBinding(
    ) {
        this._propertiesBundleBindingList.clear();
    }

    /**
     */
    public void removeAllProviderBinding(
    ) {
        this._providerBindingList.clear();
    }

    /**
     */
    public void removeAllStaticInjection(
    ) {
        this._staticInjectionList.clear();
    }

    /**
     */
    public void removeAllTrueSingletonBinding(
    ) {
        this._trueSingletonBindingList.clear();
    }

    /**
     * Method removeBinding.
     * 
     * @param vBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeBinding(
            final guice.xml.config.castorimpl.Binding vBinding) {
        boolean removed = _bindingList.remove(vBinding);
        return removed;
    }

    /**
     * Method removeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.Binding removeBindingAt(
            final int index) {
        java.lang.Object obj = this._bindingList.remove(index);
        return (guice.xml.config.castorimpl.Binding) obj;
    }

    /**
     * Method removeConstantBinding.
     * 
     * @param vConstantBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeConstantBinding(
            final guice.xml.config.castorimpl.ConstantBinding vConstantBinding) {
        boolean removed = _constantBindingList.remove(vConstantBinding);
        return removed;
    }

    /**
     * Method removeConstantBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.ConstantBinding removeConstantBindingAt(
            final int index) {
        java.lang.Object obj = this._constantBindingList.remove(index);
        return (guice.xml.config.castorimpl.ConstantBinding) obj;
    }

    /**
     * Method removeEjbBinding.
     * 
     * @param vEjbBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeEjbBinding(
            final guice.xml.config.castorimpl.EjbBinding vEjbBinding) {
        boolean removed = _ejbBindingList.remove(vEjbBinding);
        return removed;
    }

    /**
     * Method removeEjbBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.EjbBinding removeEjbBindingAt(
            final int index) {
        java.lang.Object obj = this._ejbBindingList.remove(index);
        return (guice.xml.config.castorimpl.EjbBinding) obj;
    }

    /**
     * Method removeInterceptorBinding.
     * 
     * @param vInterceptorBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeInterceptorBinding(
            final guice.xml.config.castorimpl.InterceptorBinding vInterceptorBinding) {
        boolean removed = _interceptorBindingList.remove(vInterceptorBinding);
        return removed;
    }

    /**
     * Method removeInterceptorBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.InterceptorBinding removeInterceptorBindingAt(
            final int index) {
        java.lang.Object obj = this._interceptorBindingList.remove(index);
        return (guice.xml.config.castorimpl.InterceptorBinding) obj;
    }

    /**
     * Method removeJndiBinding.
     * 
     * @param vJndiBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeJndiBinding(
            final guice.xml.config.castorimpl.JndiBinding vJndiBinding) {
        boolean removed = _jndiBindingList.remove(vJndiBinding);
        return removed;
    }

    /**
     * Method removeJndiBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.JndiBinding removeJndiBindingAt(
            final int index) {
        java.lang.Object obj = this._jndiBindingList.remove(index);
        return (guice.xml.config.castorimpl.JndiBinding) obj;
    }

    /**
     * Method removePropertiesBundleBinding.
     * 
     * @param vPropertiesBundleBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removePropertiesBundleBinding(
            final guice.xml.config.castorimpl.PropertiesBundleBinding vPropertiesBundleBinding) {
        boolean removed = _propertiesBundleBindingList.remove(vPropertiesBundleBinding);
        return removed;
    }

    /**
     * Method removePropertiesBundleBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.PropertiesBundleBinding removePropertiesBundleBindingAt(
            final int index) {
        java.lang.Object obj = this._propertiesBundleBindingList.remove(index);
        return (guice.xml.config.castorimpl.PropertiesBundleBinding) obj;
    }

    /**
     * Method removeProviderBinding.
     * 
     * @param vProviderBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeProviderBinding(
            final guice.xml.config.castorimpl.ProviderBinding vProviderBinding) {
        boolean removed = _providerBindingList.remove(vProviderBinding);
        return removed;
    }

    /**
     * Method removeProviderBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.ProviderBinding removeProviderBindingAt(
            final int index) {
        java.lang.Object obj = this._providerBindingList.remove(index);
        return (guice.xml.config.castorimpl.ProviderBinding) obj;
    }

    /**
     * Method removeStaticInjection.
     * 
     * @param vStaticInjection
     * @return true if the object was removed from the collection.
     */
    public boolean removeStaticInjection(
            final guice.xml.config.castorimpl.StaticInjection vStaticInjection) {
        boolean removed = _staticInjectionList.remove(vStaticInjection);
        return removed;
    }

    /**
     * Method removeStaticInjectionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.StaticInjection removeStaticInjectionAt(
            final int index) {
        java.lang.Object obj = this._staticInjectionList.remove(index);
        return (guice.xml.config.castorimpl.StaticInjection) obj;
    }

    /**
     * Method removeTrueSingletonBinding.
     * 
     * @param vTrueSingletonBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeTrueSingletonBinding(
            final guice.xml.config.castorimpl.TrueSingletonBinding vTrueSingletonBinding) {
        boolean removed = _trueSingletonBindingList.remove(vTrueSingletonBinding);
        return removed;
    }

    /**
     * Method removeTrueSingletonBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public guice.xml.config.castorimpl.TrueSingletonBinding removeTrueSingletonBindingAt(
            final int index) {
        java.lang.Object obj = this._trueSingletonBindingList.remove(index);
        return (guice.xml.config.castorimpl.TrueSingletonBinding) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBinding(
            final int index,
            final guice.xml.config.castorimpl.Binding vBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bindingList.size()) {
            throw new IndexOutOfBoundsException("setBinding: Index value '" + index + "' not in range [0.." + (this._bindingList.size() - 1) + "]");
        }
        
        this._bindingList.set(index, vBinding);
    }

    /**
     * 
     * 
     * @param vBindingArray
     */
    public void setBinding(
            final guice.xml.config.castorimpl.Binding[] vBindingArray) {
        //-- copy array
        _bindingList.clear();
        
        for (int i = 0; i < vBindingArray.length; i++) {
                this._bindingList.add(vBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_bindingList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vBindingList the Vector to copy.
     */
    public void setBinding(
            final java.util.Vector<guice.xml.config.castorimpl.Binding> vBindingList) {
        // copy vector
        this._bindingList.clear();
        
        this._bindingList.addAll(vBindingList);
    }

    /**
     * Sets the value of '_bindingList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param bindingVector the Vector to set.
     */
    public void setBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.Binding> bindingVector) {
        this._bindingList = bindingVector;
    }

    /**
     * Sets the value of field 'configName'.
     * 
     * @param configName the value of field 'configName'.
     */
    public void setConfigName(
            final java.lang.String configName) {
        this._configName = configName;
    }

    /**
     * 
     * 
     * @param index
     * @param vConstantBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setConstantBinding(
            final int index,
            final guice.xml.config.castorimpl.ConstantBinding vConstantBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._constantBindingList.size()) {
            throw new IndexOutOfBoundsException("setConstantBinding: Index value '" + index + "' not in range [0.." + (this._constantBindingList.size() - 1) + "]");
        }
        
        this._constantBindingList.set(index, vConstantBinding);
    }

    /**
     * 
     * 
     * @param vConstantBindingArray
     */
    public void setConstantBinding(
            final guice.xml.config.castorimpl.ConstantBinding[] vConstantBindingArray) {
        //-- copy array
        _constantBindingList.clear();
        
        for (int i = 0; i < vConstantBindingArray.length; i++) {
                this._constantBindingList.add(vConstantBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_constantBindingList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vConstantBindingList the Vector to copy.
     */
    public void setConstantBinding(
            final java.util.Vector<guice.xml.config.castorimpl.ConstantBinding> vConstantBindingList) {
        // copy vector
        this._constantBindingList.clear();
        
        this._constantBindingList.addAll(vConstantBindingList);
    }

    /**
     * Sets the value of '_constantBindingList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param constantBindingVector the Vector to set.
     */
    public void setConstantBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.ConstantBinding> constantBindingVector) {
        this._constantBindingList = constantBindingVector;
    }

    /**
     * 
     * 
     * @param index
     * @param vEjbBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEjbBinding(
            final int index,
            final guice.xml.config.castorimpl.EjbBinding vEjbBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ejbBindingList.size()) {
            throw new IndexOutOfBoundsException("setEjbBinding: Index value '" + index + "' not in range [0.." + (this._ejbBindingList.size() - 1) + "]");
        }
        
        this._ejbBindingList.set(index, vEjbBinding);
    }

    /**
     * 
     * 
     * @param vEjbBindingArray
     */
    public void setEjbBinding(
            final guice.xml.config.castorimpl.EjbBinding[] vEjbBindingArray) {
        //-- copy array
        _ejbBindingList.clear();
        
        for (int i = 0; i < vEjbBindingArray.length; i++) {
                this._ejbBindingList.add(vEjbBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_ejbBindingList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vEjbBindingList the Vector to copy.
     */
    public void setEjbBinding(
            final java.util.Vector<guice.xml.config.castorimpl.EjbBinding> vEjbBindingList) {
        // copy vector
        this._ejbBindingList.clear();
        
        this._ejbBindingList.addAll(vEjbBindingList);
    }

    /**
     * Sets the value of '_ejbBindingList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ejbBindingVector the Vector to set.
     */
    public void setEjbBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.EjbBinding> ejbBindingVector) {
        this._ejbBindingList = ejbBindingVector;
    }

    /**
     * 
     * 
     * @param index
     * @param vInterceptorBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInterceptorBinding(
            final int index,
            final guice.xml.config.castorimpl.InterceptorBinding vInterceptorBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._interceptorBindingList.size()) {
            throw new IndexOutOfBoundsException("setInterceptorBinding: Index value '" + index + "' not in range [0.." + (this._interceptorBindingList.size() - 1) + "]");
        }
        
        this._interceptorBindingList.set(index, vInterceptorBinding);
    }

    /**
     * 
     * 
     * @param vInterceptorBindingArray
     */
    public void setInterceptorBinding(
            final guice.xml.config.castorimpl.InterceptorBinding[] vInterceptorBindingArray) {
        //-- copy array
        _interceptorBindingList.clear();
        
        for (int i = 0; i < vInterceptorBindingArray.length; i++) {
                this._interceptorBindingList.add(vInterceptorBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_interceptorBindingList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vInterceptorBindingList the Vector to copy.
     */
    public void setInterceptorBinding(
            final java.util.Vector<guice.xml.config.castorimpl.InterceptorBinding> vInterceptorBindingList) {
        // copy vector
        this._interceptorBindingList.clear();
        
        this._interceptorBindingList.addAll(vInterceptorBindingList);
    }

    /**
     * Sets the value of '_interceptorBindingList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param interceptorBindingVector the Vector to set.
     */
    public void setInterceptorBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.InterceptorBinding> interceptorBindingVector) {
        this._interceptorBindingList = interceptorBindingVector;
    }

    /**
     * 
     * 
     * @param index
     * @param vJndiBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJndiBinding(
            final int index,
            final guice.xml.config.castorimpl.JndiBinding vJndiBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._jndiBindingList.size()) {
            throw new IndexOutOfBoundsException("setJndiBinding: Index value '" + index + "' not in range [0.." + (this._jndiBindingList.size() - 1) + "]");
        }
        
        this._jndiBindingList.set(index, vJndiBinding);
    }

    /**
     * 
     * 
     * @param vJndiBindingArray
     */
    public void setJndiBinding(
            final guice.xml.config.castorimpl.JndiBinding[] vJndiBindingArray) {
        //-- copy array
        _jndiBindingList.clear();
        
        for (int i = 0; i < vJndiBindingArray.length; i++) {
                this._jndiBindingList.add(vJndiBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_jndiBindingList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vJndiBindingList the Vector to copy.
     */
    public void setJndiBinding(
            final java.util.Vector<guice.xml.config.castorimpl.JndiBinding> vJndiBindingList) {
        // copy vector
        this._jndiBindingList.clear();
        
        this._jndiBindingList.addAll(vJndiBindingList);
    }

    /**
     * Sets the value of '_jndiBindingList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param jndiBindingVector the Vector to set.
     */
    public void setJndiBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.JndiBinding> jndiBindingVector) {
        this._jndiBindingList = jndiBindingVector;
    }

    /**
     * Sets the value of field 'moduleDependencies'.
     * 
     * @param moduleDependencies the value of field
     * 'moduleDependencies'.
     */
    public void setModuleDependencies(
            final guice.xml.config.castorimpl.ModuleDependencies moduleDependencies) {
        this._moduleDependencies = moduleDependencies;
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertiesBundleBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPropertiesBundleBinding(
            final int index,
            final guice.xml.config.castorimpl.PropertiesBundleBinding vPropertiesBundleBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertiesBundleBindingList.size()) {
            throw new IndexOutOfBoundsException("setPropertiesBundleBinding: Index value '" + index + "' not in range [0.." + (this._propertiesBundleBindingList.size() - 1) + "]");
        }
        
        this._propertiesBundleBindingList.set(index, vPropertiesBundleBinding);
    }

    /**
     * 
     * 
     * @param vPropertiesBundleBindingArray
     */
    public void setPropertiesBundleBinding(
            final guice.xml.config.castorimpl.PropertiesBundleBinding[] vPropertiesBundleBindingArray) {
        //-- copy array
        _propertiesBundleBindingList.clear();
        
        for (int i = 0; i < vPropertiesBundleBindingArray.length; i++) {
                this._propertiesBundleBindingList.add(vPropertiesBundleBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_propertiesBundleBindingList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vPropertiesBundleBindingList the Vector to copy.
     */
    public void setPropertiesBundleBinding(
            final java.util.Vector<guice.xml.config.castorimpl.PropertiesBundleBinding> vPropertiesBundleBindingList) {
        // copy vector
        this._propertiesBundleBindingList.clear();
        
        this._propertiesBundleBindingList.addAll(vPropertiesBundleBindingList);
    }

    /**
     * Sets the value of '_propertiesBundleBindingList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertiesBundleBindingVector the Vector to set.
     */
    public void setPropertiesBundleBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.PropertiesBundleBinding> propertiesBundleBindingVector) {
        this._propertiesBundleBindingList = propertiesBundleBindingVector;
    }

    /**
     * 
     * 
     * @param index
     * @param vProviderBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProviderBinding(
            final int index,
            final guice.xml.config.castorimpl.ProviderBinding vProviderBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._providerBindingList.size()) {
            throw new IndexOutOfBoundsException("setProviderBinding: Index value '" + index + "' not in range [0.." + (this._providerBindingList.size() - 1) + "]");
        }
        
        this._providerBindingList.set(index, vProviderBinding);
    }

    /**
     * 
     * 
     * @param vProviderBindingArray
     */
    public void setProviderBinding(
            final guice.xml.config.castorimpl.ProviderBinding[] vProviderBindingArray) {
        //-- copy array
        _providerBindingList.clear();
        
        for (int i = 0; i < vProviderBindingArray.length; i++) {
                this._providerBindingList.add(vProviderBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_providerBindingList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vProviderBindingList the Vector to copy.
     */
    public void setProviderBinding(
            final java.util.Vector<guice.xml.config.castorimpl.ProviderBinding> vProviderBindingList) {
        // copy vector
        this._providerBindingList.clear();
        
        this._providerBindingList.addAll(vProviderBindingList);
    }

    /**
     * Sets the value of '_providerBindingList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param providerBindingVector the Vector to set.
     */
    public void setProviderBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.ProviderBinding> providerBindingVector) {
        this._providerBindingList = providerBindingVector;
    }

    /**
     * 
     * 
     * @param index
     * @param vStaticInjection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStaticInjection(
            final int index,
            final guice.xml.config.castorimpl.StaticInjection vStaticInjection)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._staticInjectionList.size()) {
            throw new IndexOutOfBoundsException("setStaticInjection: Index value '" + index + "' not in range [0.." + (this._staticInjectionList.size() - 1) + "]");
        }
        
        this._staticInjectionList.set(index, vStaticInjection);
    }

    /**
     * 
     * 
     * @param vStaticInjectionArray
     */
    public void setStaticInjection(
            final guice.xml.config.castorimpl.StaticInjection[] vStaticInjectionArray) {
        //-- copy array
        _staticInjectionList.clear();
        
        for (int i = 0; i < vStaticInjectionArray.length; i++) {
                this._staticInjectionList.add(vStaticInjectionArray[i]);
        }
    }

    /**
     * Sets the value of '_staticInjectionList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vStaticInjectionList the Vector to copy.
     */
    public void setStaticInjection(
            final java.util.Vector<guice.xml.config.castorimpl.StaticInjection> vStaticInjectionList) {
        // copy vector
        this._staticInjectionList.clear();
        
        this._staticInjectionList.addAll(vStaticInjectionList);
    }

    /**
     * Sets the value of '_staticInjectionList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param staticInjectionVector the Vector to set.
     */
    public void setStaticInjectionAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.StaticInjection> staticInjectionVector) {
        this._staticInjectionList = staticInjectionVector;
    }

    /**
     * 
     * 
     * @param index
     * @param vTrueSingletonBinding
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTrueSingletonBinding(
            final int index,
            final guice.xml.config.castorimpl.TrueSingletonBinding vTrueSingletonBinding)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trueSingletonBindingList.size()) {
            throw new IndexOutOfBoundsException("setTrueSingletonBinding: Index value '" + index + "' not in range [0.." + (this._trueSingletonBindingList.size() - 1) + "]");
        }
        
        this._trueSingletonBindingList.set(index, vTrueSingletonBinding);
    }

    /**
     * 
     * 
     * @param vTrueSingletonBindingArray
     */
    public void setTrueSingletonBinding(
            final guice.xml.config.castorimpl.TrueSingletonBinding[] vTrueSingletonBindingArray) {
        //-- copy array
        _trueSingletonBindingList.clear();
        
        for (int i = 0; i < vTrueSingletonBindingArray.length; i++) {
                this._trueSingletonBindingList.add(vTrueSingletonBindingArray[i]);
        }
    }

    /**
     * Sets the value of '_trueSingletonBindingList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vTrueSingletonBindingList the Vector to copy.
     */
    public void setTrueSingletonBinding(
            final java.util.Vector<guice.xml.config.castorimpl.TrueSingletonBinding> vTrueSingletonBindingList) {
        // copy vector
        this._trueSingletonBindingList.clear();
        
        this._trueSingletonBindingList.addAll(vTrueSingletonBindingList);
    }

    /**
     * Sets the value of '_trueSingletonBindingList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param trueSingletonBindingVector the Vector to set.
     */
    public void setTrueSingletonBindingAsReference(
            final java.util.Vector<guice.xml.config.castorimpl.TrueSingletonBinding> trueSingletonBindingVector) {
        this._trueSingletonBindingList = trueSingletonBindingVector;
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
     * guice.xml.config.xml.GuiceConfiguration
     */
    public static guice.xml.config.castorimpl.GuiceConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (guice.xml.config.castorimpl.GuiceConfiguration) Unmarshaller.unmarshal(guice.xml.config.castorimpl.GuiceConfiguration.class, reader);
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
