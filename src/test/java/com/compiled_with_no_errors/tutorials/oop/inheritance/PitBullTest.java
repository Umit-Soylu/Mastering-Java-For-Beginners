package com.compiled_with_no_errors.tutorials.oop.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PitBullTest {
    private PitBull testClass;
    @BeforeEach
    void setUp() {
        testClass = new PitBull();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void getKind() {
        assertEquals("PitBull", testClass.getKind());
    }
}