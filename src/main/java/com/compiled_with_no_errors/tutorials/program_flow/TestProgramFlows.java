package com.compiled_with_no_errors.tutorials.program_flow;

public class TestProgramFlows {

    /**
     * This method tests {@link ArithmeticOperators}
     */
    private static void testArithmeticOperators(){
        // Initialize test class.
        ArithmeticOperators testClass = new ArithmeticOperators();

        // First test case.
        float x = 1.0F, y = 2.0F;
        System.out.println(x + " + " + y + " = " + testClass.addition(x, y));

        // Second test case.
        x = -1.0F;
        y = -2.0F;
        System.out.println(x + " + " + y + " = " + testClass.addition(x, y));

        // Third test case.
        x = Float.MAX_VALUE;
        y = +200.150F;
        System.out.println(x + " + " + y + " = " + testClass.addition(x, y));

        // Forth test case.
        x = Float.MIN_VALUE;
        y = -200.150F;
        System.out.println(x + " + " + y + " = " + testClass.addition(x, y));

        // Fifth test case.
        x = 1F;
        y = 2F;
        System.out.println(x + " - " + y + " = " + testClass.subtraction(x, y));

        // Sixth test case.
        x = -1F;
        y = -2F;
        System.out.println(x + " - " + y + " = " + testClass.subtraction(x, y));

        // Seventh test case.
        x = Float.MAX_VALUE;
        y = -2F;
        System.out.println(x + " - " + y + " = " + testClass.subtraction(x, y));

        // Eighth test case.
        x = Float.MAX_VALUE;
        y = 2.0F;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Ninth test case.
        x = Float.MAX_VALUE;
        y = -2.0F;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Tenth test case.
        x = Float.MAX_VALUE;
        y = 0.0F;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Eleventh test case.
        x = Float.NaN;
        y = 2.0F;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Twelfth test case.
        x = Float.POSITIVE_INFINITY;
        y = 2.0F;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Thirteenth test case.
        x = Float.NEGATIVE_INFINITY;
        y = 2.0F;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Fourteenth test case.
        x = Float.POSITIVE_INFINITY;
        y = Float.NEGATIVE_INFINITY;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Fifteenth test case.
        x = Float.POSITIVE_INFINITY;
        y = Float.NaN;
        System.out.println(x + " * " + y + " = " + testClass.multiplication(x, y));

        // Sixteenth test case.
        x = 10F;
        y = 2F;
        System.out.println(x + " / " + y + " = " + testClass.division(x, y));

        // Seventeenth test case.
        x = Float.POSITIVE_INFINITY;
        y = 2F;
        System.out.println(x + " / " + y + " = " + testClass.division(x, y));

        // Eighteenth test case.
        x = Float.NEGATIVE_INFINITY;
        y = 2F;
        System.out.println(x + " / " + y + " = " + testClass.division(x, y));

        // Nineteenth test case.
        x = Float.NaN;
        y = Float.NEGATIVE_INFINITY;
        System.out.println(x + " / " + y + " = " + testClass.division(x, y));

        // Twentieth test case.
        x = -10F;
        y = 2F;
        System.out.println(x + " / " + y + " = " + testClass.division(x, y));

        // Twenty-one test case.
        int input = 5;
        System.out.println(input+ " + 1 = " + testClass.addByOne(input));

        // Twenty-two test case.
        input = Integer.MAX_VALUE;
        System.out.println(input+ " + 1 = " + testClass.addByOne(input));

        // Twenty-one test case.
        input = 5;
        System.out.println(input+ " - 1 = " + testClass.subtractByOne(input));

        // Twenty-two test case.
        input = Integer.MIN_VALUE;
        System.out.println(input+ " - 1 = " + testClass.subtractByOne(input));
    }

    /**
     * This method tests {@link RelationalOperators}
     */
    private static void testRelationalOperators(){
        // Initialize the class.
        RelationalOperators testClass = new RelationalOperators();

        // First test
        float x = 1.0F;
        float y = -1.0F;
        testClass.computeRelations(x, y);

        // Second test
        x = -55.55F;
        y = -55.55F;
        testClass.computeRelations(x, y);

        // Third test
        x = Float.NaN;
        y = Float.NaN;
        testClass.computeRelations(x, y);

        // Forth test
        x = Float.POSITIVE_INFINITY;
        y = Float.NaN;
        testClass.computeRelations(x, y);

        // Fifth test
        x = Float.POSITIVE_INFINITY;
        y = Float.NEGATIVE_INFINITY;
        testClass.computeRelations(x, y);
    }

