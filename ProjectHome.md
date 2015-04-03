A library which allows XML to be used in addition to Java as the configuration for [Google Guice](http://code.google.com/p/google-guice).  Allowing configuration changes without the need to recompile.  This can be useful where you realise a stub should be swapped in, or you need to run different code depending on the deployment target.  It also provides some extra features like 'True Cross Injector Singletons'

Bindings are expressed in an XML file or multiple linked XML files.  A method is also provided so that XML and Java can be used together - this is currently useful where the XML configuration doesn't support a binding that you may want to use.

Check out the FeatureList and the ToDo list.

### A Simple Binding example with single implementation binding, constant and properties bundle ###
```
<?xml version="1.0" encoding="UTF-8"?>
<guiceConfiguration configName="" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:noNamespaceSchemaLocation="../src/main/resources/guice-config.xsd">
  <binding>
    <Interface>guice.xml.config.test.dummys.BasicServiceIF</Interface>
    <Implementation>guice.xml.config.test.dummys.BasicServiceImpl</Implementation>
  </binding>
  <constantBinding>
    <ConstantName>hibernateConfigFile</ConstantName>
    <ConstantValue>hibernate-extended.cfg.xml</ConstantValue>
  </constantBinding>
  <propertiesBundleBinding bundleName="applicationOptions">
    <property name="responseLoggingEnabled">true</property>
    <property name="errorThreshold">5</property>
    <property name="alertFile">alerts.log</property>
  </propertiesBundleBinding>
</guiceConfiguration>
```