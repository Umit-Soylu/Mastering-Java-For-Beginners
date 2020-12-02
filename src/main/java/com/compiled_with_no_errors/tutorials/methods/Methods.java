package com.compiled_with_no_errors.tutorials.methods;

public class Methods {

    /**
     * This method accepts no parameters and prints a single line.
     */
    public void methodWithNoParameters(){
        System.out.println("This method, 'methodWithNoParameters', accepts no parameters and returns nothing.");
    }

    /**
     * This method prints its parameter.
     * @param callerName This is a String input to be printed
     */
    public void methodWithParameters(String callerName){
        System.out.println("This method, 'methodWithParameters', accepts the following parameter: " + callerName);
    }

    /**
     * This method will return a single value
     * @return 1
     */
    public int methodReturningInt(){
        int localInt = 1;
        System.out.println("This method, 'methodReturningInt', will return the following value: " + localInt);

        return localInt;
    }

    // Access modifiers - static/class - return type - name - parameters
    public static void main(String[] args) {
        System.out.println("Methods.main");

        // Initialize object for methods class.
        Methods object = new Methods();
        int methodResult = -100;
        
        object.methodWithNoParameters();

        object.methodWithParameters("main method");

        System.out.println("methodResult = " + methodResult);
        methodResult = object.methodReturningInt();             // Same as 'methodResult = 1;'
        System.out.println("methodResult = " + methodResult);
    }
}
