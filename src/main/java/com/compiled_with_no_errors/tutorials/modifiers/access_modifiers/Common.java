package com.compiled_with_no_errors.tutorials.modifiers.access_modifiers;

/**
 * This class is used for learning access modifiers
 */
public class Common {

    public String name = "This is Common class";

    protected String message = "This is a protected message!";

    private String privateMessage = "This message belongs to me.";

    public void printMyName(){
        System.out.println("This is a public method.");
    }

    protected void printMyFamilyName(){
        System.out.println("This is a protected method, no outsiders allowed.");
    }

    private void printMyMood(){
        System.out.println("I am fine.");
    }
}
