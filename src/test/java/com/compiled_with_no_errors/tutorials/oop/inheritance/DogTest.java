package com.compiled_with_no_errors.tutorials.oop.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
    void bark() {
        testClass.bark();
    }


    @Test
    void move() {
        int[] currentLocation = new int[]{0 ,0};

        assertArrayEquals(currentLocation, testClass.getLocation());

        testClass.move();
        for (int loc : testClass.getLocation()) {
            System.out.println(loc);
        }
    }

    @Test
    void getKind() {
        assertEquals("Dog", testClass.getKind());
    }
}