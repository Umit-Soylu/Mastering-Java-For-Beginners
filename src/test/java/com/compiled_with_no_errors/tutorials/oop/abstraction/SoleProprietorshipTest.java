package com.compiled_with_no_errors.tutorials.oop.abstraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoleProprietorshipTest {
    private SoleProprietorship testClass;

    @BeforeEach
    void setUp() {
        testClass = new SoleProprietorship("Mastering Java", null, 200);
        Assertions.assertEquals(1/50F, testClass.occupancyRate());
        Assertions.assertEquals("Mastering Java", testClass.getName());
        Assertions.assertEquals("Mastering Java", testClass.getOwner());
    }

    @Test
    void isActive() {
        Assertions.assertTrue(testClass.isCompanyActive());
    }

}
