package com.compiled_with_no_errors.tutorials.program_flow;

public class TestProgramFlows {

    /**
     * This method test {@link ArithmeticOperators}
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


    public static void main(String[] args) {
        testArithmeticOperators();
    }
}
