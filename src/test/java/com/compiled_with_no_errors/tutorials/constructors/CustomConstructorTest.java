package com.compiled_with_no_errors.tutorials.constructors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomConstructorTest {

    // Declare field
    CustomConstructor testClass;

    @Test
    void getName() {
        //Instantiate & initialize test class
        testClass = new CustomConstructor("Mastering Java");

        assertEquals("Mastering Java", testClass.getName());
    }


    @Test
    void testConstructor(){
        // Should call according to constructor definition
        testClass =  new CustomConstructor();

        assertEquals("Default", testClass.getName());

        // Private constructors are not accessible.
        // testClass = new CustomConstructor("String", "Input");
    }
}