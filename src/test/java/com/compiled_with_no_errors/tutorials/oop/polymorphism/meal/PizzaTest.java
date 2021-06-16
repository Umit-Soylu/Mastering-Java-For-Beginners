package com.compiled_with_no_errors.tutorials.oop.polymorphism.meal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {
    private Pizza testClass;

    @BeforeEach
    void setUp() {
        testClass = new Pizza();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void getName() {
        assertEquals("Pizza", testClass.getName());
    }

    @Test
    void getPreparationTime() {
        assertEquals(12 * 60 * 1000, testClass.getPreparationTime());
    }


}