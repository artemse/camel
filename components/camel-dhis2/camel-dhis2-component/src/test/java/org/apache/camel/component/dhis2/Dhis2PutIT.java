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
import org.apache.camel.component.dhis2.internal.Dhis2PutApiMethod;
import org.apache.commons.lang3.RandomStringUtils;
import org.hisp.dhis.api.model.v40_2_2.OrganisationUnit;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for {@link org.apache.camel.component.dhis2.api.Dhis2Post} APIs.
 */
public class Dhis2PutIT extends AbstractDhis2TestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(Dhis2PutIT.class);
    private static final String PATH_PREFIX = Dhis2ApiCollection.getCollection().getApiName(Dhis2PutApiMethod.class).getName();

    @Test
    public void testResourceGivenInBody() {
        putResource("direct://RESOURCE_WITH_INBODY");
    }

    @Test
    public void testResource() {
        putResource("direct://RESOURCE");
    }

    private void putResource(String endpointUri) {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelDhis2.path", String.format("organisationUnits/%s", Environment.ORG_UNIT_ID_UNDER_TEST));
        // parameter type is java.util.Map
        headers.put("CamelDhis2.queryParams", new HashMap<>());

        String name = RandomStringUtils.randomAlphabetic(8);
        final java.io.InputStream result = requestBodyAndHeaders(endpointUri,
                new OrganisationUnit().withName(name).withShortName(name).withOpeningDate(new Date()), headers);
        OrganisationUnit organisationUnit
                = Environment.DHIS2_CLIENT.get("organisationUnits/{id}", Environment.ORG_UNIT_ID_UNDER_TEST)
                        .transfer().returnAs(OrganisationUnit.class);
        assertEquals(name, organisationUnit.getName().get());

        assertNotNull(result, "resource result");
        LOG.debug("Result: {}", result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct://RESOURCE_WITH_INBODY")
                        .to("dhis2://" + PATH_PREFIX + "/resource?inBody=resource");

                from("direct://RESOURCE")
                        .to("dhis2://" + PATH_PREFIX + "/resource");
            }
        };
    }
}
