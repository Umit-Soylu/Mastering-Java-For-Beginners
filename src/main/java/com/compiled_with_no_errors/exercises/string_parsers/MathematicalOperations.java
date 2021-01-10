package com.compiled_with_no_errors.exercises.string_parsers;

/**
 * This class parses given {@link String} and executes mathematical operations.
 */
public class MathematicalOperations {

    /**
     * <p>This method parses simple mathematical equations</p>
     * <p>Here are some valid examples:</p>
     * <ul>
     *     <li>2 + 3</li>
     *     <li>2 - 3</li>
     *     <li>2 / 3</li>
     *     <li>2 * 3</li>
     * </ul>
     * <p>Here are some invalid examples:</p>
     * <ul>
     *     <li>2+3</li>
     *     <li>2 - 3 * 9</li>
     *     <li>( 2 / 3 )</li>
     *     <li>2 % 4</li>
     * </ul>
     * @param equation mathematical equation to be parsed
     * @return result of the equation, {@code null} if input is not valid
     * @apiNote <p>Input numbers should be separated by empty space.</p>
     */
    public Double parseBasicEquation(String equation){
        Double result = null;

        // Generate tokens
        String[] tokens = equation.split("\\s+");

        // Check if input or token size is valid;
        if (equation.isEmpty() || equation.isBlank() || tokens.length != 3)
            return result;

        // Execute equation
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[2]);

        switch (tokens[1]){
            case "+":
                result = (double) x + y;
                break;
            case "-":
                result = (double) x - y;
                break;
            case "*":
                result = (double) x * y;
                break;
            case "/":
                result = (double) x / y;
                break;
            default:
                break;
        }

        return result;
    }
}
