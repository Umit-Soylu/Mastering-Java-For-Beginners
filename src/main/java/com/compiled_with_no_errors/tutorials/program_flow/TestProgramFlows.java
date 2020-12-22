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

    public static void main(String[] args) {
        //testArithmeticOperators();

        testBitwiseOperators();
    }
}
