/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.soap;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.PackageDataFormatMojo")
@SuppressWarnings("unchecked")
public class SoapDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        SoapDataFormat dataformat = (SoapDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "version": dataformat.setVersion(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

