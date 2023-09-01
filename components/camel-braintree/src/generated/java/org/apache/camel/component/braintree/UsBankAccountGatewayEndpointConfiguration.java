/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.UsBankAccountGateway}.
 */
@ApiParams(apiName = "usBankAccount", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "find", signatures={"com.braintreegateway.UsBankAccount find(String token)"}), @ApiMethod(methodName = "sale", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> sale(String token, com.braintreegateway.TransactionRequest transactionRequest)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class UsBankAccountGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "find"), @ApiMethod(methodName = "sale")})
    private String token;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "sale")})
    private com.braintreegateway.TransactionRequest transactionRequest;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public com.braintreegateway.TransactionRequest getTransactionRequest() {
        return transactionRequest;
    }

    public void setTransactionRequest(com.braintreegateway.TransactionRequest transactionRequest) {
        this.transactionRequest = transactionRequest;
    }
}
