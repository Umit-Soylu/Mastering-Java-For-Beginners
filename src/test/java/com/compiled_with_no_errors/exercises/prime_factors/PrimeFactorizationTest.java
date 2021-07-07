package com.compiled_with_no_errors.exercises.prime_factors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrimeFactorizationTest {
    @ParameterizedTest
    @ValueSource(longs = {2, 8, 12, 15, 11, (long) 12E11, 304_250_263_527_210L})
    void generatePrimes(long number) {
        PrimeComponent[] primeComponents = PrimeFactorization.generatePrimes(number);

        long sum = 1;
        for (PrimeComponent component : primeComponents)
            sum *= Math.pow(component.getBase(), component.getExponent());

        assertEquals(number, sum);
    }

    @ParameterizedTest
    @ValueSource(longs = {Long.MIN_VALUE, -2, 0, 1, 557, 1583, Long.MAX_VALUE})
    void generateIllegalPrimes(long number){
        assertThrows(IllegalArgumentException.class , () -> PrimeFactorization.generatePrimes(number));
    }
}
