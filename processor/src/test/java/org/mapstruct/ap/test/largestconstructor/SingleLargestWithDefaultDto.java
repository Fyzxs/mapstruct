/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.largestconstructor;

import org.mapstruct.ap.test.constructor.Default;

/**
 * @author Quinn Gil
 *
 */
public class SingleLargestWithDefaultDto {

    private final String value;
    private final int intValue;

    public SingleLargestWithDefaultDto(String value, int intValue) {
        this.value = value;
        this.intValue = intValue;
    }

    @Default
    public SingleLargestWithDefaultDto(int intValue) {
        value = "from default annotation constructor";
        this.intValue = intValue;
    }

    public String getValue() {
        return value;
    }

    public int getIntValue() {
        return intValue;
    }
}
