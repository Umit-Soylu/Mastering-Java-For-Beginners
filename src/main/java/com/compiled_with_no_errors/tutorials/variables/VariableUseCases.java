package com.compiled_with_no_errors.tutorials.variables;

public class VariableUseCases {
    // Declare fields
    String field = "Learning variable use cases.";

    // A dummy method that accepts an integer value.
    public void dummyMethod(Integer value){
        value = value + 1;
        System.out.println("Value in dummy method is " + value);
    }


    public static void main(String[] args) {
        // Initialize an object with my VariableUseCases definition.
        VariableUseCases myObject = new VariableUseCases();

        // Initialize an primitive type called x and assign a value;
        Integer x = 4;

        System.out.println("Value of local variable 'x' is " + x);

        System.out.println("Value of my field is " + myObject.field);

        myObject.dummyMethod(x);

        System.out.println("New value for 'x' is " + x);
    }
}
