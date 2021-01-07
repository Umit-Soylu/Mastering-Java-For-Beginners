package com.compiled_with_no_errors.tutorials.constructors;

/**
 * This class have predefined constructors
 */
public class CustomConstructor {
    private final String name;

    /**
     * Constructor for the class
     * @param input Used for setting the private field.
     */
    public CustomConstructor(String input){
        name = input;
    }

    /**
     * No argument constructor for the class
     */
    protected CustomConstructor(){
        name = "Default";
    }

    /**
     * This is a private constructor
     * @param firstName First name
     * @param lastName  Last name
     */
    private CustomConstructor(String firstName, String lastName){
        name = firstName + " " + lastName;
    }


    public String getName() {
        return name;
    }
}
