/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package guice.xml.config.castorimpl.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import guice.xml.config.castorimpl.GuiceConfiguration;

/**
 * Class GuiceConfigurationDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class GuiceConfigurationDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public GuiceConfigurationDescriptor() {
        super();
        _xmlName = "guiceConfiguration";
        _elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- _configName
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_configName", "configName", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getConfigName();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.setConfigName( (java.lang.String) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _configName
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors
        
        //-- _moduleDependencies
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.ModuleDependencies.class, "_moduleDependencies", "moduleDependencies", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getModuleDependencies();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.setModuleDependencies( (guice.xml.config.castorimpl.ModuleDependencies) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.ModuleDependencies();
            }
        };
        desc.setSchemaType("guice.xml.config.xml.ModuleDependencies");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _moduleDependencies
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _bindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.Binding.class, "_bindingList", "binding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addBinding( (guice.xml.config.castorimpl.Binding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.Binding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.Binding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _bindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _jndiBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.JndiBinding.class, "_jndiBindingList", "jndiBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getJndiBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addJndiBinding( (guice.xml.config.castorimpl.JndiBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllJndiBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.JndiBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.JndiBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _jndiBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _ejbBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.EjbBinding.class, "_ejbBindingList", "ejbBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getEjbBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addEjbBinding( (guice.xml.config.castorimpl.EjbBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllEjbBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.EjbBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.EjbBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _ejbBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _trueSingletonBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.TrueSingletonBinding.class, "_trueSingletonBindingList", "trueSingletonBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getTrueSingletonBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addTrueSingletonBinding( (guice.xml.config.castorimpl.TrueSingletonBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllTrueSingletonBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.TrueSingletonBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.TrueSingletonBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _trueSingletonBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _providerBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.ProviderBinding.class, "_providerBindingList", "providerBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getProviderBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addProviderBinding( (guice.xml.config.castorimpl.ProviderBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllProviderBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.ProviderBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.ProviderBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _providerBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _interceptorBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.InterceptorBinding.class, "_interceptorBindingList", "interceptorBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getInterceptorBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addInterceptorBinding( (guice.xml.config.castorimpl.InterceptorBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllInterceptorBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.InterceptorBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.InterceptorBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _interceptorBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _constantBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.ConstantBinding.class, "_constantBindingList", "constantBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getConstantBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addConstantBinding( (guice.xml.config.castorimpl.ConstantBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllConstantBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.ConstantBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.ConstantBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _constantBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _propertiesBundleBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.PropertiesBundleBinding.class, "_propertiesBundleBindingList", "propertiesBundleBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getPropertiesBundleBinding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addPropertiesBundleBinding( (guice.xml.config.castorimpl.PropertiesBundleBinding) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllPropertiesBundleBinding();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.PropertiesBundleBinding();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.PropertiesBundleBinding");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _propertiesBundleBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _staticInjectionList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(guice.xml.config.castorimpl.StaticInjection.class, "_staticInjectionList", "staticInjection", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GuiceConfiguration target = (GuiceConfiguration) object;
                return target.getStaticInjection();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.addStaticInjection( (guice.xml.config.castorimpl.StaticInjection) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GuiceConfiguration target = (GuiceConfiguration) object;
                    target.removeAllStaticInjection();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new guice.xml.config.castorimpl.StaticInjection();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("guice.xml.config.xml.StaticInjection");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _staticInjectionList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return guice.xml.config.castorimpl.GuiceConfiguration.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
