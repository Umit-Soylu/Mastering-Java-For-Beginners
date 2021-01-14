package com.compiled_with_no_errors.tutorials.oop.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {
    private Dog testClass;

    @BeforeEach
    void setUp() {
        testClass = new Dog();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void getKind() {
        assertEquals("Dog", testClass.getKind());
    }

    @Test
    void bark() {
        testClass.bark();
    }

    @Test
    void printCommonFields() {
        testClass.printCommonFields();
    }
}