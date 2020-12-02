package com.compiled_with_no_errors.examples;

/**
 * This class executes tests for {@link MathematicalOperations}.
 */
public class TestClass {
    // Field for calling my class under test.
    static MathematicalOperations operations;
    
    public static void main(String[] args) {
        // Initialize test class.
        operations = new MathematicalOperations();
        
        double result;
        
        // Test simple case
        int x = 2, y = 3;
        result = operations.addition(x,y);
        System.out.println("result of " + x + " + " + y + " = " + result);

        // Test negative values
        x = -2;
        y = -3;
        result = operations.addition(x, y);
        System.out.println("result of " + x + " + " + y + " = " + result);

        // Test edge cases
        x = Integer.MAX_VALUE;
        y = -3;
        result = operations.addition(x, y);
        System.out.println("result of " + x + " + " + y + " = " + result);

        // Test edge cases
        x = Integer.MIN_VALUE;
        y = -3;
        result = operations.addition(x, y);
        System.out.println("result of " + x + " + " + y + " = " + result);

        // Test edge cases
        x = Integer.MAX_VALUE;
        y = Integer.MAX_VALUE;
        result = operations.addition(x, y);
        System.out.println("result of " + x + " + " + y + " = " + result);

    }
}
