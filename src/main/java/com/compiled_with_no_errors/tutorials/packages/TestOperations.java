package com.compiled_with_no_errors.tutorials.packages;


import com.compiled_with_no_errors.tutorials.packages.numbers.Operations;

public class TestOperations {

    public static void main(String[] args) {
        Operations numberOperations = new Operations();
        com.compiled_with_no_errors.tutorials.packages.floatings.Operations floatingOperations = new com.compiled_with_no_errors.tutorials.packages.floatings.Operations();

        int resultInt;
        float resultFloat;

        resultInt = numberOperations.addition(5,3);
        System.out.println("resultInt = " + resultInt);

        resultFloat = floatingOperations.addition(5.0f, 3.0f);
        System.out.println("resultFloat = " + resultFloat);
    }
}
