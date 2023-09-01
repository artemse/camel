/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.salesforce;

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
public class SalesforceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SalesforceEndpoint target = (SalesforceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allornone":
        case "allOrNone": target.getConfiguration().setAllOrNone(property(camelContext, boolean.class, value)); return true;
        case "apexmethod":
        case "apexMethod": target.getConfiguration().setApexMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "apexqueryparams":
        case "apexQueryParams": target.getConfiguration().setApexQueryParams(property(camelContext, java.util.Map.class, value)); return true;
        case "apexurl":
        case "apexUrl": target.getConfiguration().setApexUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "apiversion":
        case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "backoffincrement":
        case "backoffIncrement": target.getConfiguration().setBackoffIncrement(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "batchid":
        case "batchId": target.getConfiguration().setBatchId(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "compositemethod":
        case "compositeMethod": target.getConfiguration().setCompositeMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class, value)); return true;
        case "defaultreplayid":
        case "defaultReplayId": target.getConfiguration().setDefaultReplayId(property(camelContext, java.lang.Long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fallbackreplayid":
        case "fallBackReplayId": target.getConfiguration().setFallBackReplayId(property(camelContext, java.lang.Long.class, value)); return true;
        case "format": target.getConfiguration().setFormat(property(camelContext, org.apache.camel.component.salesforce.internal.PayloadFormat.class, value)); return true;
        case "httpclient":
        case "httpClient": target.getConfiguration().setHttpClient(property(camelContext, org.apache.camel.component.salesforce.SalesforceHttpClient.class, value)); return true;
        case "includedetails":
        case "includeDetails": target.getConfiguration().setIncludeDetails(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "initialreplayidmap":
        case "initialReplayIdMap": target.getConfiguration().setInitialReplayIdMap(property(camelContext, java.util.Map.class, value)); return true;
        case "instanceid":
        case "instanceId": target.getConfiguration().setInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "jobid":
        case "jobId": target.getConfiguration().setJobId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limit": target.getConfiguration().setLimit(property(camelContext, java.lang.Integer.class, value)); return true;
        case "locator": target.getConfiguration().setLocator(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbackoff":
        case "maxBackoff": target.getConfiguration().setMaxBackoff(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxrecords":
        case "maxRecords": target.getConfiguration().setMaxRecords(property(camelContext, java.lang.Integer.class, value)); return true;
        case "notfoundbehaviour":
        case "notFoundBehaviour": target.getConfiguration().setNotFoundBehaviour(property(camelContext, org.apache.camel.component.salesforce.NotFoundBehaviour.class, value)); return true;
        case "notifyforfields":
        case "notifyForFields": target.getConfiguration().setNotifyForFields(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class, value)); return true;
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": target.getConfiguration().setNotifyForOperationCreate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": target.getConfiguration().setNotifyForOperationDelete(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": target.getConfiguration().setNotifyForOperationUndelete(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": target.getConfiguration().setNotifyForOperationUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperations":
        case "notifyForOperations": target.getConfiguration().setNotifyForOperations(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class, value)); return true;
        case "objectmapper":
        case "objectMapper": target.getConfiguration().setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
        case "pkchunking":
        case "pkChunking": target.getConfiguration().setPkChunking(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "pkchunkingchunksize":
        case "pkChunkingChunkSize": target.getConfiguration().setPkChunkingChunkSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "pkchunkingparent":
        case "pkChunkingParent": target.getConfiguration().setPkChunkingParent(property(camelContext, java.lang.String.class, value)); return true;
        case "pkchunkingstartrow":
        case "pkChunkingStartRow": target.getConfiguration().setPkChunkingStartRow(property(camelContext, java.lang.String.class, value)); return true;
        case "pubsubbatchsize":
        case "pubSubBatchSize": target.getConfiguration().setPubSubBatchSize(property(camelContext, int.class, value)); return true;
        case "pubsubdeserializetype":
        case "pubSubDeserializeType": target.getConfiguration().setPubSubDeserializeType(property(camelContext, org.apache.camel.component.salesforce.PubSubDeserializeType.class, value)); return true;
        case "pubsubpojoclass":
        case "pubSubPojoClass": target.getConfiguration().setPubSubPojoClass(property(camelContext, java.lang.String.class, value)); return true;
        case "pubsubreplayid":
        case "pubSubReplayId": target.setPubSubReplayId(property(camelContext, java.lang.String.class, value)); return true;
        case "querylocator":
        case "queryLocator": target.getConfiguration().setQueryLocator(property(camelContext, java.lang.String.class, value)); return true;
        case "rawhttpheaders":
        case "rawHttpHeaders": target.getConfiguration().setRawHttpHeaders(property(camelContext, java.lang.String.class, value)); return true;
        case "rawmethod":
        case "rawMethod": target.getConfiguration().setRawMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "rawpath":
        case "rawPath": target.getConfiguration().setRawPath(property(camelContext, java.lang.String.class, value)); return true;
        case "rawpayload":
        case "rawPayload": target.getConfiguration().setRawPayload(property(camelContext, boolean.class, value)); return true;
        case "rawqueryparameters":
        case "rawQueryParameters": target.getConfiguration().setRawQueryParameters(property(camelContext, java.lang.String.class, value)); return true;
        case "replayid":
        case "replayId": target.setReplayId(property(camelContext, java.lang.Long.class, value)); return true;
        case "replaypreset":
        case "replayPreset": target.getConfiguration().setReplayPreset(property(camelContext, com.salesforce.eventbus.protobuf.ReplayPreset.class, value)); return true;
        case "reportid":
        case "reportId": target.getConfiguration().setReportId(property(camelContext, java.lang.String.class, value)); return true;
        case "reportmetadata":
        case "reportMetadata": target.getConfiguration().setReportMetadata(property(camelContext, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class, value)); return true;
        case "resultid":
        case "resultId": target.getConfiguration().setResultId(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": target.getConfiguration().setSObjectBlobFieldName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectclass":
        case "sObjectClass": target.getConfiguration().setSObjectClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectfields":
        case "sObjectFields": target.getConfiguration().setSObjectFields(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectid":
        case "sObjectId": target.getConfiguration().setSObjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectidname":
        case "sObjectIdName": target.getConfiguration().setSObjectIdName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectidvalue":
        case "sObjectIdValue": target.getConfiguration().setSObjectIdValue(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectname":
        case "sObjectName": target.getConfiguration().setSObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectquery":
        case "sObjectQuery": target.getConfiguration().setSObjectQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectsearch":
        case "sObjectSearch": target.getConfiguration().setSObjectSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "streamqueryresult":
        case "streamQueryResult": target.getConfiguration().setStreamQueryResult(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "updatetopic":
        case "updateTopic": target.getConfiguration().setUpdateTopic(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allornone":
        case "allOrNone": return boolean.class;
        case "apexmethod":
        case "apexMethod": return java.lang.String.class;
        case "apexqueryparams":
        case "apexQueryParams": return java.util.Map.class;
        case "apexurl":
        case "apexUrl": return java.lang.String.class;
        case "apiversion":
        case "apiVersion": return java.lang.String.class;
        case "backoffincrement":
        case "backoffIncrement": return long.class;
        case "batchid":
        case "batchId": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "compositemethod":
        case "compositeMethod": return java.lang.String.class;
        case "contenttype":
        case "contentType": return org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class;
        case "defaultreplayid":
        case "defaultReplayId": return java.lang.Long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "fallbackreplayid":
        case "fallBackReplayId": return java.lang.Long.class;
        case "format": return org.apache.camel.component.salesforce.internal.PayloadFormat.class;
        case "httpclient":
        case "httpClient": return org.apache.camel.component.salesforce.SalesforceHttpClient.class;
        case "includedetails":
        case "includeDetails": return java.lang.Boolean.class;
        case "initialreplayidmap":
        case "initialReplayIdMap": return java.util.Map.class;
        case "instanceid":
        case "instanceId": return java.lang.String.class;
        case "jobid":
        case "jobId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "limit": return java.lang.Integer.class;
        case "locator": return java.lang.String.class;
        case "maxbackoff":
        case "maxBackoff": return long.class;
        case "maxrecords":
        case "maxRecords": return java.lang.Integer.class;
        case "notfoundbehaviour":
        case "notFoundBehaviour": return org.apache.camel.component.salesforce.NotFoundBehaviour.class;
        case "notifyforfields":
        case "notifyForFields": return org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class;
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": return java.lang.Boolean.class;
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": return java.lang.Boolean.class;
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": return java.lang.Boolean.class;
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": return java.lang.Boolean.class;
        case "notifyforoperations":
        case "notifyForOperations": return org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class;
        case "objectmapper":
        case "objectMapper": return com.fasterxml.jackson.databind.ObjectMapper.class;
        case "pkchunking":
        case "pkChunking": return java.lang.Boolean.class;
        case "pkchunkingchunksize":
        case "pkChunkingChunkSize": return java.lang.Integer.class;
        case "pkchunkingparent":
        case "pkChunkingParent": return java.lang.String.class;
        case "pkchunkingstartrow":
        case "pkChunkingStartRow": return java.lang.String.class;
        case "pubsubbatchsize":
        case "pubSubBatchSize": return int.class;
        case "pubsubdeserializetype":
        case "pubSubDeserializeType": return org.apache.camel.component.salesforce.PubSubDeserializeType.class;
        case "pubsubpojoclass":
        case "pubSubPojoClass": return java.lang.String.class;
        case "pubsubreplayid":
        case "pubSubReplayId": return java.lang.String.class;
        case "querylocator":
        case "queryLocator": return java.lang.String.class;
        case "rawhttpheaders":
        case "rawHttpHeaders": return java.lang.String.class;
        case "rawmethod":
        case "rawMethod": return java.lang.String.class;
        case "rawpath":
        case "rawPath": return java.lang.String.class;
        case "rawpayload":
        case "rawPayload": return boolean.class;
        case "rawqueryparameters":
        case "rawQueryParameters": return java.lang.String.class;
        case "replayid":
        case "replayId": return java.lang.Long.class;
        case "replaypreset":
        case "replayPreset": return com.salesforce.eventbus.protobuf.ReplayPreset.class;
        case "reportid":
        case "reportId": return java.lang.String.class;
        case "reportmetadata":
        case "reportMetadata": return org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class;
        case "resultid":
        case "resultId": return java.lang.String.class;
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": return java.lang.String.class;
        case "sobjectclass":
        case "sObjectClass": return java.lang.String.class;
        case "sobjectfields":
        case "sObjectFields": return java.lang.String.class;
        case "sobjectid":
        case "sObjectId": return java.lang.String.class;
        case "sobjectidname":
        case "sObjectIdName": return java.lang.String.class;
        case "sobjectidvalue":
        case "sObjectIdValue": return java.lang.String.class;
        case "sobjectname":
        case "sObjectName": return java.lang.String.class;
        case "sobjectquery":
        case "sObjectQuery": return java.lang.String.class;
        case "sobjectsearch":
        case "sObjectSearch": return java.lang.String.class;
        case "streamqueryresult":
        case "streamQueryResult": return java.lang.Boolean.class;
        case "updatetopic":
        case "updateTopic": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SalesforceEndpoint target = (SalesforceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allornone":
        case "allOrNone": return target.getConfiguration().isAllOrNone();
        case "apexmethod":
        case "apexMethod": return target.getConfiguration().getApexMethod();
        case "apexqueryparams":
        case "apexQueryParams": return target.getConfiguration().getApexQueryParams();
        case "apexurl":
        case "apexUrl": return target.getConfiguration().getApexUrl();
        case "apiversion":
        case "apiVersion": return target.getConfiguration().getApiVersion();
        case "backoffincrement":
        case "backoffIncrement": return target.getConfiguration().getBackoffIncrement();
        case "batchid":
        case "batchId": return target.getConfiguration().getBatchId();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "compositemethod":
        case "compositeMethod": return target.getConfiguration().getCompositeMethod();
        case "contenttype":
        case "contentType": return target.getConfiguration().getContentType();
        case "defaultreplayid":
        case "defaultReplayId": return target.getConfiguration().getDefaultReplayId();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fallbackreplayid":
        case "fallBackReplayId": return target.getConfiguration().getFallBackReplayId();
        case "format": return target.getConfiguration().getFormat();
        case "httpclient":
        case "httpClient": return target.getConfiguration().getHttpClient();
        case "includedetails":
        case "includeDetails": return target.getConfiguration().getIncludeDetails();
        case "initialreplayidmap":
        case "initialReplayIdMap": return target.getConfiguration().getInitialReplayIdMap();
        case "instanceid":
        case "instanceId": return target.getConfiguration().getInstanceId();
        case "jobid":
        case "jobId": return target.getConfiguration().getJobId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limit": return target.getConfiguration().getLimit();
        case "locator": return target.getConfiguration().getLocator();
        case "maxbackoff":
        case "maxBackoff": return target.getConfiguration().getMaxBackoff();
        case "maxrecords":
        case "maxRecords": return target.getConfiguration().getMaxRecords();
        case "notfoundbehaviour":
        case "notFoundBehaviour": return target.getConfiguration().getNotFoundBehaviour();
        case "notifyforfields":
        case "notifyForFields": return target.getConfiguration().getNotifyForFields();
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": return target.getConfiguration().getNotifyForOperationCreate();
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": return target.getConfiguration().getNotifyForOperationDelete();
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": return target.getConfiguration().getNotifyForOperationUndelete();
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": return target.getConfiguration().getNotifyForOperationUpdate();
        case "notifyforoperations":
        case "notifyForOperations": return target.getConfiguration().getNotifyForOperations();
        case "objectmapper":
        case "objectMapper": return target.getConfiguration().getObjectMapper();
        case "pkchunking":
        case "pkChunking": return target.getConfiguration().getPkChunking();
        case "pkchunkingchunksize":
        case "pkChunkingChunkSize": return target.getConfiguration().getPkChunkingChunkSize();
        case "pkchunkingparent":
        case "pkChunkingParent": return target.getConfiguration().getPkChunkingParent();
        case "pkchunkingstartrow":
        case "pkChunkingStartRow": return target.getConfiguration().getPkChunkingStartRow();
        case "pubsubbatchsize":
        case "pubSubBatchSize": return target.getConfiguration().getPubSubBatchSize();
        case "pubsubdeserializetype":
        case "pubSubDeserializeType": return target.getConfiguration().getPubSubDeserializeType();
        case "pubsubpojoclass":
        case "pubSubPojoClass": return target.getConfiguration().getPubSubPojoClass();
        case "pubsubreplayid":
        case "pubSubReplayId": return target.getPubSubReplayId();
        case "querylocator":
        case "queryLocator": return target.getConfiguration().getQueryLocator();
        case "rawhttpheaders":
        case "rawHttpHeaders": return target.getConfiguration().getRawHttpHeaders();
        case "rawmethod":
        case "rawMethod": return target.getConfiguration().getRawMethod();
        case "rawpath":
        case "rawPath": return target.getConfiguration().getRawPath();
        case "rawpayload":
        case "rawPayload": return target.getConfiguration().isRawPayload();
        case "rawqueryparameters":
        case "rawQueryParameters": return target.getConfiguration().getRawQueryParameters();
        case "replayid":
        case "replayId": return target.getReplayId();
        case "replaypreset":
        case "replayPreset": return target.getConfiguration().getReplayPreset();
        case "reportid":
        case "reportId": return target.getConfiguration().getReportId();
        case "reportmetadata":
        case "reportMetadata": return target.getConfiguration().getReportMetadata();
        case "resultid":
        case "resultId": return target.getConfiguration().getResultId();
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": return target.getConfiguration().getSObjectBlobFieldName();
        case "sobjectclass":
        case "sObjectClass": return target.getConfiguration().getSObjectClass();
        case "sobjectfields":
        case "sObjectFields": return target.getConfiguration().getSObjectFields();
        case "sobjectid":
        case "sObjectId": return target.getConfiguration().getSObjectId();
        case "sobjectidname":
        case "sObjectIdName": return target.getConfiguration().getSObjectIdName();
        case "sobjectidvalue":
        case "sObjectIdValue": return target.getConfiguration().getSObjectIdValue();
        case "sobjectname":
        case "sObjectName": return target.getConfiguration().getSObjectName();
        case "sobjectquery":
        case "sObjectQuery": return target.getConfiguration().getSObjectQuery();
        case "sobjectsearch":
        case "sObjectSearch": return target.getConfiguration().getSObjectSearch();
        case "streamqueryresult":
        case "streamQueryResult": return target.getConfiguration().getStreamQueryResult();
        case "updatetopic":
        case "updateTopic": return target.getConfiguration().isUpdateTopic();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apexqueryparams":
        case "apexQueryParams": return java.lang.Object.class;
        case "initialreplayidmap":
        case "initialReplayIdMap": return java.lang.Long.class;
        default: return null;
        }
    }
}

