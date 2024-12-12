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
import org.apache.camel.component.langchain4j.chat.LangChain4jChatComponent;

/**
 * LangChain4j Chat component
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Langchain4jChatComponentBuilderFactory {

    /**
     * LangChain4j Chat (camel-langchain4j-chat)
     * LangChain4j Chat component
     * 
     * Category: ai
     * Since: 4.5
     * Maven coordinates: org.apache.camel:camel-langchain4j-chat
     * 
     * @return the dsl builder
     */
    static Langchain4jChatComponentBuilder langchain4jChat() {
        return new Langchain4jChatComponentBuilderImpl();
    }

    /**
     * Builder for the LangChain4j Chat component.
     */
    interface Langchain4jChatComponentBuilder extends ComponentBuilder<LangChain4jChatComponent> {
    
        
        /**
         * Operation in case of Endpoint of type CHAT. The value is one of the
         * values of
         * org.apache.camel.component.langchain4j.chat.LangChain4jChatOperations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.langchain4j.chat.LangChain4jChatOperations&lt;/code&gt; type.
         * 
         * Default: CHAT_SINGLE_MESSAGE
         * Group: common
         * 
         * @param chatOperation the value to set
         * @return the dsl builder
         */
        default Langchain4jChatComponentBuilder chatOperation(org.apache.camel.component.langchain4j.chat.LangChain4jChatOperations chatOperation) {
            doSetProperty("chatOperation", chatOperation);
            return this;
        }
    
        /**
         * The configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.langchain4j.chat.LangChain4jChatConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Langchain4jChatComponentBuilder configuration(org.apache.camel.component.langchain4j.chat.LangChain4jChatConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default Langchain4jChatComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default Langchain4jChatComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default Langchain4jChatComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * Chat Language Model of type
         * dev.langchain4j.model.chat.ChatLanguageModel.
         * 
         * The option is a:
         * &lt;code&gt;dev.langchain4j.model.chat.ChatLanguageModel&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param chatModel the value to set
         * @return the dsl builder
         */
        default Langchain4jChatComponentBuilder chatModel(dev.langchain4j.model.chat.ChatLanguageModel chatModel) {
            doSetProperty("chatModel", chatModel);
            return this;
        }
    }

    class Langchain4jChatComponentBuilderImpl
            extends AbstractComponentBuilder<LangChain4jChatComponent>
            implements Langchain4jChatComponentBuilder {
        @Override
        protected LangChain4jChatComponent buildConcreteComponent() {
            return new LangChain4jChatComponent();
        }
        private org.apache.camel.component.langchain4j.chat.LangChain4jChatConfiguration getOrCreateConfiguration(LangChain4jChatComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.langchain4j.chat.LangChain4jChatConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "chatOperation": getOrCreateConfiguration((LangChain4jChatComponent) component).setChatOperation((org.apache.camel.component.langchain4j.chat.LangChain4jChatOperations) value); return true;
            case "configuration": ((LangChain4jChatComponent) component).setConfiguration((org.apache.camel.component.langchain4j.chat.LangChain4jChatConfiguration) value); return true;
            case "bridgeErrorHandler": ((LangChain4jChatComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((LangChain4jChatComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((LangChain4jChatComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "chatModel": getOrCreateConfiguration((LangChain4jChatComponent) component).setChatModel((dev.langchain4j.model.chat.ChatLanguageModel) value); return true;
            default: return false;
            }
        }
    }
}