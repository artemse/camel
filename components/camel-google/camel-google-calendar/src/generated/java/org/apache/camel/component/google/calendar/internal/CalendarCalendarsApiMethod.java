/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.calendar.Calendar.Calendars;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.calendar.Calendar$Calendars
 */
public enum CalendarCalendarsApiMethod implements ApiMethod {

    CLEAR(
        com.google.api.services.calendar.Calendar.Calendars.Clear.class,
        "clear",
        arg("calendarId", String.class)),

    DELETE(
        com.google.api.services.calendar.Calendar.Calendars.Delete.class,
        "delete",
        arg("calendarId", String.class)),

    GET(
        com.google.api.services.calendar.Calendar.Calendars.Get.class,
        "get",
        arg("calendarId", String.class)),

    INSERT(
        com.google.api.services.calendar.Calendar.Calendars.Insert.class,
        "insert",
        arg("content", com.google.api.services.calendar.model.Calendar.class)),

    PATCH(
        com.google.api.services.calendar.Calendar.Calendars.Patch.class,
        "patch",
        arg("calendarId", String.class),
        arg("content", com.google.api.services.calendar.model.Calendar.class)),

    UPDATE(
        com.google.api.services.calendar.Calendar.Calendars.Update.class,
        "update",
        arg("calendarId", String.class),
        arg("content", com.google.api.services.calendar.model.Calendar.class));

    private final ApiMethod apiMethod;

    private CalendarCalendarsApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Calendars.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
