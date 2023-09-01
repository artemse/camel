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
 * Send e-mails through AWS SES service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Ses2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Simple Email Service (SES) component.
     */
    public interface Ses2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSes2EndpointBuilder advanced() {
            return (AdvancedSes2EndpointBuilder) this;
        }
        /**
         * List of comma separated destination blind carbon copy (bcc) email
         * address. Can be overridden with 'CamelAwsSesBcc' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param bcc the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder bcc(String bcc) {
            doSetProperty("bcc", bcc);
            return this;
        }
        /**
         * List of comma separated destination carbon copy (cc) email address.
         * Can be overridden with 'CamelAwsSesCc' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param cc the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder cc(String cc) {
            doSetProperty("cc", cc);
            return this;
        }
        /**
         * Set the configuration set to send with every request. Override it
         * with 'CamelAwsSesConfigurationSet' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configurationSet the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder configurationSet(String configurationSet) {
            doSetProperty("configurationSet", configurationSet);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * List of comma separated reply-to email address(es) for the message,
         * override it using 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param replyToAddresses the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder replyToAddresses(String replyToAddresses) {
            doSetProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param returnPath the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder returnPath(String returnPath) {
            doSetProperty("returnPath", returnPath);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * List of comma separated destination email address. Can be overridden
         * with 'CamelAwsSesTo' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param to the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder to(String to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SES client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder profileCredentialsName(
                String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Ses client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Ses client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the SES client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the SES client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Ses2EndpointBuilder useProfileCredentialsProvider(
                String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Simple Email Service (SES)
     * component.
     */
    public interface AdvancedSes2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Ses2EndpointBuilder basic() {
            return (Ses2EndpointBuilder) this;
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
        default AdvancedSes2EndpointBuilder lazyStartProducer(
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
        default AdvancedSes2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.ses.SesClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param amazonSESClient the value to set
         * @return the dsl builder
         */
        default AdvancedSes2EndpointBuilder amazonSESClient(
                software.amazon.awssdk.services.ses.SesClient amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.ses.SesClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param amazonSESClient the value to set
         * @return the dsl builder
         */
        default AdvancedSes2EndpointBuilder amazonSESClient(
                String amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
    }

    public interface Ses2Builders {
        /**
         * AWS Simple Email Service (SES) (camel-aws2-ses)
         * Send e-mails through AWS SES service.
         * 
         * Category: cloud,mail
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ses
         * 
         * @return the dsl builder for the headers' name.
         */
        default Ses2HeaderNameBuilder aws2Ses() {
            return Ses2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS Simple Email Service (SES) (camel-aws2-ses)
         * Send e-mails through AWS SES service.
         * 
         * Category: cloud,mail
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ses
         * 
         * Syntax: <code>aws2-ses:from</code>
         * 
         * Path parameter: from (required)
         * The sender's email address.
         * 
         * @param path from
         * @return the dsl builder
         */
        default Ses2EndpointBuilder aws2Ses(String path) {
            return Ses2EndpointBuilderFactory.endpointBuilder("aws2-ses", path);
        }
        /**
         * AWS Simple Email Service (SES) (camel-aws2-ses)
         * Send e-mails through AWS SES service.
         * 
         * Category: cloud,mail
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ses
         * 
         * Syntax: <code>aws2-ses:from</code>
         * 
         * Path parameter: from (required)
         * The sender's email address.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path from
         * @return the dsl builder
         */
        default Ses2EndpointBuilder aws2Ses(String componentName, String path) {
            return Ses2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS Simple Email Service (SES)
     * component.
     */
    public static class Ses2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final Ses2HeaderNameBuilder INSTANCE = new Ses2HeaderNameBuilder();

        /**
         * The sender's email address.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesFrom}.
         */
        public String awsSesFrom() {
            return "AwsSesFrom";
        }

        /**
         * The Amazon SES message ID.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesMessageId}.
         */
        public String awsSesMessageId() {
            return "AwsSesMessageId";
        }

        /**
         * The reply-to email address(es) for the message. Use comma to separate
         * multiple values.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesReplyToAddresses}.
         */
        public String awsSesReplyToAddresses() {
            return "AwsSesReplyToAddresses";
        }

        /**
         * The email address to which bounce notifications are to be forwarded.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesReturnPath}.
         */
        public String awsSesReturnPath() {
            return "AwsSesReturnPath";
        }

        /**
         * The subject of the message.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesSubject}.
         */
        public String awsSesSubject() {
            return "AwsSesSubject";
        }

        /**
         * List of comma separated destination email address.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesTo}.
         */
        public String awsSesTo() {
            return "AwsSesTo";
        }

        /**
         * List of comma separated destination carbon copy (cc) email address.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesCc}.
         */
        public String awsSesCc() {
            return "AwsSesCc";
        }

        /**
         * List of comma separated destination blind carbon copy (bcc) email
         * address.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesBcc}.
         */
        public String awsSesBcc() {
            return "AwsSesBcc";
        }

        /**
         * The flag to show if email content is HTML.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesHtmlEmail}.
         */
        public String awsSesHtmlEmail() {
            return "AwsSesHtmlEmail";
        }

        /**
         * TThe configuration set to send.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsSesConfigurationSet}.
         */
        public String awsSesConfigurationSet() {
            return "AwsSesConfigurationSet";
        }
    }
    static Ses2EndpointBuilder endpointBuilder(String componentName, String path) {
        class Ses2EndpointBuilderImpl extends AbstractEndpointBuilder implements Ses2EndpointBuilder, AdvancedSes2EndpointBuilder {
            public Ses2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Ses2EndpointBuilderImpl(path);
    }
}