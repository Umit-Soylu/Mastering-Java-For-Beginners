package com.compiled_with_no_errors.exercises.prime_factors;

import java.util.Arrays;

public class PrimeFactorization {
    // Prime numbers (no extra prime number is needed)
    private static final int[] PRIME_NUMBERS = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    private PrimeFactorization() {}

    /**
     * <p>Generates prime numbers of the given number.</p>
     * <p>If given number is 8, the result is 1 element Array which has {@link PrimeComponent#getBase()} = 2 and {@link PrimeComponent#getExponent()} = 3</p>
     * @param number Input
     * @return List of prime numbers with their exponent given number consist of.
     * @implNote Will generate prime component using prime numbers less than 100, otherwise throws {@link IllegalArgumentException}.
     */
    public static PrimeComponent[] generatePrimes(long number){
        if (number < 2)
            throw new IllegalArgumentException("The input should be bigger than 2");

        // Prepare results
        PrimeComponent[] components = new PrimeComponent[PRIME_NUMBERS.length];
        for (int i = 0; i < PRIME_NUMBERS.length; i++) {
            components[i] = new PrimeComponent((byte) PRIME_NUMBERS[i]);
        }

        // Generate Prime Components
        int i = 0;
        do{
            while (number % PRIME_NUMBERS[i] == 0){
                number /= PRIME_NUMBERS[i];
                components[i].incrementExponent();
            }
            i++;
        } while (number != 1 && i < PRIME_NUMBERS.length -1);

        if (number != 1)
            throw new IllegalArgumentException(number + " cannot be divide into primes using prime numbers less than 100");

        return Arrays.copyOf(components, i);
    }

}

class PrimeComponent{
    private final byte base;
    private int exponent;

    PrimeComponent(byte base) {
        this.base = base;
        this.exponent = 0;
    }

    void incrementExponent(){
        exponent++;
    }

    public byte getBase() {
        return base;
    }

    public int getExponent() {
        return exponent;
    }
}
