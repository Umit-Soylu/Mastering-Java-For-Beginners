package com.compiled_with_no_errors.tutorials.modifiers.access_modifiers;

public class TestCommon {


    public static void main(String[] args) {
        Common testClass = new Common();

        System.out.println("testClass.name = " + testClass.name);
        System.out.println("testClass.message = " + testClass.message);

        testClass.printMyName();
        testClass.printMyFamilyName();

        SecureClass testSecureClass = new SecureClass();
        System.out.println("testSecureClass.name = " + testSecureClass.name);
        System.out.println("testSecureClass.message = " + testSecureClass.message);

        testSecureClass.printMyName();
        testSecureClass.printMyFamilyName();
    }
}
