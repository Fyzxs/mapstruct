/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * @author Quinn Gil
 *
 */
package org.mapstruct.ap.test.largestconstructor;

public class IntSourceDto {
    private final int value;

    public IntSourceDto(int value) {
        this.value = value;
    }

    public int getIntValue() {
        return value;
    }
}
