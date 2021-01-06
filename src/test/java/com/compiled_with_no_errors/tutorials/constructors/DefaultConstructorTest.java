package com.compiled_with_no_errors.tutorials.constructors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
class DefaultConstructorTest {
    // Declaration of the field
    DefaultConstructor testClass;

    @Test
    void getName() {
        // Instantiate the field
        testClass = new DefaultConstructor();

        assertNull(testClass.getName());
    }

    @Test
    void setName() {
        // Instantiate the field
        testClass = new DefaultConstructor();

        // Initialize the value
        testClass.setName("Learning Java");

        assertEquals("Learning Java", testClass.getName());
    }
}