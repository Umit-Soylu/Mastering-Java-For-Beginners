package com.compiled_with_no_errors.tutorials.oop.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BirdTest {
    private Bird testClass;
    @BeforeEach
    void setUp() {
        testClass = new Bird();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void fly() {
        int[] defaultLocation = new int[]{0, 0};
        assertArrayEquals(defaultLocation, testClass.getLocation().getLocation());

        testClass.fly();
        System.out.println(testClass.getLocation());
    }
}