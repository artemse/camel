/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.servlet.ServletEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketEndpointConfigurer extends ServletEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, boolean.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("bridgeEndpoint", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("sendToAll", boolean.class);
        answer.put("useStreaming", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeendpoint":
        case "bridgeEndpoint": return target.isBridgeEndpoint();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sendtoall":
        case "sendToAll": return target.isSendToAll();
        case "usestreaming":
        case "useStreaming": return target.isUseStreaming();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

