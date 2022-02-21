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
package org.apache.camel.component.google.secret.manager.integration;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.google.secret.manager.GoogleSecretManagerConstants;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

@EnabledIfEnvironmentVariable(named = "GOOGLE_APPLICATION_CREDENTIALS", matches = ".*",
                              disabledReason = "Application credentials were not provided")
public class GoogleCloudIT extends CamelTestSupport {

    final String serviceAccountKeyFile = System.getenv("GOOGLE_APPLICATION_CREDENTIALS");
    final String project = "myProject";

    @EndpointInject("mock:createSecret")
    private MockEndpoint mockSecret;

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                from("timer:timer1?repeatCount=1").process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        exchange.getMessage().setHeader(GoogleSecretManagerConstants.SECRET_ID, "test123");
                        exchange.getMessage().setBody("Hello");
                    }
                })
                        .to("google-secret-manager://" + project + "?serviceAccountKey="
                            + serviceAccountKeyFile + "&operation=createSecret")
                        .to("mock:createSecret");

            }
        };
    }

    @Test
    public void sendIn() throws Exception {

        mockSecret.expectedMessageCount(1);
        Thread.sleep(10000);
    }

}