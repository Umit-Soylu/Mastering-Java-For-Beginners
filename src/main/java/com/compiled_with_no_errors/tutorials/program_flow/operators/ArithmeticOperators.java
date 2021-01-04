package com.compiled_with_no_errors.tutorials.program_flow.operators;

/**
 * This class is used for describing arithmetic operators
 */
public class ArithmeticOperators {

    /**
     * This method adds given two float variables.
     * @param x first parameter
     * @param y second parameter
     * @return x + y
     */
    protected double addition(float x, float y){
        return (double) x + y;
    }

    /**
     * This method subtracts given two float variables from each other.
     * @param x first parameter
     * @param y second parameter
     * @return x - y
     */
    protected double subtraction(float x, float y){
        return (double) x - y;
    }

    /**
     * This method multiplies given two float variables.
     * @param x first parameter
     * @param y second parameter
     * @return x * y
     */
    protected double multiplication(float x, float y){
        return (double) x * y;
    }

    /**
     * This method divides given two float variables with each other.
     * @param x first parameter
     * @param y second parameter
     * @return x / y
     */
    protected double division(float x, float y){
        return (double) x / y;
    }

    /**
     * This method adds 1 to the given input
     * @param x input
     * @return x + 1
     * @implNote The result may overflow.
     */
    protected int addByOne(int x){
        return ++x; // If the result overflows, it is cast to int, there is no control over it.
    }

    /**
     * This method subtracts 1 to the given input
     * @param x input
     * @return x - 1
     * @implNote The result may overflow.
     */
    protected int subtractByOne(int x){
        // '--x' is not 'x--'
        return --x; // If the result overflows, it is cast to int, there is no control over it.
    }
}
