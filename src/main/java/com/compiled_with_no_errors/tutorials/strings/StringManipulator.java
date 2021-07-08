package com.compiled_with_no_errors.tutorials.strings;

import java.util.Objects;

/**
 * Investigates the capabilities of {@link String}, {@link StringBuilder}, {@link StringBuffer}
 */
public final class StringManipulator {
    private static final StringBuilder BUILDER = new StringBuilder();

    private StringManipulator() {
    }

    /**
     * Finds the location in the memory
     * @param input String input
     * @return Location in the memory
     */
    public static int investigateStringLocation(String input){
        Objects.requireNonNull(input);

        int code = input.hashCode();
        return System.identityHashCode(code);
    }

    /**
     * @param input String to append
     */
    public static void addStrings(String input){
        BUILDER.append(input).append(" ");
    }

    /**
     *
     * @return The result of existing builder
     */
    public static String returnString(){
        String result = BUILDER.toString().trim();
        BUILDER.delete(0, BUILDER.capacity());

        return result;
    }

    public static int getCapacity(){
        return BUILDER.capacity();
    }

    public static int getLength(){
        return BUILDER.length();
    }
}
