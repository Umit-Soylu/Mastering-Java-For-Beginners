package com.compiled_with_no_errors.tutorials.exceptions;

/**
 * A custom exception if input is not correct
 */
public class UnknownInputException extends IllegalArgumentException{
    private static final String MSG = "Provided input does not meet the criteria";

    /**
     * Constructs an {@code IllegalArgumentException} with the specified detail message.
     *
     * @param s The wrong input value
     */
    public UnknownInputException(String s) {
        super(s == null ? MSG : MSG + ", provided value: " + s);
    }
}
