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
 * Interact with InfluxDB v2, a time series database.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface InfluxDb2EndpointBuilderFactory {

    /**
     * Builder for endpoint for the InfluxDB2 component.
     */
    public interface InfluxDb2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedInfluxDb2EndpointBuilder advanced() {
            return (AdvancedInfluxDb2EndpointBuilder) this;
        }

        /**
         * Define if we want to auto create the bucket if it's not present.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param autoCreateBucket the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder autoCreateBucket(boolean autoCreateBucket) {
            doSetProperty("autoCreateBucket", autoCreateBucket);
            return this;
        }
        /**
         * Define if we want to auto create the bucket if it's not present.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param autoCreateBucket the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder autoCreateBucket(String autoCreateBucket) {
            doSetProperty("autoCreateBucket", autoCreateBucket);
            return this;
        }
        /**
         * Define if we want to auto create the organization if it's not
         * present.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param autoCreateOrg the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder autoCreateOrg(boolean autoCreateOrg) {
            doSetProperty("autoCreateOrg", autoCreateOrg);
            return this;
        }
        /**
         * Define if we want to auto create the organization if it's not
         * present.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param autoCreateOrg the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder autoCreateOrg(String autoCreateOrg) {
            doSetProperty("autoCreateOrg", autoCreateOrg);
            return this;
        }
        /**
         * The name of the bucket where the time series will be stored.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param bucket the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder bucket(String bucket) {
            doSetProperty("bucket", bucket);
            return this;
        }
        /**
         * Define if this operation is an insert of ping.
         * 
         * The option is a:
         * <code>org.apache.camel.component.influxdb2.enums.Operation</code>
         * type.
         * 
         * Default: INSERT
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder operation(org.apache.camel.component.influxdb2.enums.Operation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Define if this operation is an insert of ping.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.influxdb2.enums.Operation</code>
         * type.
         * 
         * Default: INSERT
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The name of the organization where the time series will be stored.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param org the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder org(String org) {
            doSetProperty("org", org);
            return this;
        }
        /**
         * Define the retention policy to the data created by the endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: default
         * Group: producer
         * 
         * @param retentionPolicy the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder retentionPolicy(String retentionPolicy) {
            doSetProperty("retentionPolicy", retentionPolicy);
            return this;
        }
        /**
         * The format or precision of time series timestamps.
         * 
         * The option is a:
         * <code>com.influxdb.client.domain.WritePrecision</code> type.
         * 
         * Default: ms
         * Group: producer
         * 
         * @param writePrecision the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder writePrecision(com.influxdb.client.domain.WritePrecision writePrecision) {
            doSetProperty("writePrecision", writePrecision);
            return this;
        }
        /**
         * The format or precision of time series timestamps.
         * 
         * The option will be converted to a
         * <code>com.influxdb.client.domain.WritePrecision</code> type.
         * 
         * Default: ms
         * Group: producer
         * 
         * @param writePrecision the value to set
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder writePrecision(String writePrecision) {
            doSetProperty("writePrecision", writePrecision);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the InfluxDB2 component.
     */
    public interface AdvancedInfluxDb2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default InfluxDb2EndpointBuilder basic() {
            return (InfluxDb2EndpointBuilder) this;
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedInfluxDb2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedInfluxDb2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface InfluxDb2Builders {
        /**
         * InfluxDB2 (camel-influxdb2)
         * Interact with InfluxDB v2, a time series database.
         * 
         * Category: database
         * Since: 3.20
         * Maven coordinates: org.apache.camel:camel-influxdb2
         * 
         * @return the dsl builder for the headers' name.
         */
        default InfluxDb2HeaderNameBuilder influxdb2() {
            return InfluxDb2HeaderNameBuilder.INSTANCE;
        }
        /**
         * InfluxDB2 (camel-influxdb2)
         * Interact with InfluxDB v2, a time series database.
         * 
         * Category: database
         * Since: 3.20
         * Maven coordinates: org.apache.camel:camel-influxdb2
         * 
         * Syntax: <code>influxdb2:connectionBean</code>
         * 
         * Path parameter: connectionBean (required)
         * Connection to the Influx database, of class
         * com.influxdb.client.InfluxDBClient.class.
         * 
         * @param path connectionBean
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder influxdb2(String path) {
            return InfluxDb2EndpointBuilderFactory.endpointBuilder("influxdb2", path);
        }
        /**
         * InfluxDB2 (camel-influxdb2)
         * Interact with InfluxDB v2, a time series database.
         * 
         * Category: database
         * Since: 3.20
         * Maven coordinates: org.apache.camel:camel-influxdb2
         * 
         * Syntax: <code>influxdb2:connectionBean</code>
         * 
         * Path parameter: connectionBean (required)
         * Connection to the Influx database, of class
         * com.influxdb.client.InfluxDBClient.class.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path connectionBean
         * @return the dsl builder
         */
        default InfluxDb2EndpointBuilder influxdb2(String componentName, String path) {
            return InfluxDb2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the InfluxDB2 component.
     */
    public static class InfluxDb2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final InfluxDb2HeaderNameBuilder INSTANCE = new InfluxDb2HeaderNameBuilder();

        /**
         * The name of measurement.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code InfluxDB2MeasurementName}.
         */
        public String influxDB2MeasurementName() {
            return "CamelInfluxDB2MeasurementName";
        }
        /**
         * The string that defines the retention policy to the data created by
         * the endpoint.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code InfluxDB.RetentionPolicy}.
         */
        public String influxdbRetentionpolicy() {
            return "camelInfluxDB.RetentionPolicy";
        }
        /**
         * InfluxDb Write precision.
         * 
         * The option is a: {@code com.influxdb.client.domain.WritePrecision}
         * type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code InfluxDB2WritePrecision}.
         */
        public String influxDB2WritePrecision() {
            return "CamelInfluxDB2WritePrecision";
        }
    }
    static InfluxDb2EndpointBuilder endpointBuilder(String componentName, String path) {
        class InfluxDb2EndpointBuilderImpl extends AbstractEndpointBuilder implements InfluxDb2EndpointBuilder, AdvancedInfluxDb2EndpointBuilder {
            public InfluxDb2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new InfluxDb2EndpointBuilderImpl(path);
    }
}