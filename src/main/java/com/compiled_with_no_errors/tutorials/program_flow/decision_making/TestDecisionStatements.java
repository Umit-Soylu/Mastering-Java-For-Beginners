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

    /**
     * This method tests {@link Loops}
     */
    private static void testLoops(){
        int maxNumber;

        // Initialize test class
        Loops testClass = new Loops();

        // First test
        System.out.println("First Test");
        maxNumber = 5;
        testClass.printNumbers(maxNumber);

        // Second test
        System.out.println("Second Test");
        maxNumber = -3;
        testClass.printNumbers(maxNumber);

        // Third test
        //System.out.println("Third Test");
        //maxNumber = Integer.MAX_VALUE;
        //testClass.printNumbers(maxNumber);

        // Forth test
        System.out.println("Forth Test");
        maxNumber = 5;
        testClass.printNumbersAtLeastOnce(maxNumber);

        // Fifth Test
        System.out.println("Fifth Test");
        maxNumber = -3;
        testClass.printNumbersAtLeastOnce(maxNumber);

        // Sixth test
        System.out.println("Sixth Test");
        maxNumber = 5;
        testClass.printNumbersWithALoop(maxNumber);

        // Seventh test
        System.out.println("Seventh Test");
        int[] array = new int[]{10, 20, 35, 49, 5};
        testClass.printNumbersOfArray(array);

    }

    public static void main(String[] args) {
        //testIfElseDecisions();

        testLoops();
    }
}
