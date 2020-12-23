package com.compiled_with_no_errors.tutorials.program_flow;

/**
 * This class includes examples for Assignment Operators
 */
public class AssignmentOperators {

    /**
     * This method accepts two parameters and adds second parameter to the first one.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x += y';
     */
    protected void addAndAssignItself(int x, int y) {
        int temp = x;
        x += y; // Same as x = x + y;

        System.out.println(temp + " + " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and subtracts second parameter from the first one.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x -= y';
     */
    protected void subtractAndAssignItself(int x, int y) {
        int temp = x;
        x -= y; // x = x - y;

        System.out.println(temp + " - " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and divide first one to second one.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x /= y';
     */
    protected void divideAndAssignItself(int x, int y) {
        int temp = x;
        x /= y; // x = x / y;

        System.out.println(temp + " / " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and multiplies them.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x *= y';
     */
    protected void multiplyAndAssignItself(int x, int y) {
        int temp = x;
        x *= y; // x = x * y;

        System.out.println(temp + " * " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and mods left one to the right one.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x %= y';
     */
    protected void modAndAssignItself(int x, int y) {
        int temp = x;
        x %= y; // x = x % y;

        System.out.println(temp + " * " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and applies bitwise and to the left one.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x &= y';
     */
    protected void bitwiseAndAndAssignItself(int x, int y) {
        int temp = x;
        x &= y; // x = x & y;

        System.out.println(temp + " & " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and applies bitwise or to the left one.
     *
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x |= y';
     */
    protected void bitwiseOrAndAssignItself(int x, int y) {
        int temp = x;
        x |= y; // x = x & y;

        System.out.println(temp + " | " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and applies left shift to the left one.
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x <<= y';
     */
    protected void leftShiftAndAssignItself(int x, int y) {
        int temp = x;
        x <<= y; // x = x << y;

        System.out.println(temp + " << " + y + " = " + x);
    }

    /**
     * This method accepts two parameters and applies left shift to the left one.
     * @param x first parameter
     * @param y second parameter
     * @implNote Executes 'x <<= y';
     */
    protected void rightShiftAndAssignItself(int x, int y) {
        int temp = x;
        x >>= y; // x = x >> y;

        System.out.println(temp + " >> " + y + " = " + x);
    }
}
