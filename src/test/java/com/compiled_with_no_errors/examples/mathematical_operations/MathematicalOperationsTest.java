package com.compiled_with_no_errors.examples.mathematical_operations;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathematicalOperationsTest {
    MathematicalOperations testClass;

    @BeforeEach
    void setUp() {
        testClass = new MathematicalOperations();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    /**
     * Here all test cases are created
     * @return inputs and results for each test case
     */
    @NotNull
    private static Stream<Arguments> testParameters(){
        return Stream.of(
                Arguments.arguments(5L, 2, 3),
                Arguments.arguments(-5L, -2, -3),
                Arguments.arguments(Integer.MAX_VALUE + (long) 3, Integer.MAX_VALUE, 3),
                Arguments.arguments(Integer.MIN_VALUE - (long) 3, Integer.MIN_VALUE, -3),
                Arguments.arguments(((long) Integer.MAX_VALUE + Integer.MAX_VALUE), Integer.MAX_VALUE, Integer.MAX_VALUE),
                Arguments.arguments(((long) Integer.MIN_VALUE + Integer.MIN_VALUE), Integer.MIN_VALUE, Integer.MIN_VALUE),
                Arguments.arguments(0L ,0, -0)
        );
    }

    @ParameterizedTest(name = "{index} => addition({1}, {2}) should return {0}")
    @MethodSource("testParameters")
    void addition(long result, int x, int y) {
        assertEquals(result, testClass.addition(x, y));
    }
}