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
public class MultipleLargestDto {

    private final String stringValue;
    private final int intValue;

    public MultipleLargestDto(String stringValue) {
        this.stringValue = stringValue;
        this.intValue = -1;
    }

    public MultipleLargestDto(int intValue) {
        this.intValue = intValue;
        this.stringValue = "from int constructor";
    }

    public MultipleLargestDto() {
        stringValue = "from empty constructor";
        intValue = 1;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }
}
