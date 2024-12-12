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
 * Access OpenStack Swift object/blob store.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SwiftEndpointBuilderFactory {

    /**
     * Builder for endpoint for the OpenStack Swift component.
     */
    public interface SwiftEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSwiftEndpointBuilder advanced() {
            return (AdvancedSwiftEndpointBuilder) this;
        }

        /**
         * OpenStack API version.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: V3
         * Group: producer
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option is a: <code>org.openstack4j.core.transport.Config</code>
         * type.
         * 
         * Group: producer
         * 
         * @param config the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder config(org.openstack4j.core.transport.Config config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option will be converted to a
         * <code>org.openstack4j.core.transport.Config</code> type.
         * 
         * Group: producer
         * 
         * @param config the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder config(String config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * Authentication domain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: default
         * Group: producer
         * 
         * @param domain the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder domain(String domain) {
            doSetProperty("domain", domain);
            return this;
        }
        /**
         * The operation to do.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * OpenStack password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The project ID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param project the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder project(String project) {
            doSetProperty("project", project);
            return this;
        }
        /**
         * OpenStack Swift subsystem.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param subsystem the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder subsystem(String subsystem) {
            doSetProperty("subsystem", subsystem);
            return this;
        }
        /**
         * OpenStack username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default SwiftEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OpenStack Swift component.
     */
    public interface AdvancedSwiftEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SwiftEndpointBuilder basic() {
            return (SwiftEndpointBuilder) this;
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
        default AdvancedSwiftEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedSwiftEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SwiftBuilders {
        /**
         * OpenStack Swift (camel-openstack)
         * Access OpenStack Swift object/blob store.
         * 
         * Category: container
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * @return the dsl builder for the headers' name.
         */
        default SwiftHeaderNameBuilder openstackSwift() {
            return SwiftHeaderNameBuilder.INSTANCE;
        }
        /**
         * OpenStack Swift (camel-openstack)
         * Access OpenStack Swift object/blob store.
         * 
         * Category: container
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * Syntax: <code>openstack-swift:host</code>
         * 
         * Path parameter: host (required)
         * OpenStack host url
         * 
         * @param path host
         * @return the dsl builder
         */
        default SwiftEndpointBuilder openstackSwift(String path) {
            return SwiftEndpointBuilderFactory.endpointBuilder("openstack-swift", path);
        }
        /**
         * OpenStack Swift (camel-openstack)
         * Access OpenStack Swift object/blob store.
         * 
         * Category: container
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-openstack
         * 
         * Syntax: <code>openstack-swift:host</code>
         * 
         * Path parameter: host (required)
         * OpenStack host url
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host
         * @return the dsl builder
         */
        default SwiftEndpointBuilder openstackSwift(String componentName, String path) {
            return SwiftEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the OpenStack Swift component.
     */
    public static class SwiftHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final SwiftHeaderNameBuilder INSTANCE = new SwiftHeaderNameBuilder();

        /**
         * The container name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: object container
         * 
         * @return the name of the header {@code containerName}.
         */
        public String containerName() {
            return "containerName";
        }
        /**
         * The object name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: object
         * 
         * @return the name of the header {@code objectName}.
         */
        public String objectName() {
            return "objectName";
        }
        /**
         * Container metadata prefix.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code X-Container-Meta-}.
         */
        public String xContainerMeta() {
            return "X-Container-Meta-";
        }
        /**
         * Versions location.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code X-Versions-Location}.
         */
        public String xVersionsLocation() {
            return "X-Versions-Location";
        }
        /**
         * ACL - container read.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code X-Container-Read}.
         */
        public String xContainerRead() {
            return "X-Container-Read";
        }
        /**
         * ACL - container write.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code X-Container-Write}.
         */
        public String xContainerWrite() {
            return "X-Container-Write";
        }
        /**
         * List options - limit.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code limit}.
         */
        public String limit() {
            return "limit";
        }
        /**
         * List options - marker.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code marker}.
         */
        public String marker() {
            return "marker";
        }
        /**
         * List options - end marker.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code end_marker}.
         */
        public String endMarker() {
            return "end_marker";
        }
        /**
         * List options - delimiter.
         * 
         * The option is a: {@code Character} type.
         * 
         * Group: container
         * 
         * @return the name of the header {@code delimiter}.
         */
        public String delimiter() {
            return "delimiter";
        }
        /**
         * The path.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: container object
         * 
         * @return the name of the header {@code path}.
         */
        public String path() {
            return "path";
        }
        /**
         * The operation to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code operation}.
         */
        public String operation() {
            return "operation";
        }
        /**
         * The ID.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ID}.
         */
        public String iD() {
            return "ID";
        }
        /**
         * The name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code name}.
         */
        public String name() {
            return "name";
        }
    }
    static SwiftEndpointBuilder endpointBuilder(String componentName, String path) {
        class SwiftEndpointBuilderImpl extends AbstractEndpointBuilder implements SwiftEndpointBuilder, AdvancedSwiftEndpointBuilder {
            public SwiftEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SwiftEndpointBuilderImpl(path);
    }
}