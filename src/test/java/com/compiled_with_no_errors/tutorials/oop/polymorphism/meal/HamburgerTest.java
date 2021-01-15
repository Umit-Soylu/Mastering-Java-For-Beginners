package com.compiled_with_no_errors.tutorials.oop.polymorphism.meal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburgerTest {
    private Hamburger testClass;
    @BeforeEach
    void setUp() {
        testClass = new Hamburger();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void getName() {
        assertEquals("Hamburger", testClass.getName());
    }

    @Test
    void getPreparationTime() {
        assertEquals(15, testClass.getPreparationTime());
    }
}