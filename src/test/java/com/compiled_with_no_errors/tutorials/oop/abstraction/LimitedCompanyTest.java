package com.compiled_with_no_errors.tutorials.oop.abstraction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitedCompanyTest {
    private LimitedCompany testClass;

    @BeforeEach
    void setUp() {
        String[] owners = new String[]{"Compiled", "with", "no", "errors"};
        testClass = new LimitedCompany(5000, owners);

        assertArrayEquals(owners, testClass.getOwners());
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
        assertEquals(4F/5000F, testClass.occupancyRatio());

        testClass.hireEmployee("Compiled with no errors");
        assertEquals(5/5000F, testClass.occupancyRatio());

        testClass.terminateEmployee("Compiled with no errors");
        assertEquals(4/5000F, testClass.occupancyRatio());
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
