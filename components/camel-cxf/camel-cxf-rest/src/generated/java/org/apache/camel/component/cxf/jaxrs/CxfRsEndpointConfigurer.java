/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cxf.jaxrs;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class CxfRsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CxfRsEndpoint target = (CxfRsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "binding": target.setBinding(property(camelContext, org.apache.camel.component.cxf.jaxrs.CxfRsBinding.class, value)); return true;
        case "bindingstyle":
        case "bindingStyle": target.setBindingStyle(property(camelContext, org.apache.camel.component.cxf.jaxrs.BindingStyle.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "bus": target.setBus(property(camelContext, org.apache.cxf.Bus.class, value)); return true;
        case "continuationtimeout":
        case "continuationTimeout": target.setContinuationTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "cookiehandler":
        case "cookieHandler": target.setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "cxfrsconfigurer":
        case "cxfRsConfigurer": target.setCxfRsConfigurer(property(camelContext, org.apache.camel.component.cxf.jaxrs.CxfRsConfigurer.class, value)); return true;
        case "defaultbus":
        case "defaultBus": target.setDefaultBus(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "features": target.setFeatures(property(camelContext, java.util.List.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "hostnameverifier":
        case "hostnameVerifier": target.setHostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        case "httpclientapi":
        case "httpClientAPI": target.setHttpClientAPI(property(camelContext, boolean.class, value)); return true;
        case "ignoredeletemethodmessagebody":
        case "ignoreDeleteMethodMessageBody": target.setIgnoreDeleteMethodMessageBody(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loggingfeatureenabled":
        case "loggingFeatureEnabled": target.setLoggingFeatureEnabled(property(camelContext, boolean.class, value)); return true;
        case "loggingsizelimit":
        case "loggingSizeLimit": target.setLoggingSizeLimit(property(camelContext, int.class, value)); return true;
        case "maxclientcachesize":
        case "maxClientCacheSize": target.setMaxClientCacheSize(property(camelContext, int.class, value)); return true;
        case "modelref":
        case "modelRef": target.setModelRef(property(camelContext, java.lang.String.class, value)); return true;
        case "performinvocation":
        case "performInvocation": target.setPerformInvocation(property(camelContext, boolean.class, value)); return true;
        case "propagatecontexts":
        case "propagateContexts": target.setPropagateContexts(property(camelContext, boolean.class, value)); return true;
        case "providers": target.setProviders(property(camelContext, java.lang.String.class, value)); return true;
        case "publishedendpointurl":
        case "publishedEndpointUrl": target.setPublishedEndpointUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "resourceclasses":
        case "resourceClasses": target.setResourceClasses(property(camelContext, java.util.List.class, value)); return true;
        case "schemalocations":
        case "schemaLocations": target.setSchemaLocations(property(camelContext, java.util.List.class, value)); return true;
        case "servicebeans":
        case "serviceBeans": target.setServiceBeans(property(camelContext, java.lang.String.class, value)); return true;
        case "skipfaultlogging":
        case "skipFaultLogging": target.setSkipFaultLogging(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "binding": return org.apache.camel.component.cxf.jaxrs.CxfRsBinding.class;
        case "bindingstyle":
        case "bindingStyle": return org.apache.camel.component.cxf.jaxrs.BindingStyle.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "bus": return org.apache.cxf.Bus.class;
        case "continuationtimeout":
        case "continuationTimeout": return long.class;
        case "cookiehandler":
        case "cookieHandler": return org.apache.camel.http.base.cookie.CookieHandler.class;
        case "cxfrsconfigurer":
        case "cxfRsConfigurer": return org.apache.camel.component.cxf.jaxrs.CxfRsConfigurer.class;
        case "defaultbus":
        case "defaultBus": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "features": return java.util.List.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "hostnameverifier":
        case "hostnameVerifier": return javax.net.ssl.HostnameVerifier.class;
        case "httpclientapi":
        case "httpClientAPI": return boolean.class;
        case "ignoredeletemethodmessagebody":
        case "ignoreDeleteMethodMessageBody": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "loggingfeatureenabled":
        case "loggingFeatureEnabled": return boolean.class;
        case "loggingsizelimit":
        case "loggingSizeLimit": return int.class;
        case "maxclientcachesize":
        case "maxClientCacheSize": return int.class;
        case "modelref":
        case "modelRef": return java.lang.String.class;
        case "performinvocation":
        case "performInvocation": return boolean.class;
        case "propagatecontexts":
        case "propagateContexts": return boolean.class;
        case "providers": return java.lang.String.class;
        case "publishedendpointurl":
        case "publishedEndpointUrl": return java.lang.String.class;
        case "resourceclasses":
        case "resourceClasses": return java.util.List.class;
        case "schemalocations":
        case "schemaLocations": return java.util.List.class;
        case "servicebeans":
        case "serviceBeans": return java.lang.String.class;
        case "skipfaultlogging":
        case "skipFaultLogging": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CxfRsEndpoint target = (CxfRsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "binding": return target.getBinding();
        case "bindingstyle":
        case "bindingStyle": return target.getBindingStyle();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "bus": return target.getBus();
        case "continuationtimeout":
        case "continuationTimeout": return target.getContinuationTimeout();
        case "cookiehandler":
        case "cookieHandler": return target.getCookieHandler();
        case "cxfrsconfigurer":
        case "cxfRsConfigurer": return target.getCxfRsConfigurer();
        case "defaultbus":
        case "defaultBus": return target.isDefaultBus();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "features": return target.getFeatures();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "hostnameverifier":
        case "hostnameVerifier": return target.getHostnameVerifier();
        case "httpclientapi":
        case "httpClientAPI": return target.isHttpClientAPI();
        case "ignoredeletemethodmessagebody":
        case "ignoreDeleteMethodMessageBody": return target.isIgnoreDeleteMethodMessageBody();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loggingfeatureenabled":
        case "loggingFeatureEnabled": return target.isLoggingFeatureEnabled();
        case "loggingsizelimit":
        case "loggingSizeLimit": return target.getLoggingSizeLimit();
        case "maxclientcachesize":
        case "maxClientCacheSize": return target.getMaxClientCacheSize();
        case "modelref":
        case "modelRef": return target.getModelRef();
        case "performinvocation":
        case "performInvocation": return target.isPerformInvocation();
        case "propagatecontexts":
        case "propagateContexts": return target.isPropagateContexts();
        case "providers": return target.getProviders();
        case "publishedendpointurl":
        case "publishedEndpointUrl": return target.getPublishedEndpointUrl();
        case "resourceclasses":
        case "resourceClasses": return target.getResourceClasses();
        case "schemalocations":
        case "schemaLocations": return target.getSchemaLocations();
        case "servicebeans":
        case "serviceBeans": return target.getServiceBeans();
        case "skipfaultlogging":
        case "skipFaultLogging": return target.isSkipFaultLogging();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return target.isThrowExceptionOnFailure();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "features": return org.apache.cxf.feature.Feature.class;
        case "resourceclasses":
        case "resourceClasses": return java.lang.Class.class;
        case "schemalocations":
        case "schemaLocations": return java.lang.String.class;
        default: return null;
        }
    }
}

