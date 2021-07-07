package com.compiled_with_no_errors.exercises.prime_factors;


import java.util.Arrays;
import java.util.Objects;

public class SharedPrimes {
    // Prime numbers (no extra prime number is needed)
    private final int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    // Assign same indexed primes to true to keep track of generated primes.
    private final boolean[] primeNumbersMatches = new boolean[primeNumbers.length];

    /**
     * Generates shared prime factors of given numbers
     * @param input Consists of inputs seperated by comma
     * @return <p>Shared prime factors of the given numbers</p>
     * @implSpec <p>Followings are valid example cases</p>
     * <ul>
     *     <li>{5 , 3} results {3, 5}</li>
     *     <li>{15 , 3} results {3, 5}</li>
     *     <li>{3, 21, 11} results {3, 7, 11}</li>
     * </ul>
     * @implNote Accepts input bigger than 2, if any invalid input exists, throws {@link IllegalArgumentException} or {@link NumberFormatException}
     */
    public byte[] findSharedPrimes(String input){
        Objects.requireNonNull(input, "Input is not initialized");

        if (input.isEmpty() || input.isBlank())
            throw new IllegalArgumentException("Input cannot be empty or blank");

        String[] strings = input.split(",");
        int[] numbers = new int[strings.length];

        int x;
        for (int i = 0; i < strings.length; i++) {
            x = Integer.parseInt(strings[i].trim());
            if (x >= 2)
                numbers[i] = x;
            else
                throw new IllegalArgumentException("Cannot contain values less than 2");
        }

        for (int n : numbers) {
            generatePrimes(n);
        }

        byte[] results = new byte[primeNumbersMatches.length];
        int j = 0;
        for (int i = 0; i < primeNumbersMatches.length; i++) {
            if (primeNumbersMatches[i])
                results[j++] = (byte) primeNumbers[i];
        }

        return Arrays.copyOf(results, j);
    }

    private void generatePrimes(int x){
        int i = 0;

        while (x != 1 && i < primeNumbers.length - 1) {
            while (x % primeNumbers[i] == 0) {
                x /= primeNumbers[i];
                primeNumbersMatches[i] = true;
            }
            i++;
        }

        if (x != 1)
            throw new IllegalArgumentException("Given integer cannot be factorized by Prime Numbers less than 100");
    }
}
