/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kafka;

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
public class KafkaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(105);
        props.add("additionalProperties");
        props.add("allowManualCommit");
        props.add("autoCommitEnable");
        props.add("autoCommitIntervalMs");
        props.add("autoOffsetReset");
        props.add("batchWithIndividualHeaders");
        props.add("breakOnFirstError");
        props.add("bridgeErrorHandler");
        props.add("brokers");
        props.add("bufferMemorySize");
        props.add("checkCrcs");
        props.add("clientId");
        props.add("commitTimeoutMs");
        props.add("compressionCodec");
        props.add("connectionMaxIdleMs");
        props.add("consumerRequestTimeoutMs");
        props.add("consumersCount");
        props.add("deliveryTimeoutMs");
        props.add("enableIdempotence");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("fetchMaxBytes");
        props.add("fetchMinBytes");
        props.add("fetchWaitMaxMs");
        props.add("groupId");
        props.add("groupInstanceId");
        props.add("headerDeserializer");
        props.add("headerFilterStrategy");
        props.add("headerSerializer");
        props.add("heartbeatIntervalMs");
        props.add("interceptorClasses");
        props.add("isolationLevel");
        props.add("kafkaClientFactory");
        props.add("kafkaManualCommitFactory");
        props.add("kerberosBeforeReloginMinTime");
        props.add("kerberosConfigLocation");
        props.add("kerberosInitCmd");
        props.add("kerberosPrincipalToLocalRules");
        props.add("kerberosRenewJitter");
        props.add("kerberosRenewWindowFactor");
        props.add("key");
        props.add("keyDeserializer");
        props.add("keySerializer");
        props.add("lazyStartProducer");
        props.add("lingerMs");
        props.add("maxBlockMs");
        props.add("maxInFlightRequest");
        props.add("maxPartitionFetchBytes");
        props.add("maxPollIntervalMs");
        props.add("maxPollRecords");
        props.add("maxRequestSize");
        props.add("metadataMaxAgeMs");
        props.add("metricReporters");
        props.add("metricsSampleWindowMs");
        props.add("noOfMetricsSample");
        props.add("offsetRepository");
        props.add("partitionAssignor");
        props.add("partitionKey");
        props.add("partitioner");
        props.add("partitionerIgnoreKeys");
        props.add("pollOnError");
        props.add("pollTimeoutMs");
        props.add("producerBatchSize");
        props.add("queueBufferingMaxMessages");
        props.add("receiveBufferBytes");
        props.add("reconnectBackoffMaxMs");
        props.add("reconnectBackoffMs");
        props.add("recordMetadata");
        props.add("requestRequiredAcks");
        props.add("requestTimeoutMs");
        props.add("retries");
        props.add("retryBackoffMs");
        props.add("saslJaasConfig");
        props.add("saslKerberosServiceName");
        props.add("saslMechanism");
        props.add("schemaRegistryURL");
        props.add("securityProtocol");
        props.add("seekTo");
        props.add("sendBufferBytes");
        props.add("sessionTimeoutMs");
        props.add("shutdownTimeout");
        props.add("specificAvroReader");
        props.add("sslCipherSuites");
        props.add("sslContextParameters");
        props.add("sslEnabledProtocols");
        props.add("sslEndpointAlgorithm");
        props.add("sslKeyPassword");
        props.add("sslKeymanagerAlgorithm");
        props.add("sslKeystoreLocation");
        props.add("sslKeystorePassword");
        props.add("sslKeystoreType");
        props.add("sslProtocol");
        props.add("sslProvider");
        props.add("sslTrustmanagerAlgorithm");
        props.add("sslTruststoreLocation");
        props.add("sslTruststorePassword");
        props.add("sslTruststoreType");
        props.add("synchronous");
        props.add("topic");
        props.add("topicIsPattern");
        props.add("valueDeserializer");
        props.add("valueSerializer");
        props.add("workerPool");
        props.add("workerPoolCoreSize");
        props.add("workerPoolMaxSize");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(4);
        secretProps.add("saslJaasConfig");
        secretProps.add("sslKeyPassword");
        secretProps.add("sslKeystorePassword");
        secretProps.add("sslTruststorePassword");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("additionalProperties.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "kafka".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
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

