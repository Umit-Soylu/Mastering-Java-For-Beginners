package com.compiled_with_no_errors.tutorials.exceptions;

public class MathematicalOperator {
    /**
     * Sum all given inputs
     * @param values Positive integer values
     * @return Sum of inputs
     */
    public int sumValues(int... values){
        int sum = 0;
        for (int value : values) {
            if (value > 0)
                sum += value;
            else
                throw new UnknownInputException(String.valueOf(value));
        }
        return sum;
   }
}
