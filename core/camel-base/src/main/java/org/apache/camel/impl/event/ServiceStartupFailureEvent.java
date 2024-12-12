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
package org.apache.camel.impl.event;

import java.io.Serial;
import java.util.EventObject;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.CamelEvent;

public class ServiceStartupFailureEvent extends EventObject implements CamelEvent.ServiceStartupFailureEvent {
    private static final @Serial long serialVersionUID = -9171964933795931862L;

    private final CamelContext context;
    private final Object service;
    private final Throwable cause;
    private long timestamp;

    public ServiceStartupFailureEvent(CamelContext context, Object service, Throwable cause) {
        super(service);
        this.context = context;
        this.service = service;
        this.cause = cause;
    }

    public CamelContext getContext() {
        return context;
    }

    @Override
    public Object getService() {
        return service;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Service startup failure: " + service + " due to " + cause.getMessage();
    }
}
