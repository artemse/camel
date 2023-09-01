/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xj;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class XJEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(20);
        props.add("allowStAX");
        props.add("contentCache");
        props.add("deleteOutputFile");
        props.add("entityResolver");
        props.add("errorListener");
        props.add("failOnNullBody");
        props.add("lazyStartProducer");
        props.add("output");
        props.add("resourceUri");
        props.add("resultHandlerFactory");
        props.add("saxonConfiguration");
        props.add("saxonExtensionFunctions");
        props.add("secureProcessing");
        props.add("transformDirection");
        props.add("transformerCacheSize");
        props.add("transformerFactory");
        props.add("transformerFactoryClass");
        props.add("transformerFactoryConfigurationStrategy");
        props.add("uriResolver");
        props.add("xsltMessageLogger");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "xj".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "resourceUri", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