    /**
     * This class tests {@link BitwiseOperators}
     */
    private static void testBitwiseOperators(){
        // Initialize test class
        BitwiseOperators testClass = new BitwiseOperators();

        // First test
        int x = 5; // 0b0101;
        int y = 4; // 0b0100;
        testClass.andOperator(x, y);

        // Second test
        x = 10;     // 0b1010
        y = 5;      // 0b0101
        int z = 1;  // 0b0001
        testClass.orOperator(x, y, z);

        // Third test
        x = 5;
        y = 4;
        testClass.xorOperator(x, y);

        // Forth test
        x = 5;
        y = 1;
        testClass.leftShiftOperator(x, y);

        // Fifth test
        x = 5;
        y = 3;
        testClass.leftShiftOperator(x, y);

        // Sixth test
        x = 5;
        y = 33; // Will shift by 1 (33 % 32 = 1)
        testClass.leftShiftOperator(x, y);

        // Seventh test
        x = 5;
        y = 1;
        testClass.rightShiftOperator(x, y);

        // Eight test
        x = 5;
        y = 3;
        testClass.rightShiftOperator(x, y);

        // Ninth test
        x = 5;
        y = 33;
        testClass.rightShiftOperator(x, y);
    }

    /**
     * This class tests {@link LogicalOperators}
     */
    private static void testLogicalOperators(){
        // Initialize the class
        LogicalOperators testClass = new LogicalOperators();

        int x, y;

        // First test
        x = -3;
        y = 4;
        testClass.applyLogicalOperators(x, y);

        // Second test
        x = 15;
        y = -100;
        testClass.applyLogicalOperators(x, y);

        // Third test
        x = (int) (Math.random() * 100);            // Becomes 0 .. 100
        y = (int) Math.round(Math.random() * 100);  // Becomes 0 .. 100
        testClass.applyLogicalOperators(x, y);
    }

    /**
     * This class tests {@link AssignmentOperators}
     */
    private static void testAssignmentOperators(){
        // Initialize test class
        AssignmentOperators testClass = new AssignmentOperators();

        // Declare two local variables
        int x, y;

        // First test
        x = 5;
        y = 1500;
        testClass.addAndAssignItself(x, y);

        // Second test
        x = Integer.MIN_VALUE;
        y = -10;
        testClass.addAndAssignItself(x, y);

        // Third test
        x = Integer.MAX_VALUE;
        y = 10;
        testClass.addAndAssignItself(x, y);

        // Forth test
        x = 45;
        y = -33;
        testClass.subtractAndAssignItself(x, y);

        // Fifth test
        x = Integer.MIN_VALUE;
        y = 1;
        testClass.subtractAndAssignItself(x, y);

        // Sixth test
        x = Integer.MAX_VALUE;
        y = -1;
        testClass.subtractAndAssignItself(x, y);

        // Seventh test
        x = 150;
        y = 3;
        testClass.divideAndAssignItself(x, y);

        // Eighth test
        x = 150;
        y = 4;
        testClass.divideAndAssignItself(x, y);

        // Ninth test
        x = 5;
        y = 3;
        testClass.multiplyAndAssignItself(x, y);

        // Tenth test
        x = Integer.MAX_VALUE;
        y = 3;
        testClass.multiplyAndAssignItself(x, y);

        // Eleventh test
        x = 10;
        y = 2;
        testClass.modAndAssignItself(x, y);

        // Twelfth test
        x = 10;
        y = 3;
        testClass.modAndAssignItself(x, y);

        // Thirteenth test
        x = 0b0101; // 5
        y = 0b0100; // 4
        testClass.bitwiseAndAndAssignItself(x, y);

        // Fourteenth test
        x = 0b0100; // 4
        y = 0b1110; // 14
        testClass.bitwiseOrAndAssignItself(x, y);

        // Fifteenth test
        x = 0b0001; // 1
        y = 2;
        testClass.leftShiftAndAssignItself(x, y);

        // Sixteenth test
        // Fifteenth test
        x = 0b0100; // 4
        y = 2;
        testClass.rightShiftAndAssignItself(x, y);
    }


    public static void main(String[] args) {
        testArithmeticOperators();

        testRelationalOperators();

        testBitwiseOperators();

        testLogicalOperators();

        testAssignmentOperators();
    }
}
