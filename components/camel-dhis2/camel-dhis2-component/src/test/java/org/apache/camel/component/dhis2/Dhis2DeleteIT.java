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
/*
 * Camel Api Route test generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.dhis2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.dhis2.internal.Dhis2ApiCollection;
import org.apache.camel.component.dhis2.internal.Dhis2DeleteApiMethod;
import org.hisp.dhis.api.model.v40_2_2.OrganisationUnit;
import org.hisp.dhis.api.model.v40_2_2.WebMessage;
import org.hisp.dhis.integration.sdk.api.RemoteDhis2ClientException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for {@link org.apache.camel.component.dhis2.api.Dhis2Post} APIs.
 */
public class Dhis2DeleteIT extends AbstractDhis2TestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(Dhis2DeleteIT.class);
    private static final String PATH_PREFIX
            = Dhis2ApiCollection.getCollection().getApiName(Dhis2DeleteApiMethod.class).getName();

    @Test
    public void testResource() {
        String orgUnitId = Environment.DHIS2_CLIENT.post("organisationUnits")
                .withResource(new OrganisationUnit().withName("Acme").withShortName("Acme").withOpeningDate(new Date()))
                .transfer()
                .returnAs(WebMessage.class).getResponse().get().get("uid");

        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelDhis2.path", String.format("organisationUnits/%s", orgUnitId));
        // parameter type is java.util.Map
        headers.put("CamelDhis2.queryParams", new HashMap<>());

        final java.io.InputStream result = requestBodyAndHeaders("direct://RESOURCE", null, headers);
        RemoteDhis2ClientException remoteDhis2ClientException = assertThrows(RemoteDhis2ClientException.class,
                () -> Environment.DHIS2_CLIENT.get("organisationUnits/{id}", orgUnitId).transfer()
                        .returnAs(OrganisationUnit.class));
        assertEquals(404, remoteDhis2ClientException.getHttpStatusCode());

        assertNotNull(result, "resource result");
        LOG.debug("Result: {}", result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct://RESOURCE")
                        .to("dhis2://" + PATH_PREFIX + "/resource");
            }
        };
    }
}
