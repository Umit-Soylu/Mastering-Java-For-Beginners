package com.compiled_with_no_errors.tutorials.oop.abstraction;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitedCompanyTest {
    LimitedCompany testClass;
    private final String owner = "Compiled with no errors";
    private final String[] partners = new String[]{"Mastering", "Java", "For", "Beginners"};

    @BeforeEach
    void setUp() {
        testClass = new LimitedCompany(owner, partners, 10);
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void yearlyProfit() {
        assertEquals(100, testClass.yearlyProfit());
    }

    @Test
    void occupancyRate() {
        assertEquals((float) (1 + partners.length)/10, testClass.occupancyRate());
    }

    @Test
    void updateNumberOfRequiredEmployees() {
        testClass.updateNumberOfRequiredEmployees(5);
        assertEquals((float) (1 + partners.length)/5, testClass.occupancyRate());
    }

    @Test
    void hire() {
        testClass.hire(5);
        assertEquals(1.0, testClass.occupancyRate());
    }

    @Test
    void terminateEmployee() {
        testClass.terminateEmployee(2);
        assertEquals((float) (1 + partners.length - 2)/10, testClass.occupancyRate());
    }

    @Test
    void getBuildDate() {
        System.out.println(testClass.getBuildDate());
        assertNotNull(testClass.getBuildDate());
    }

    @Test
    void isCompanyActive() {
        assertTrue(testClass.isCompanyActive());
    }

    @Test
    void getOwner() {
        assertEquals(owner, testClass.getOwner());
    }

    @Test
    void getPartners() {
        assertArrayEquals(partners, testClass.getPartners());
    }
}