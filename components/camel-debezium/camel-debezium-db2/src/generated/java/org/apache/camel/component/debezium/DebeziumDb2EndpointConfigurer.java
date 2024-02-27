/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumDb2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumDb2Endpoint target = (DebeziumDb2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnexcludelist":
        case "columnExcludeList": target.getConfiguration().setColumnExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnincludelist":
        case "columnIncludeList": target.getConfiguration().setColumnIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": target.getConfiguration().setColumnPropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "converters": target.getConfiguration().setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "custommetrictags":
        case "customMetricTags": target.getConfiguration().setCustomMetricTags(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": target.getConfiguration().setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": target.getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": target.getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": target.getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseuser":
        case "databaseUser": target.getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": target.getConfiguration().setDatatypePropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": target.getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "errorsmaxretries":
        case "errorsMaxRetries": target.getConfiguration().setErrorsMaxRetries(property(camelContext, int.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": target.getConfiguration().setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includeschemachanges":
        case "includeSchemaChanges": target.getConfiguration().setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": target.getConfiguration().setIncrementalSnapshotChunkSize(property(camelContext, int.class, value)); return true;
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": target.getConfiguration().setIncrementalSnapshotWatermarkingStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": target.getConfiguration().setMaxQueueSizeInBytes(property(camelContext, long.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": target.getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationenabledchannels":
        case "notificationEnabledChannels": target.getConfiguration().setNotificationEnabledChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationsinktopicname":
        case "notificationSinkTopicName": target.getConfiguration().setNotificationSinkTopicName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "postprocessors":
        case "postProcessors": target.getConfiguration().setPostProcessors(property(camelContext, java.lang.String.class, value)); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": target.getConfiguration().setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "queryfetchsize":
        case "queryFetchSize": target.getConfiguration().setQueryFetchSize(property(camelContext, int.class, value)); return true;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": target.getConfiguration().setRetriableRestartConnectorWaitMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "schemahistoryinternal":
        case "schemaHistoryInternal": target.getConfiguration().setSchemaHistoryInternal(property(camelContext, java.lang.String.class, value)); return true;
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": target.getConfiguration().setSchemaHistoryInternalFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "schemahistoryinternalskipunparseableddl":
        case "schemaHistoryInternalSkipUnparseableDdl": target.getConfiguration().setSchemaHistoryInternalSkipUnparseableDdl(property(camelContext, boolean.class, value)); return true;
        case "schemahistoryinternalstoreonlycaptureddatabasesddl":
        case "schemaHistoryInternalStoreOnlyCapturedDatabasesDdl": target.getConfiguration().setSchemaHistoryInternalStoreOnlyCapturedDatabasesDdl(property(camelContext, boolean.class, value)); return true;
        case "schemahistoryinternalstoreonlycapturedtablesddl":
        case "schemaHistoryInternalStoreOnlyCapturedTablesDdl": target.getConfiguration().setSchemaHistoryInternalStoreOnlyCapturedTablesDdl(property(camelContext, boolean.class, value)); return true;
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": target.getConfiguration().setSchemaNameAdjustmentMode(property(camelContext, java.lang.String.class, value)); return true;
        case "signaldatacollection":
        case "signalDataCollection": target.getConfiguration().setSignalDataCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "signalenabledchannels":
        case "signalEnabledChannels": target.getConfiguration().setSignalEnabledChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "signalpollintervalms":
        case "signalPollIntervalMs": target.getConfiguration().setSignalPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "skippedoperations":
        case "skippedOperations": target.getConfiguration().setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": target.getConfiguration().setSnapshotIncludeCollectionList(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": target.getConfiguration().setSnapshotLockTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": target.getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshottablesorderbyrowcount":
        case "snapshotTablesOrderByRowCount": target.getConfiguration().setSnapshotTablesOrderByRowCount(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": target.getConfiguration().setSourceinfoStructMaker(property(camelContext, java.lang.String.class, value)); return true;
        case "tableexcludelist":
        case "tableExcludeList": target.getConfiguration().setTableExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": target.getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tableincludelist":
        case "tableIncludeList": target.getConfiguration().setTableIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": target.getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        case "topicnamingstrategy":
        case "topicNamingStrategy": target.getConfiguration().setTopicNamingStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "topicprefix":
        case "topicPrefix": target.getConfiguration().setTopicPrefix(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.util.Map.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "columnexcludelist":
        case "columnExcludeList": return java.lang.String.class;
        case "columnincludelist":
        case "columnIncludeList": return java.lang.String.class;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return java.lang.String.class;
        case "converters": return java.lang.String.class;
        case "custommetrictags":
        case "customMetricTags": return java.lang.String.class;
        case "databasedbname":
        case "databaseDbname": return java.lang.String.class;
        case "databasehostname":
        case "databaseHostname": return java.lang.String.class;
        case "databasepassword":
        case "databasePassword": return java.lang.String.class;
        case "databaseport":
        case "databasePort": return int.class;
        case "databaseuser":
        case "databaseUser": return java.lang.String.class;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return java.lang.String.class;
        case "decimalhandlingmode":
        case "decimalHandlingMode": return java.lang.String.class;
        case "errorsmaxretries":
        case "errorsMaxRetries": return int.class;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return java.lang.String.class;
        case "includeschemachanges":
        case "includeSchemaChanges": return boolean.class;
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": return int.class;
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": return java.lang.String.class;
        case "internalkeyconverter":
        case "internalKeyConverter": return java.lang.String.class;
        case "internalvalueconverter":
        case "internalValueConverter": return java.lang.String.class;
        case "maxbatchsize":
        case "maxBatchSize": return int.class;
        case "maxqueuesize":
        case "maxQueueSize": return int.class;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return long.class;
        case "messagekeycolumns":
        case "messageKeyColumns": return java.lang.String.class;
        case "notificationenabledchannels":
        case "notificationEnabledChannels": return java.lang.String.class;
        case "notificationsinktopicname":
        case "notificationSinkTopicName": return java.lang.String.class;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return java.lang.String.class;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return long.class;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return long.class;
        case "offsetstorage":
        case "offsetStorage": return java.lang.String.class;
        case "offsetstoragefilename":
        case "offsetStorageFileName": return java.lang.String.class;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return int.class;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return int.class;
        case "offsetstoragetopic":
        case "offsetStorageTopic": return java.lang.String.class;
        case "pollintervalms":
        case "pollIntervalMs": return long.class;
        case "postprocessors":
        case "postProcessors": return java.lang.String.class;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return boolean.class;
        case "queryfetchsize":
        case "queryFetchSize": return int.class;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return long.class;
        case "schemahistoryinternal":
        case "schemaHistoryInternal": return java.lang.String.class;
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": return java.lang.String.class;
        case "schemahistoryinternalskipunparseableddl":
        case "schemaHistoryInternalSkipUnparseableDdl": return boolean.class;
        case "schemahistoryinternalstoreonlycaptureddatabasesddl":
        case "schemaHistoryInternalStoreOnlyCapturedDatabasesDdl": return boolean.class;
        case "schemahistoryinternalstoreonlycapturedtablesddl":
        case "schemaHistoryInternalStoreOnlyCapturedTablesDdl": return boolean.class;
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": return java.lang.String.class;
        case "signaldatacollection":
        case "signalDataCollection": return java.lang.String.class;
        case "signalenabledchannels":
        case "signalEnabledChannels": return java.lang.String.class;
        case "signalpollintervalms":
        case "signalPollIntervalMs": return long.class;
        case "skippedoperations":
        case "skippedOperations": return java.lang.String.class;
        case "snapshotdelayms":
        case "snapshotDelayMs": return long.class;
        case "snapshotfetchsize":
        case "snapshotFetchSize": return int.class;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return java.lang.String.class;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return long.class;
        case "snapshotmode":
        case "snapshotMode": return java.lang.String.class;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return java.lang.String.class;
        case "snapshottablesorderbyrowcount":
        case "snapshotTablesOrderByRowCount": return java.lang.String.class;
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": return java.lang.String.class;
        case "tableexcludelist":
        case "tableExcludeList": return java.lang.String.class;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return boolean.class;
        case "tableincludelist":
        case "tableIncludeList": return java.lang.String.class;
        case "timeprecisionmode":
        case "timePrecisionMode": return java.lang.String.class;
        case "tombstonesondelete":
        case "tombstonesOnDelete": return boolean.class;
        case "topicnamingstrategy":
        case "topicNamingStrategy": return java.lang.String.class;
        case "topicprefix":
        case "topicPrefix": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumDb2Endpoint target = (DebeziumDb2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return target.getConfiguration().getAdditionalProperties();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnexcludelist":
        case "columnExcludeList": return target.getConfiguration().getColumnExcludeList();
        case "columnincludelist":
        case "columnIncludeList": return target.getConfiguration().getColumnIncludeList();
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return target.getConfiguration().getColumnPropagateSourceType();
        case "converters": return target.getConfiguration().getConverters();
        case "custommetrictags":
        case "customMetricTags": return target.getConfiguration().getCustomMetricTags();
        case "databasedbname":
        case "databaseDbname": return target.getConfiguration().getDatabaseDbname();
        case "databasehostname":
        case "databaseHostname": return target.getConfiguration().getDatabaseHostname();
        case "databasepassword":
        case "databasePassword": return target.getConfiguration().getDatabasePassword();
        case "databaseport":
        case "databasePort": return target.getConfiguration().getDatabasePort();
        case "databaseuser":
        case "databaseUser": return target.getConfiguration().getDatabaseUser();
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return target.getConfiguration().getDatatypePropagateSourceType();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return target.getConfiguration().getDecimalHandlingMode();
        case "errorsmaxretries":
        case "errorsMaxRetries": return target.getConfiguration().getErrorsMaxRetries();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return target.getConfiguration().getEventProcessingFailureHandlingMode();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return target.getConfiguration().getHeartbeatTopicsPrefix();
        case "includeschemachanges":
        case "includeSchemaChanges": return target.getConfiguration().isIncludeSchemaChanges();
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": return target.getConfiguration().getIncrementalSnapshotChunkSize();
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": return target.getConfiguration().getIncrementalSnapshotWatermarkingStrategy();
        case "internalkeyconverter":
        case "internalKeyConverter": return target.getConfiguration().getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return target.getConfiguration().getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return target.getConfiguration().getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return target.getConfiguration().getMaxQueueSize();
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return target.getConfiguration().getMaxQueueSizeInBytes();
        case "messagekeycolumns":
        case "messageKeyColumns": return target.getConfiguration().getMessageKeyColumns();
        case "notificationenabledchannels":
        case "notificationEnabledChannels": return target.getConfiguration().getNotificationEnabledChannels();
        case "notificationsinktopicname":
        case "notificationSinkTopicName": return target.getConfiguration().getNotificationSinkTopicName();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return target.getConfiguration().getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return target.getConfiguration().getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return target.getConfiguration().getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return target.getConfiguration().getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return target.getConfiguration().getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return target.getConfiguration().getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return target.getConfiguration().getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return target.getConfiguration().getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return target.getConfiguration().getPollIntervalMs();
        case "postprocessors":
        case "postProcessors": return target.getConfiguration().getPostProcessors();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return target.getConfiguration().isProvideTransactionMetadata();
        case "queryfetchsize":
        case "queryFetchSize": return target.getConfiguration().getQueryFetchSize();
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return target.getConfiguration().getRetriableRestartConnectorWaitMs();
        case "schemahistoryinternal":
        case "schemaHistoryInternal": return target.getConfiguration().getSchemaHistoryInternal();
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": return target.getConfiguration().getSchemaHistoryInternalFileFilename();
        case "schemahistoryinternalskipunparseableddl":
        case "schemaHistoryInternalSkipUnparseableDdl": return target.getConfiguration().isSchemaHistoryInternalSkipUnparseableDdl();
        case "schemahistoryinternalstoreonlycaptureddatabasesddl":
        case "schemaHistoryInternalStoreOnlyCapturedDatabasesDdl": return target.getConfiguration().isSchemaHistoryInternalStoreOnlyCapturedDatabasesDdl();
        case "schemahistoryinternalstoreonlycapturedtablesddl":
        case "schemaHistoryInternalStoreOnlyCapturedTablesDdl": return target.getConfiguration().isSchemaHistoryInternalStoreOnlyCapturedTablesDdl();
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": return target.getConfiguration().getSchemaNameAdjustmentMode();
        case "signaldatacollection":
        case "signalDataCollection": return target.getConfiguration().getSignalDataCollection();
        case "signalenabledchannels":
        case "signalEnabledChannels": return target.getConfiguration().getSignalEnabledChannels();
        case "signalpollintervalms":
        case "signalPollIntervalMs": return target.getConfiguration().getSignalPollIntervalMs();
        case "skippedoperations":
        case "skippedOperations": return target.getConfiguration().getSkippedOperations();
        case "snapshotdelayms":
        case "snapshotDelayMs": return target.getConfiguration().getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return target.getConfiguration().getSnapshotFetchSize();
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return target.getConfiguration().getSnapshotIncludeCollectionList();
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return target.getConfiguration().getSnapshotLockTimeoutMs();
        case "snapshotmode":
        case "snapshotMode": return target.getConfiguration().getSnapshotMode();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return target.getConfiguration().getSnapshotSelectStatementOverrides();
        case "snapshottablesorderbyrowcount":
        case "snapshotTablesOrderByRowCount": return target.getConfiguration().getSnapshotTablesOrderByRowCount();
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": return target.getConfiguration().getSourceinfoStructMaker();
        case "tableexcludelist":
        case "tableExcludeList": return target.getConfiguration().getTableExcludeList();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return target.getConfiguration().isTableIgnoreBuiltin();
        case "tableincludelist":
        case "tableIncludeList": return target.getConfiguration().getTableIncludeList();
        case "timeprecisionmode":
        case "timePrecisionMode": return target.getConfiguration().getTimePrecisionMode();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return target.getConfiguration().isTombstonesOnDelete();
        case "topicnamingstrategy":
        case "topicNamingStrategy": return target.getConfiguration().getTopicNamingStrategy();
        case "topicprefix":
        case "topicPrefix": return target.getConfiguration().getTopicPrefix();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

