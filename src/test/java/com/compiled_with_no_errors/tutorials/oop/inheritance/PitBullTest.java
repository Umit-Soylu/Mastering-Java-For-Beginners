package com.compiled_with_no_errors.tutorials.oop.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PitBullTest {

    @Test
    void typeTest() {
        PitBull testClass = new PitBull();

        assertEquals("PitBull", testClass.getKind());
    }

    @Test
    void attack() {
        PitBull testClass = new PitBull();
        testClass.attack();
    }
}