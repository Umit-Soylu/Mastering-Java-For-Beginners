package com.compiled_with_no_errors.exercises.prime_factors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SharedPrimesTest {
    SharedPrimes testClass;


    private static Stream<Arguments> testParameters(){
        return Stream.of(
                Arguments.arguments("5", new byte[]{5}),
                Arguments.arguments("   5   ", new byte[]{5}),
                Arguments.arguments("\n5\t", new byte[]{5}),
                Arguments.arguments("5, 2", new byte[]{2, 5}),
                Arguments.arguments("   5  ,  2 ", new byte[]{2, 5}),
                Arguments.arguments("\n5\t,\t2", new byte[]{2, 5}),
                Arguments.arguments("15, 3", new byte[]{3, 5}),
                Arguments.arguments("5, 3", new byte[]{3, 5}),
                Arguments.arguments("21, 11, 3", new byte[]{3, 7, 11})
        );
    }

    @BeforeEach
    void setUp() {
        testClass = new SharedPrimes();
    }

    @ParameterizedTest
    @MethodSource("testParameters")
    void primeFactorization(String numbers, byte[] results) {
        assertArrayEquals(results, testClass.findSharedPrimes(numbers));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  ", " , ", "  ,   , 5", "231232132313123213", "-54", " 557 ", "1583"})
    void illegalPrimeFactorization(String input){
        assertThrows(IllegalArgumentException.class, () -> testClass.findSharedPrimes(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123.3", "123E-3", "e", "pi", "e  , pi", "This"})
    void nonIntegerPrimeFactorization(String input){
        assertThrows(NumberFormatException.class, () -> testClass.findSharedPrimes(input));
    }

    @Test
    void NullInput(){
        assertThrows(NullPointerException.class, () -> testClass.findSharedPrimes(null));
    }
}
