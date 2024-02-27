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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send and receive PostgreSQL events via LISTEN and NOTIFY commands.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PgEventEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the PostgresSQL Event component.
     */
    public interface PgEventEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPgEventEndpointConsumerBuilder advanced() {
            return (AdvancedPgEventEndpointConsumerBuilder) this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * 
         * The option is a: &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param datasource the value to set
         * @return the dsl builder
         */
        default PgEventEndpointConsumerBuilder datasource(
                javax.sql.DataSource datasource) {
            doSetProperty("datasource", datasource);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param datasource the value to set
         * @return the dsl builder
         */
        default PgEventEndpointConsumerBuilder datasource(String datasource) {
            doSetProperty("datasource", datasource);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param pass the value to set
         * @return the dsl builder
         */
        default PgEventEndpointConsumerBuilder pass(String pass) {
            doSetProperty("pass", pass);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: postgres
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default PgEventEndpointConsumerBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the PostgresSQL Event
     * component.
     */
    public interface AdvancedPgEventEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default PgEventEndpointConsumerBuilder basic() {
            return (PgEventEndpointConsumerBuilder) this;
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
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the PostgresSQL Event component.
     */
    public interface PgEventEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPgEventEndpointProducerBuilder advanced() {
            return (AdvancedPgEventEndpointProducerBuilder) this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * 
         * The option is a: &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param datasource the value to set
         * @return the dsl builder
         */
        default PgEventEndpointProducerBuilder datasource(
                javax.sql.DataSource datasource) {
            doSetProperty("datasource", datasource);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param datasource the value to set
         * @return the dsl builder
         */
        default PgEventEndpointProducerBuilder datasource(String datasource) {
            doSetProperty("datasource", datasource);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param pass the value to set
         * @return the dsl builder
         */
        default PgEventEndpointProducerBuilder pass(String pass) {
            doSetProperty("pass", pass);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: postgres
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default PgEventEndpointProducerBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the PostgresSQL Event
     * component.
     */
    public interface AdvancedPgEventEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default PgEventEndpointProducerBuilder basic() {
            return (PgEventEndpointProducerBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPgEventEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the PostgresSQL Event component.
     */
    public interface PgEventEndpointBuilder
            extends
                PgEventEndpointConsumerBuilder,
                PgEventEndpointProducerBuilder {
        default AdvancedPgEventEndpointBuilder advanced() {
            return (AdvancedPgEventEndpointBuilder) this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * 
         * The option is a: &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param datasource the value to set
         * @return the dsl builder
         */
        default PgEventEndpointBuilder datasource(
                javax.sql.DataSource datasource) {
            doSetProperty("datasource", datasource);
            return this;
        }
        /**
         * To connect using the given javax.sql.DataSource instead of using
         * hostname and port.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param datasource the value to set
         * @return the dsl builder
         */
        default PgEventEndpointBuilder datasource(String datasource) {
            doSetProperty("datasource", datasource);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param pass the value to set
         * @return the dsl builder
         */
        default PgEventEndpointBuilder pass(String pass) {
            doSetProperty("pass", pass);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: postgres
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default PgEventEndpointBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PostgresSQL Event component.
     */
    public interface AdvancedPgEventEndpointBuilder
            extends
                AdvancedPgEventEndpointConsumerBuilder,
                AdvancedPgEventEndpointProducerBuilder {
        default PgEventEndpointBuilder basic() {
            return (PgEventEndpointBuilder) this;
        }
    }

    public interface PgEventBuilders {
        /**
         * PostgresSQL Event (camel-pgevent)
         * Send and receive PostgreSQL events via LISTEN and NOTIFY commands.
         * 
         * Category: database
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-pgevent
         * 
         * @return the dsl builder for the headers' name.
         */
        default PgEventHeaderNameBuilder pgevent() {
            return PgEventHeaderNameBuilder.INSTANCE;
        }
        /**
         * PostgresSQL Event (camel-pgevent)
         * Send and receive PostgreSQL events via LISTEN and NOTIFY commands.
         * 
         * Category: database
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-pgevent
         * 
         * Syntax: <code>pgevent:host:port/database/channel</code>
         * 
         * Path parameter: host
         * To connect using hostname and port to the database.
         * Default value: localhost
         * 
         * Path parameter: port
         * To connect using hostname and port to the database.
         * Default value: 5432
         * 
         * Path parameter: database (required)
         * The database name. The database name can take any characters because
         * it is sent as a quoted identifier. It is part of the endpoint URI, so
         * diacritical marks and non-Latin letters have to be URL encoded.
         * 
         * Path parameter: channel (required)
         * The channel name
         * 
         * @param path host:port/database/channel
         * @return the dsl builder
         */
        default PgEventEndpointBuilder pgevent(String path) {
            return PgEventEndpointBuilderFactory.endpointBuilder("pgevent", path);
        }
        /**
         * PostgresSQL Event (camel-pgevent)
         * Send and receive PostgreSQL events via LISTEN and NOTIFY commands.
         * 
         * Category: database
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-pgevent
         * 
         * Syntax: <code>pgevent:host:port/database/channel</code>
         * 
         * Path parameter: host
         * To connect using hostname and port to the database.
         * Default value: localhost
         * 
         * Path parameter: port
         * To connect using hostname and port to the database.
         * Default value: 5432
         * 
         * Path parameter: database (required)
         * The database name. The database name can take any characters because
         * it is sent as a quoted identifier. It is part of the endpoint URI, so
         * diacritical marks and non-Latin letters have to be URL encoded.
         * 
         * Path parameter: channel (required)
         * The channel name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port/database/channel
         * @return the dsl builder
         */
        default PgEventEndpointBuilder pgevent(String componentName, String path) {
            return PgEventEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the PostgresSQL Event component.
     */
    public static class PgEventHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final PgEventHeaderNameBuilder INSTANCE = new PgEventHeaderNameBuilder();

        /**
         * The name of the channel.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code channel}.
         */
        public String channel() {
            return "channel";
        }
    }
    static PgEventEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class PgEventEndpointBuilderImpl extends AbstractEndpointBuilder implements PgEventEndpointBuilder, AdvancedPgEventEndpointBuilder {
            public PgEventEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new PgEventEndpointBuilderImpl(path);
    }
}