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

    /**
     * This method tests {@link Loops} with loop control cases
     */
    private static void testLoopControl(){
        int start, end, coefficient;

        // Initialize test case
        Loops testClass = new Loops();

        // First test
        System.out.println("First test");
        start = 0;
        end = 25;
        coefficient = 3;
        testClass.printNumbersExceptGivenCriteria(start, end, coefficient);

        // Second test
        System.out.println("Second test");
        start = -50;
        end = -25;
        coefficient = 2;
        testClass.printNumbersExceptGivenCriteria(start, end, coefficient);

        // Third test
        System.out.println("Third test");
        start = 10;
        end = 15;
        coefficient = 16;
        testClass.printNumbersTillCriteriaHit(start, end, coefficient);

        // Forth test
        System.out.println("Forth test");
        start = 10;
        end = 15;
        coefficient = 13;
        testClass.printNumbersTillCriteriaHit(start, end, coefficient);
    }

    /**
     * This method tests {@link SwitchDecision}
     */
    private static void testSwitchDecision(){
        byte index;

        // Initialize test class
        SwitchDecision testClass = new SwitchDecision();

        // First test
        System.out.println("First test");
        index = 2;
        testClass.printMonths(index);

        // Second test
        System.out.println("Second test");
        index = -51;
        testClass.printMonths(index);

        // Third test
        System.out.println("Third test");
        index = 10;
        testClass.printMonths(index);

        // Forth test
        System.out.println("Forth test");
        index = 8;
        testClass.sumValuesFromTen(index);

        // Fifth test
        System.out.println("Fifth test");
        index = 2;
        testClass.sumValuesFromTen(index);

        // Sixth test
        System.out.println("Fifth test");
        index = 100;
        testClass.sumValuesFromTen(index);

    }


    public static void main(String[] args) {
        testIfElseDecisions();

        testLoops();

        testLoopControl();

        testSwitchDecision();
    }
}
