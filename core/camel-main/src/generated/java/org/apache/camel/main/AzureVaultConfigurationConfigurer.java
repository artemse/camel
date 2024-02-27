/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.vault.AzureVaultConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AzureVaultConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.vault.AzureVaultConfiguration target = (org.apache.camel.vault.AzureVaultConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azureidentityenabled":
        case "AzureIdentityEnabled": target.setAzureIdentityEnabled(property(camelContext, boolean.class, value)); return true;
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "blobaccesskey":
        case "BlobAccessKey": target.setBlobAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "blobaccountname":
        case "BlobAccountName": target.setBlobAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobcontainername":
        case "BlobContainerName": target.setBlobContainerName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "eventhubconnectionstring":
        case "EventhubConnectionString": target.setEventhubConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorpvaultconfiguration":
        case "HashicorpVaultConfiguration": target.setHashicorpVaultConfiguration(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "refreshenabled":
        case "RefreshEnabled": target.setRefreshEnabled(property(camelContext, boolean.class, value)); return true;
        case "refreshperiod":
        case "RefreshPeriod": target.setRefreshPeriod(property(camelContext, long.class, value)); return true;
        case "secrets":
        case "Secrets": target.setSecrets(property(camelContext, java.lang.String.class, value)); return true;
        case "tenantid":
        case "TenantId": target.setTenantId(property(camelContext, java.lang.String.class, value)); return true;
        case "vaultname":
        case "VaultName": target.setVaultName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azureidentityenabled":
        case "AzureIdentityEnabled": return boolean.class;
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "blobaccesskey":
        case "BlobAccessKey": return java.lang.String.class;
        case "blobaccountname":
        case "BlobAccountName": return java.lang.String.class;
        case "blobcontainername":
        case "BlobContainerName": return java.lang.String.class;
        case "clientid":
        case "ClientId": return java.lang.String.class;
        case "clientsecret":
        case "ClientSecret": return java.lang.String.class;
        case "eventhubconnectionstring":
        case "EventhubConnectionString": return java.lang.String.class;
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorpvaultconfiguration":
        case "HashicorpVaultConfiguration": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "refreshenabled":
        case "RefreshEnabled": return boolean.class;
        case "refreshperiod":
        case "RefreshPeriod": return long.class;
        case "secrets":
        case "Secrets": return java.lang.String.class;
        case "tenantid":
        case "TenantId": return java.lang.String.class;
        case "vaultname":
        case "VaultName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.vault.AzureVaultConfiguration target = (org.apache.camel.vault.AzureVaultConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "AwsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azureidentityenabled":
        case "AzureIdentityEnabled": return target.isAzureIdentityEnabled();
        case "azurevaultconfiguration":
        case "AzureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "blobaccesskey":
        case "BlobAccessKey": return target.getBlobAccessKey();
        case "blobaccountname":
        case "BlobAccountName": return target.getBlobAccountName();
        case "blobcontainername":
        case "BlobContainerName": return target.getBlobContainerName();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "eventhubconnectionstring":
        case "EventhubConnectionString": return target.getEventhubConnectionString();
        case "gcpvaultconfiguration":
        case "GcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorpvaultconfiguration":
        case "HashicorpVaultConfiguration": return target.getHashicorpVaultConfiguration();
        case "refreshenabled":
        case "RefreshEnabled": return target.isRefreshEnabled();
        case "refreshperiod":
        case "RefreshPeriod": return target.getRefreshPeriod();
        case "secrets":
        case "Secrets": return target.getSecrets();
        case "tenantid":
        case "TenantId": return target.getTenantId();
        case "vaultname":
        case "VaultName": return target.getVaultName();
        default: return null;
        }
    }
}

