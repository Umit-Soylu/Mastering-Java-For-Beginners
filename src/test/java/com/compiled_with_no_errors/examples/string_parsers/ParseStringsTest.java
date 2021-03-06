package com.compiled_with_no_errors.examples.string_parsers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParseStringsTest {
    ParseStrings testClass;

    @BeforeEach
    void setUp() {
        testClass = new ParseStrings();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    /**
     * This method provides all test cases for {@link ParseStrings#isParenthesisMatched(String)}
     * @return Arguments to be executed for each test
     */
    private static Stream<Arguments> testParameters(){
        return Stream.of(
                Arguments.arguments(true, "(2+3)"),
                Arguments.arguments(true, "2+3"),
                Arguments.arguments(false, "2+3)"),
                Arguments.arguments(true, "((2+3))"),
                Arguments.arguments(false, "(2+3))"),
                Arguments.arguments(false, "((2+3)"),
                Arguments.arguments(true, "(())(2+3)"),
                Arguments.arguments(true, "")
        );
    }

    @ParameterizedTest(name = "{index} = {1} should result {0}")
    @MethodSource("testParameters")
    void isParenthesisMatchedTest(boolean result, String input){
        assertEquals(result, testClass.isParenthesisMatched(input));
    }

    /**
     * This method provides all test cases for {@link ParseStrings#parseTokens(String, char)}
     * @return Arguments to be executed for each test
     */
    private static Stream<Arguments> testTokenParameters(){
        return Stream.of(
                Arguments.arguments("Car-345", '-', new String[]{"Car", "345"}),
                Arguments.arguments("Animal:Zebra", ':', new String[]{"Animal", "Zebra"}),
                Arguments.arguments("Mastering Java", ' ', new String[]{"Mastering", "Java"}),
                Arguments.arguments("MasteringJava", ' ', new String[2]),
                Arguments.arguments("Mastering,Java", ' ', new String[2]),
                Arguments.arguments(" Mastering,Java", ' ', new String[]{"", "Mastering,Java"})
        );
    }
    @ParameterizedTest(name="{index} = {0} with {1} should generate {2}")
    @MethodSource("testTokenParameters")
    void parseTokens(String input, char key, String[] tokens) {
        assertArrayEquals(tokens, testClass.parseTokens(input, key));
    }

    /*
    @Test
    void isParenthesisMatched() {
        String input = "(2+3)";
        assertTrue(testClass.isParenthesisMatched(input));
    }

    @Test
    void isParenthesisMatchedTwo() {
        String input = "2+3";
        assertTrue(testClass.isParenthesisMatched(input));
    }

    @Test
    void isParenthesisMatchedThree() {
        String input = "2+3)";
        assertFalse(testClass.isParenthesisMatched(input));
    }

    @Test
    void isParenthesisMatchedFour() {
        String input = "((2+3))";
        assertTrue(testClass.isParenthesisMatched(input));
    }

    @Test
    void isParenthesisMatchedFive() {
        String input = "(2+3))";
        assertFalse(testClass.isParenthesisMatched(input));
    }

    @Test
    void isParenthesisMatchedSix() {
        String input = "((2+3)";
        assertFalse(testClass.isParenthesisMatched(input));
    }

    @Test
    void isParenthesisMatchedSeven() {
        String input = "(())(2+3)";
        assertTrue(testClass.isParenthesisMatched(input));
    }
     */
}