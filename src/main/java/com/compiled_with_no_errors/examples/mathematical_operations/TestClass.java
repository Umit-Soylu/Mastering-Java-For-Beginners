package com.compiled_with_no_errors.examples.mathematical_operations;

/**
 * This class executes tests for {@link MathematicalOperations}.
 */
public class TestClass {
    // Field for calling my class under test.
    static MathematicalOperations operations;

    /**
     * This method test all possible cases for {@link MathematicalOperations#addition(int, int)}
     */
    public static void additionTest(){
        long result;

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

    /**
     * This method tests all possible cases for {@link MathematicalOperations#division(int, int)}
     */
    public static void division(){
        float result;

        // Test simple case
        int x = 2, y = 3;
        result = operations.division(x, y);
        System.out.println("Result of " + x + " / " + y + " = " + result);

        // Test simple case
        x = 18;
        y = 3;
        result = operations.division(x, y);
        System.out.println("Result of " + x + " / " + y + " = " + result);

        // Test edge case
        x = 18;
        y = 0;
        result = operations.division(x, y);
        System.out.println("Result of " + x + " / " + y + " = " + result);

        // Test edge case
        x = -18;
        y = 0;
        result = operations.division(x, y);
        System.out.println("Result of " + x + " / " + y + " = " + result);

        // Test edge case
        x = 0;
        y = 0;
        result = operations.division(x, y);
        System.out.println("Result of " + x + " / " + y + " = " + result);
    }
    
    public static void main(String[] args) {
        // Initialize test class.
        operations = new MathematicalOperations();
        
        additionTest();

        division();
    }
}
