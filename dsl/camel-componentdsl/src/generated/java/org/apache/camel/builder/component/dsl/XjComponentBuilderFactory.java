/* Generated by camel build tools - do NOT edit this file! */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.xj.XJComponent;

/**
 * Transform JSON and XML message using a XSLT.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface XjComponentBuilderFactory {

    /**
     * XJ (camel-xj)
     * Transform JSON and XML message using a XSLT.
     * 
     * Category: transformation
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-xj
     * 
     * @return the dsl builder
     */
    static XjComponentBuilder xj() {
        return new XjComponentBuilderImpl();
    }

    /**
     * Builder for the XJ component.
     */
    interface XjComponentBuilder extends ComponentBuilder<XJComponent> {
    
        
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder allowTemplateFromHeader(boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
    
        
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
    
        
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * To use a custom Saxon configuration.
         * 
         * The option is a: &lt;code&gt;net.sf.saxon.Configuration&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param saxonConfiguration the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder saxonConfiguration(net.sf.saxon.Configuration saxonConfiguration) {
            doSetProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
    
        /**
         * To set custom Saxon configuration properties.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param saxonConfigurationProperties the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder saxonConfigurationProperties(java.util.Map<java.lang.String, java.lang.Object> saxonConfigurationProperties) {
            doSetProperty("saxonConfigurationProperties", saxonConfigurationProperties);
            return this;
        }
    
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can use commas to separate multiple values to
         * lookup.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param saxonExtensionFunctions the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder saxonExtensionFunctions(java.lang.String saxonExtensionFunctions) {
            doSetProperty("saxonExtensionFunctions", saxonExtensionFunctions);
            return this;
        }
    
        
        /**
         * Feature for XML secure processing (see javax.xml.XMLConstants). This
         * is enabled by default. However, when using Saxon Professional you may
         * need to turn this off to allow Saxon to be able to use Java extension
         * functions.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param secureProcessing the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder secureProcessing(boolean secureProcessing) {
            doSetProperty("secureProcessing", secureProcessing);
            return this;
        }
    
        /**
         * To use a custom XSLT transformer factory, specified as a FQN class
         * name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryClass the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder transformerFactoryClass(java.lang.String transformerFactoryClass) {
            doSetProperty("transformerFactoryClass", transformerFactoryClass);
            return this;
        }
    
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryConfigurationStrategy the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder transformerFactoryConfigurationStrategy(org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
    
        /**
         * To use a custom UriResolver. Should not be used together with the
         * option 'uriResolverFactory'.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.transform.URIResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolver the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder uriResolver(javax.xml.transform.URIResolver uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
    
        /**
         * To use a custom UriResolver which depends on a dynamic endpoint
         * resource URI. Should not be used together with the option
         * 'uriResolver'.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.XsltUriResolverFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolverFactory the value to set
         * @return the dsl builder
         */
        default XjComponentBuilder uriResolverFactory(org.apache.camel.component.xslt.XsltUriResolverFactory uriResolverFactory) {
            doSetProperty("uriResolverFactory", uriResolverFactory);
            return this;
        }
    }

    class XjComponentBuilderImpl
            extends AbstractComponentBuilder<XJComponent>
            implements XjComponentBuilder {
        @Override
        protected XJComponent buildConcreteComponent() {
            return new XJComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "allowTemplateFromHeader": ((XJComponent) component).setAllowTemplateFromHeader((boolean) value); return true;
            case "contentCache": ((XJComponent) component).setContentCache((boolean) value); return true;
            case "lazyStartProducer": ((XJComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((XJComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "saxonConfiguration": ((XJComponent) component).setSaxonConfiguration((net.sf.saxon.Configuration) value); return true;
            case "saxonConfigurationProperties": ((XJComponent) component).setSaxonConfigurationProperties((java.util.Map) value); return true;
            case "saxonExtensionFunctions": ((XJComponent) component).setSaxonExtensionFunctions((java.lang.String) value); return true;
            case "secureProcessing": ((XJComponent) component).setSecureProcessing((boolean) value); return true;
            case "transformerFactoryClass": ((XJComponent) component).setTransformerFactoryClass((java.lang.String) value); return true;
            case "transformerFactoryConfigurationStrategy": ((XJComponent) component).setTransformerFactoryConfigurationStrategy((org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy) value); return true;
            case "uriResolver": ((XJComponent) component).setUriResolver((javax.xml.transform.URIResolver) value); return true;
            case "uriResolverFactory": ((XJComponent) component).setUriResolverFactory((org.apache.camel.component.xslt.XsltUriResolverFactory) value); return true;
            default: return false;
            }
        }
    }
}