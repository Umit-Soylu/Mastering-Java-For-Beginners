package com.compiled_with_no_errors.tutorials.program_flow.operators;

/**
 * This class defines relational operators.
 */
public class RelationalOperators {

    /**
     * This method prints the relations of given parameters with each other
     * @param x first parameter
     * @param y second parameter
     */
    protected void computeRelations(float x, float y){
        // The relational operators always results boolean
        System.out.println(x + " is greater than " + y +" is " + (x > y));
        System.out.println(x + " is greater than or equal to " + y + " is " + (x >= y));
        System.out.println(x + " is lesser than " + y + " is " + (x < y));
        System.out.println(x + " is lesser than or equal to " + y + " is " + (x <= y));
        System.out.println(x + " is equal to " + y + " is " + (x == y));
        System.out.println(x + " is not equal to " + y + " is " + (x != y));
    }
}
