/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.largestconstructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.ap.test.constructor.Default;
import org.mapstruct.ap.testutil.WithClasses;
import org.mapstruct.ap.testutil.compilation.annotation.ProcessorOption;
import org.mapstruct.ap.testutil.runner.AnnotationProcessorTestRunner;

import static org.assertj.core.api.Assertions.assertThat;

/***
 * @author Quinn Gil
 */
@WithClasses({
        Default.class,
        LargestConstructorMapper.class,
        SingleLargestDto.class,
        StringSourceDto.class,
        IntSourceDto.class,
        SingleLargestWithDefaultDto.class,
        MultipleLargestDto.class
})
@RunWith(AnnotationProcessorTestRunner.class)
public class LargestConstructorTest {

    @Test
    @ProcessorOption( name = "mapstruct.useMostParametersConstructor", value = "true")
    public void useLargestConstructorWithSetting() {
        StringSourceDto source = new StringSourceDto("source value");

        SingleLargestDto target = LargestConstructorMapper.INSTANCE.mapSingleToSingle( source );

        assertThat( target.getStringValue() ).isEqualTo( "source value" );
    }

    @Test
    public void useEmptyConstructorWithoutSetting() {
        StringSourceDto source = new StringSourceDto("source value");

        SingleLargestDto target = LargestConstructorMapper.INSTANCE.mapSingleToSingle( source );

        assertThat( target.getStringValue() ).isEqualTo( "from empty constructor" );
    }

    @Test
    @ProcessorOption( name = "mapstruct.useMostParametersConstructor", value = "true")
    public void useDefaultAnnotationWithSetting() {
        IntSourceDto source = new IntSourceDto(1234);

        SingleLargestWithDefaultDto target = LargestConstructorMapper.INSTANCE.mapMultipleToDefault( source );

        assertThat( target.getValue() ).isEqualTo( "from default annotation constructor" );
    }

    @Test
    @ProcessorOption( name = "mapstruct.useMostParametersConstructor", value = "true")
    public void useEmptyWhenMultipleLargestPresent() {
        StringSourceDto source = new StringSourceDto("source value");

        MultipleLargestDto target = LargestConstructorMapper.INSTANCE.mapMultipleToEmpty( source );

        assertThat( target.getStringValue() ).isEqualTo( "from empty constructor" );
    }
}
