/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mina;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class MinaConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public MinaConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, byte[].class, org.apache.mina.core.buffer.IoBuffer.class, false,
            (type, exchange, value) -> org.apache.camel.component.mina.MinaConverter.toByteArray((org.apache.mina.core.buffer.IoBuffer) value));
        addTypeConverter(registry, java.io.InputStream.class, org.apache.mina.core.buffer.IoBuffer.class, false,
            (type, exchange, value) -> org.apache.camel.component.mina.MinaConverter.toInputStream((org.apache.mina.core.buffer.IoBuffer) value));
        addTypeConverter(registry, java.io.ObjectInput.class, org.apache.mina.core.buffer.IoBuffer.class, false,
            (type, exchange, value) -> org.apache.camel.component.mina.MinaConverter.toObjectInput((org.apache.mina.core.buffer.IoBuffer) value));
        addTypeConverter(registry, java.lang.String.class, org.apache.mina.core.buffer.IoBuffer.class, false,
            (type, exchange, value) -> org.apache.camel.component.mina.MinaConverter.toString((org.apache.mina.core.buffer.IoBuffer) value, exchange));
        addTypeConverter(registry, org.apache.mina.core.buffer.IoBuffer.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.mina.MinaConverter.toIoBuffer((byte[]) value));
        addTypeConverter(registry, org.apache.mina.core.buffer.IoBuffer.class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.component.mina.MinaConverter.toIoBuffer((org.apache.camel.StreamCache) value, exchange));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }
}
