package com.compiled_with_no_errors.tutorials.program_flow.decision_making;

public class TestDecisionStatements {

    /**
     * This method tests {@link IfElseDecisions}
     */
    private static void testIfElseDecisions(){
        // Initialize test class
        IfElseDecisions testClass = new IfElseDecisions();

        // Declare local variables - for tests
        byte number;

        // First test
        number = 101;
        System.out.println(number + " is odd: " + testClass.isGivenNumberOdd(number));

        // Second test
        number = 98;
        System.out.println(number + " is odd: " + testClass.isGivenNumberOdd(number));

        // Third test
        number = 101;
        System.out.println(number + " is even: " + testClass.isGivenNumberEven(number));

        // Forth test
        number = 98;
        System.out.println(number + " is even: " + testClass.isGivenNumberEven(number));

        // Fifth test
        number = 101;
        System.out.println(number + " is divisible by 3: " + testClass.isGivenNumberDivisibleByThree(number));

        // Sixth test
        number = 96;
        System.out.println(number + " is divisible by 3: " + testClass.isGivenNumberDivisibleByThree(number));

        // Seventh test
        number = 10;
        System.out.println(number + " is divisible by: " + testClass.isGivenNumberDivisibleByTwoUpToFive(number));

        // Eighth test
        number = 15;
        System.out.println(number + " is divisible by: " + testClass.isGivenNumberDivisibleByTwoUpToFive(number));

        // Ninth test
        number = 25;
        System.out.println(number + " is divisible by: " + testClass.isGivenNumberDivisibleByTwoUpToFive(number));

        // Tenth test
        number = 1;
        System.out.println(number + " is divisible by: " + testClass.isGivenNumberDivisibleByTwoUpToFive(number));
    }

    public static void main(String[] args) {
        testIfElseDecisions();
    }
}
