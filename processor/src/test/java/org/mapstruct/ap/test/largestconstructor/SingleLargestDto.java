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
public class SingleLargestDto {

    private final String stringValue;

    public SingleLargestDto(String stringValue) {
        this.stringValue = stringValue;
    }

    public SingleLargestDto() {
        stringValue = "from empty constructor";
    }

    public String getStringValue() {
        return stringValue;
    }
}
