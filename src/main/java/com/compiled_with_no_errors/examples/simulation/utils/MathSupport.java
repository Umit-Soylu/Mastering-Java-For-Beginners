package com.compiled_with_no_errors.examples.simulation.utils;

import java.util.Random;

/**
 * Provides utility methods for mathematical operations
 */
public class MathSupport {

    /**
     * Prevents creation of this class
     */
    private MathSupport(){}

    /**
     * Generate a random integer based on requirements
     * @param min Minimum index of integer inclusive
     * @param max Maximum index of integer inclusive
     * @return a random integer
     */
    public static int generateRandomInteger(int min, int max){
        int realMin = Math.min(min, max);
        int realMax = Math.max(min, max);
        return realMin + new Random().nextInt(realMax - realMin + 1);
    }
}
