package com.compiled_with_no_errors.tutorials.exceptions;

/**
 * Show example cases for interacting with exceptions
 */
public class ExceptionCases {
    static long NUMBER_OF_CALLS; // Store the number of method calls.

    /**
     *
     * @param x First input
     * @param y Second input
     * @return Sum of inputs
     * @implNote If sum exceed:
     * <ul>
     *     <li>{@link Integer#MAX_VALUE}, then returns {@link Integer#MAX_VALUE}</li>
     *     <li>{@link Integer#MIN_VALUE}, then returns {@link Integer#MIN_VALUE}</li>
     * </ul>
     */
    public static int addInt(int x, int y){
        try{
            return Math.addExact(x, y);
        } catch (ArithmeticException e){
            return (x > 0 && y > 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } finally {
            NUMBER_OF_CALLS++;
        }
    }

    /**
     *
     * @param input Input String
     * @return the String if it is not null or empty
     */
    public static String returnNonNullStrings(String input){
        try {
            if (input == null)
                throw new IllegalArgumentException("Input cannot be null");
            else if (input.isEmpty() || input.isBlank())
                throw new IllegalArgumentException("Input should contain non-whitespace characters");
            else
                return input;
        } finally {
            NUMBER_OF_CALLS++;
        }
    }


}
