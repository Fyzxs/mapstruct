/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.largestconstructor;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Quinn Gil
 *
 */
@Mapper
public interface LargestConstructorMapper {

    LargestConstructorMapper INSTANCE = Mappers.getMapper( LargestConstructorMapper.class );

    SingleLargestDto mapSingleToSingle(StringSourceDto dto);

    SingleLargestWithDefaultDto mapMultipleToDefault(IntSourceDto dto);

    MultipleLargestDto mapMultipleToEmpty(StringSourceDto dto);
}
