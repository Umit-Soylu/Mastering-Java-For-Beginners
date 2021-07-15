package com.compiled_with_no_errors.examples.life_simulation.utils;

public class ImproperInputException extends IllegalArgumentException {
    /**
     * Constructs an {@code IllegalArgumentException} with the
     * specified detail message.
     *
     * @param s the detail message.
     */
    public ImproperInputException(String s) {
        super(s);
    }
}
