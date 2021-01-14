package com.compiled_with_no_errors.tutorials.oop.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    private Animal genericAnimal;

    @BeforeEach
    void setUp() {
        genericAnimal = new Animal("Common-Animal");
    }

    @AfterEach
    void tearDown() {
        genericAnimal = null;
    }

    @Test
    void move() {
        int[] location = new int[]{0, 0};

        assertArrayEquals(location, genericAnimal.getLocation());

        genericAnimal.move();
        for (int loc : genericAnimal.getLocation()) {
            System.out.println("loc = " + loc);
        }
    }

    @Test
    void getKind() {
        assertEquals("Common-Animal", genericAnimal.getKind());
    }
}