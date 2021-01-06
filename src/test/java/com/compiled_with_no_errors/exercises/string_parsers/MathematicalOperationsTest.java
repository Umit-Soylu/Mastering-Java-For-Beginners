package com.compiled_with_no_errors.exercises.string_parsers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MathematicalOperationsTest {
    private MathematicalOperations testClass;

    @BeforeEach
    void setUp() {
        testClass = new MathematicalOperations();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }
    /**
     * This method provides all test cases
     * @return Arguments to be executed for each test
     */
    private static Stream<Arguments> testParameters(){
        return Stream.of(
                Arguments.arguments(5D, "2 + 3"),
                Arguments.arguments(-5D, "0 - 5"),
                Arguments.arguments(2147483650D, "2147483647 + 3"),
                Arguments.arguments(-2147483651D, "-2147483648 - 3"),
                Arguments.arguments(Double.POSITIVE_INFINITY, "15 / 0 "),
                Arguments.arguments(Double.NEGATIVE_INFINITY, "-1540 / 0 "),
                Arguments.arguments(0.666666667D, "2 /   3 "),
                Arguments.arguments(Double.NaN, "0 /   0 "),
                Arguments.arguments(4.6116860141324206E18, "2147483647 * 2147483647"),
                Arguments.arguments(0D, "0 * 5"),
                Arguments.arguments(0D, "0 / 5")
        );
    }

    @ParameterizedTest(name = "{index} = {1} should result {0}")
    @MethodSource("testParameters")
    void isParenthesisMatchedTest(Double result, String input){
        assertEquals(result, testClass.parseBasicEquation(input), 10E-5);
    }

    /**
     * This method provides all test cases
     * @return Arguments to be executed for each test
     */
    private static Stream<Arguments> testNullParameters(){
        return Stream.of(
                Arguments.arguments(""),
                Arguments.arguments(" "),
                Arguments.arguments("0/5"),
                Arguments.arguments("0 % 5"),
                Arguments.arguments("10 + 5 + 5"),
                Arguments.arguments("-10  -5"),
                Arguments.arguments(" /"),
                Arguments.arguments(" / + * "),
                Arguments.arguments("0 / ")
        );
    }

    @ParameterizedTest(name = "{index} = {1}")
    @MethodSource("testNullParameters")
    void isParenthesisMatchedError(String input){
        assertNull(testClass.parseBasicEquation(input));
    }
}