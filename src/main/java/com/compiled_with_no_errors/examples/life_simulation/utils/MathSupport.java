package com.compiled_with_no_errors.examples.life_simulation.utils;

import java.util.Random;

public class MathSupport {

    /**
     * Generates a random integer value
     * @param lowerBound Lower value inclusive
     * @param upperBound Upper value inclusive
     * @return An integer
     */
    public static int generateRandomNumber(int lowerBound, int upperBound){
        return (lowerBound == upperBound) ? lowerBound : lowerBound + new Random().nextInt(upperBound - lowerBound + 1);
    }

    /**
     * Generates a random integer value staring from 0
     * @param upperBound Upper value inclusive
     * @return An integer
     */
    public static int generateRandomNumber(int upperBound){
        return upperBound == 0 ? 0 : new Random().nextInt(upperBound + 1);
    }

}
