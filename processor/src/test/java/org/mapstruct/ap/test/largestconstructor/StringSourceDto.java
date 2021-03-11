/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.largestconstructor;

/**
 * @author Quinn Gil
 *
 */
public class StringSourceDto {
    private final String value;

    public StringSourceDto(String value) {
        this.value = value;
    }

    public String getStringValue() {
        return value;
    }
}
