package com.compiled_with_no_errors.examples.life_simulation.utils;

public class ConstraintValidator {

    private ConstraintValidator() {}

    /**
     *
     * @param x Integer to be checked
     * @return true if {@code x > 0}, false otherwise
     */
    public static boolean validatePositiveNumber(int x){
        if (x > 0){
            return true;
        } else
            throw new IllegalArgumentException(String.format("Given input should be bigger than 0 but was %d", x));
    }

    /**
     *
     * @param number Float to be checked
     * @return true {@code number >= 0 && number <= 1}, false otherwise
     */
    public static boolean validateFloatNumber(float number){
        if (number >= 0 && number <= 1)
            return true;
        else
            throw new IllegalArgumentException(String.format("Given input should be in between 0 and 1, but was %.2f", number)); //  25.54896
    }
}
