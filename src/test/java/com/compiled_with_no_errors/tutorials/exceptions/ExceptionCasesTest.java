package com.compiled_with_no_errors.tutorials.exceptions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionCasesTest {
    private static long COUNTER;

    @BeforeEach
    void setUp() {
        assertEquals(COUNTER, ExceptionCases.NUMBER_OF_CALLS);
    }

    @AfterEach
    void tearDown() {
        assertEquals(++COUNTER, ExceptionCases.NUMBER_OF_CALLS);
    }

    private static Stream<Arguments> intInputs() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(-2, -3, -5),
                Arguments.of(2, -3, -1),
                Arguments.of(0, -3, -3),
                Arguments.of(0, 0, 0),
                Arguments.of(Integer.MAX_VALUE, 1, Integer.MAX_VALUE),
                Arguments.of(Integer.MIN_VALUE, -1, Integer.MIN_VALUE)
        );
    }

    @ParameterizedTest
    @MethodSource("intInputs")
    void addInt(int x, int y, int sum) {
        assertEquals(sum, ExceptionCases.addInt(x, y));
    }

    private static Stream<Arguments> stringInputs() {
        return Stream.of(
                Arguments.of("Input", false),
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of("\t", true),
                Arguments.of(" ", true)
        );
    }

    @ParameterizedTest
    @MethodSource("stringInputs")
    void returnNonNullStrings(String input, boolean isExceptionThrown) {
        if (isExceptionThrown){
            assertThrows(IllegalArgumentException.class, () -> ExceptionCases.returnNonNullStrings(input));
        } else
            assertEquals(input, ExceptionCases.returnNonNullStrings(input));
    }
}
