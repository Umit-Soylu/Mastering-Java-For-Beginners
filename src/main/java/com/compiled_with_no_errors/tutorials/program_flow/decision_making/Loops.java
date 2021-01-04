package com.compiled_with_no_errors.tutorials.program_flow.decision_making;

/**
 * This class exemplifies loop types
 * <ul>
 *     <li>While loop</li>
 *     <li>Do .. while loop</li>
 *     <li>For loop</li>
 *     <li>Enhanced For loop</li>
 * </ul>
 */
public class Loops {

    /**
     * Print the numbers from '0' to given value
     * @param maxNumber maximum value to print the number
     * @implNote maxNumber is included
     */
    protected void printNumbers(int maxNumber){
        int tmpValue = 0;

        while (tmpValue <= maxNumber){
            System.out.println("Current value for our number is " + tmpValue);
            tmpValue = tmpValue + 1;
        }
    }

    /**
     * Prints the numbers from '0' to given value
     * @param maxNumber maximum value to print the number
     * @implNote prints the initial number at least once, maxNumber is included
     */
    protected void printNumbersAtLeastOnce(int maxNumber){
        int tmpValue = 0;

        do {
            System.out.println("Current value for our number is " + tmpValue);
        } while (++tmpValue <= maxNumber);
    }

    /**
     * Print the numbers from '0' to given value
     * @param maxNumber maximum value to print the number
     * @implNote maxNumber is included
     */
    protected void printNumbersWithALoop(int maxNumber){
        for (int tmpValue = 0; tmpValue <= maxNumber; tmpValue++) {
            System.out.println("Current value for our number is " + tmpValue);
        }
    }

    /**
     * Prints the elements of an array
     * @param numberArray Target Array
     */
    protected void printNumbersOfArray(int[] numberArray){
        /*
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Current value for our number is " + numberArray[i]);
        }
        */
        for (int tmpValue : numberArray) {
            System.out.println("Current value for our number is " + tmpValue);
        }
    }
}
