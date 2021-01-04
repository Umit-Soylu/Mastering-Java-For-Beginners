package com.compiled_with_no_errors.tutorials.program_flow.decision_making;

/**
 * <p>This class will investigate following statements.</p>
 * <ul>
 *     <li>if statements</li>
 *     <li>if-else statements</li>
 *     <li>Multiple if-else statements</li>
 *     <li>Switch statements</li>
 * </ul>
 */
public class IfElseDecisions {

    /**
     * This method check given number is odd or not.
     * @param number Given number
     * @return true if odd; false otherwise
     */
    protected boolean isGivenNumberOdd(byte number){
        boolean result = false;

        if (number % 2 == 1)
            result = true;

        return result;
    }

    /**
     * This method check given number is even or not.
     * @param number Given number
     * @return true if odd; false otherwise
     */
    protected boolean isGivenNumberEven(byte number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method check given number is divisible by 3 or not.
     * @param number Given number
     * @return true if divisible; false otherwise
     */
    protected boolean isGivenNumberDivisibleByThree(byte number){
        boolean result;
        result = (number % 3 == 0) ? true : false;

        return result;
    }

    /**
     * This method checks given number is divisible by 2, 3, or 5.
     * @param number Given number
     * @return 2 if it is even; 3 if it is divisible by 3; 5 if it is divisible by 5
     * @implNote Will return -1 if it is not divisible.
     */
    protected int isGivenNumberDivisibleByTwoUpToFive(byte number){
        int result;

        if (number % 2 == 0)
            result = 2;
        else if(number % 3 == 0)
            result = 3;
        else if (number % 5 == 0)
            result = 5;
        else
            result = -1;

        return result;
    }
}
