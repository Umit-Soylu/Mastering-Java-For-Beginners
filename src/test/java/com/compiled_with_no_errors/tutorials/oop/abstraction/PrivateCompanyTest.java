package com.compiled_with_no_errors.tutorials.oop.abstraction;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrivateCompanyTest {
    PrivateCompany testMethod;
    private String name = "Compiled with no errors";
    @BeforeEach
    void setUp() {
        testMethod = new PrivateCompany(name, 1);
    }

    @AfterEach
    void tearDown() {
        testMethod = null;
    }

    @Test
    void yearlyProfit() {
        assertEquals(100, testMethod.yearlyProfit());
    }

    @Test
    void occupancyRate() {
        assertEquals(1, testMethod.occupancyRate());
    }

    @Test
    void updateNumberOfRequiredEmployees() {
        testMethod.updateNumberOfRequiredEmployees(5);
        assertEquals((float) 1 / 5, testMethod.occupancyRate());
    }

    @Test
    void hire() {
        testMethod.updateNumberOfRequiredEmployees(5);
        testMethod.hire(3);
        assertEquals((float) 4 / 5, testMethod.occupancyRate());
    }

    @Test
    void terminateEmployee() {
        testMethod.updateNumberOfRequiredEmployees(5);
        testMethod.hire(3);
        testMethod.terminateEmployee(1);
        assertEquals((float) 3 / 5, testMethod.occupancyRate());
    }

    @Test
    void isCompanyActive() {
        assertTrue(testMethod.isCompanyActive());
    }
}