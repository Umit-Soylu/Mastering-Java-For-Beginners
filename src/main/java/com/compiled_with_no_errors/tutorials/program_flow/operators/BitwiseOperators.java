package com.compiled_with_no_errors.tutorials.program_flow.operators;

/**
 * This class will use Bitwise Operators
 */
public class BitwiseOperators {


    private void printBitValue(String message, int number){
        // Radix: 2 for binary; 8 for octal; 16 hexadecimal; 10 for decimal (default)
        System.out.println(message + " is " + String.format("%8s", Integer.toString(number, 2)) + " = '" + number + "'");
    }

    /**
     * This method accepts two parameters and prints bitwise and result
     * @param x first parameter
     * @param y second parameter
     */
    protected void andOperator(int x, int y){
        printBitValue("Number-1", x);
        printBitValue("Number-2", y);

        int result = x & y; // This is not && (logical and)
        printBitValue("  Result", result);
    }

    /**
     * This method accepts three parameters and prints bitwise or result
     * @param x first parameter
     * @param y second parameter
     * @param z third parameter
     */
    protected void orOperator(int x, int y, int z){
        printBitValue("Number-1", x);
        printBitValue("Number-2", y);
        printBitValue("Number-3", z);

        int result = x | y | z; // This is not || (logical or)
        printBitValue("  Result", result);
    }

    /**
     * This method accepts two parameters and prints bitwise xor
     * @param x first parameter
     * @param y second parameter
     * @implNote 1 xor 0 = 1; 0 xor 1 = 1; 1 xor 1 = 0; 0 xor 0 = 0;
     */
    protected void xorOperator(int x, int y){
        printBitValue("Number-1", x);
        printBitValue("Number-2", y);

        int result = x ^ y;
        printBitValue("  Result", result);
    }

    /**
     * This method accepts a number and shifts its bits by given size
     * @param number the number itself
     * @param shiftSize number of left shift operations
     * @implNote The input shiftSize will be accepted after mod 32 (Ex: 33 % 32 = 1)
     */
    protected void leftShiftOperator(int number, int shiftSize){
        printBitValue("Number", number);
        System.out.println("Shift by " + shiftSize);

        int result = number << shiftSize;
        printBitValue("Result", result);
    }

    /**
     * This method accepts a number and shifts its bits by given size
     * @param number the number itself
     * @param shiftSize number of right shift operations
     * @implNote The input shiftSize will be accepted after mod 32 (Ex: 33 % 32 = 1)
     */
    protected void rightShiftOperator(int number, int shiftSize){
        printBitValue("Number", number);
        System.out.println("Shift by " + shiftSize);

        int result = number >> shiftSize;
        printBitValue("Result", result);
    }


}
