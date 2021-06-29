package com.compiled_with_no_errors.tutorials.oop.abstraction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoleProprietorshipTest {
    private SoleProprietorship testClass;

    @BeforeEach
    void setUp() {
        testClass = new SoleProprietorship(15, "Mastering Java For Beginners");
        assertEquals("Mastering Java For Beginners", testClass.getOwner());
    }

    @Test
    void yearlyProfit() {
        testClass.addIncome(1000F);
        assertEquals(1000F, testClass.yearlyProfit());

        testClass.addExpense(500F);
        assertEquals(500F, testClass.yearlyProfit());

        testClass.addExpense(1500F);
        assertEquals(-1000F, testClass.yearlyProfit());

        testClass.addIncome(10000F);
        assertEquals(9000F, testClass.yearlyProfit());

        testClass.initializeNewBudget();
        assertEquals(0F, testClass.yearlyProfit());
    }

    @Test
    void occupancyRatio() {
        assertEquals(1F/15F, testClass.occupancyRatio());

        testClass.hireEmployee("Compiled with no errors");
        assertEquals(2/15F, testClass.occupancyRatio());

        testClass.terminateEmployee("Compiled with no errors");
        assertEquals(1/15F, testClass.occupancyRatio());
    }

    @Test
    void isActive() {
        assertTrue(testClass.isActive());

        testClass.closeCompany();
        assertFalse(testClass.isActive());

        testClass.openCompany();
        assertTrue(testClass.isActive());
    }
}
