package com.compiled_with_no_errors.examples.string_parsers;

/**
 * This class parse strings and generate results
 */
public class ParseStrings {

    /**
     * <p>This method evaluates whether or not given input consists of matching parenthesis</p>
     * <p>Following examples are valid inputs:</p>
     * <ul>
     *     <li>2+3</li>
     *     <li>(2+3)</li>
     *     <li>()(2+3)</li>
     *     <li>(())(2+3)</li>
     * </ul>
     * @param input input string to parse
     * @return {@code true} if parenthesis match, {@code false} otherwise.
     */
    public boolean isParenthesisMatched(String input){
        // Return true if there is nothing to parse
        if (input.isEmpty() || input.isBlank())
            return true;

        // Convert input to an character array
        char[] inputArray = input.toCharArray();

        // This array stores '(' parenthesis inside.
        char[] leftParenthesis = new char[inputArray.length];
        int index = 0; // Keep track index.
        leftParenthesis[index] = ' ';

        for (char c : inputArray) {
            if (c == '(')
                leftParenthesis[index++] = c;
            else if (c == ')'){
                // Check whether or not there is an '(' inside the array
                if (index > 0)
                    leftParenthesis[--index] = ' ';
                else
                    return false; //This means there is no '(' to remove but ')' exists.
            }
        }

        /*
        if (leftParenthesis[0] == ' ')
            return true;
        else
            return false;
         */
        return leftParenthesis[0] == ' ';
    }

    /**
     * <p>This method will accept an input and divide it by the given key value and generate 2 tokens based on that.</p>
     * <p>Here are the valid execution examples:</p>
     * <ul>
     *     <li>input='Car-345' & key='-' will generate an array of tokens as 'Car' & '345'</li>
     *     <li>input='Animal:Zebra' & key=':' will generate an array of tokens as 'Animal' & 'Zebra'</li>
     *     <li>input='Mastering Java' & key=' ' will generate an array of tokens as 'Mastering' & 'Java'</li>
     * </ul>
     * @param input Input to be parsed
     * @param key Character to discriminate tokens
     * @return Array of {@link String} with 2 tokens
     */
    public String[] parseTokens(String input, char key){
        // Declare and initialize the tokens
        String[] tokens = new String[2];

        // Generate an array to search for.
        char[] inputArray = input.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == key){
                tokens[0] = input.substring(0, i);
                tokens[1] = input.substring(i+1);
                break;
            }
        }

        return tokens;
    }
}
