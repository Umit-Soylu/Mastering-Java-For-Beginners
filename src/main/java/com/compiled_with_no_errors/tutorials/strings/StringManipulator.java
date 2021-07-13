package com.compiled_with_no_errors.tutorials.strings;

import java.util.Arrays;
import java.util.Objects;

/**
 * Investigates Strings in terms of equality and investigates {@link StringBuilder} class itself
 */
public class StringManipulator {

    private StringManipulator(){}

    /**
     *
     * @param one First String
     * @param two Second String
     * @return true if both Strings refers to same Object, false otherwise
     */
    public static boolean areStringsEqual(String one, String two){
        Objects.requireNonNull(one);
        Objects.requireNonNull(two);

        System.out.printf("First string is %1$s, second string is %2$s, equality is %3$b\n", one, two, one == two);
        return one == two;
    }

    /**
     *
     * @param one First String
     * @param two Second String
     * @return true if both Strings contents are identical, false otherwise
     */
    public static boolean areContentsEqual(String one, String two){
        Objects.requireNonNull(one);
        Objects.requireNonNull(two);

        System.out.printf("First string is %s, second string is %s. Are contents identical? %b\n", one, two, one.equals(two));
        return one.equals(two);
    }

    /**
     *
     * @param delimiter Delimiter to be put in between strings
     * @param inputs String inputs
     * @return Combined String from inputs using delimiter
     */
    public static String generateString(String delimiter, String... inputs){
        Objects.requireNonNull(delimiter);
        Objects.requireNonNull(inputs);

        StringBuilder builder = new StringBuilder();

        for (String input : inputs) {
//            System.out.printf("Current capacity is %s, and current length is %s.\n", builder.capacity(), builder.length());
            builder.append(input).append(delimiter);
        }

        int i = builder.lastIndexOf(delimiter);
        builder.delete(i, builder.length());
//        System.out.printf("Last capacity is %s, and last length is %s.\n", builder.capacity(), builder.length());
        return builder.toString();
    }


    /**
     *
     * @param delimiter Delimiter to be put in between strings
     * @param inputs Inputs
     * @return A string from inputs using delimiter in between
     */
    public static String generateStringsViaAppender(String delimiter, String... inputs){
        Objects.requireNonNull(delimiter);
        Objects.requireNonNull(inputs);

        String result = "";
        for (String input : inputs) {
            result += input + delimiter;
        }

        return result.substring(0, result.lastIndexOf(delimiter));
    }

    public static void displayGenericString(String s, char[] chars){
        System.out.printf("First input is %1$s, second input is %2$6s\n", s, Arrays.toString(chars));

        System.out.println("Display all chars one by one");
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("%-4d character is %3c\n", i, chars[i]);
        }

        System.out.printf("Are both inputs same? %1$b, recheck %1$b\n", s.equals(Arrays.toString(chars)));
    }

    public static void displayNumbers(int x, float y){
        System.out.printf("First number:\n\tIn decimal format: %1$,(5d\n\tIn hexadecimal format: %1$-10x\n\tIn octal format: %1$12o\n", x);
        System.out.printf("Second number:\n\tIn floating format: %1$,(5.3f\n\tIn hexadecimal format: %1$-10.5a\n\tIn scientific notation: %1$12.6e\n\tIn precision notation: %1$12.6g\n", y);
    }
}
