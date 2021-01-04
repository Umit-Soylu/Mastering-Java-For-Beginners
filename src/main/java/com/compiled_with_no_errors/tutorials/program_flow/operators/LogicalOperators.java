package com.compiled_with_no_errors.tutorials.program_flow.operators;

/**
 * This class will execute logical operators
 */
public class LogicalOperators {

    /**
     * This method accepts two parameters and applies logical operators
     * @param x first parameter
     * @param y second parameter
     */
    protected void applyLogicalOperators(int x, int y){
        boolean result;
        result = (x < y) && (y < 0);
        System.out.println("Is " + x + " less than " + y + " and " + y +" is less than 0? " + result);

        result = (x < 0) || (y < 0);
        System.out.println("Is " + x + " or " + y + " are less than 0? " + result);

        System.out.println("Is " + x + " and " + y + " are bigger than or equal to 0? " + !result);
    }
}
