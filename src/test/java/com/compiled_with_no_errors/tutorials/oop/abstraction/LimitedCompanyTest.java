package com.compiled_with_no_errors.tutorials.oop.abstraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LimitedCompanyTest {
    private LimitedCompany testCompany;

    @BeforeEach
    void setUp() {
        testCompany = new LimitedCompany("Mastering Java", "Compiled with No Errors", 5);
        Assertions.assertEquals(1/50f, testCompany.occupancyRate());
    }


    @Test
    void yearlyProfit() {
        testCompany.addIncome(1000F);
        Assertions.assertEquals(1000F, testCompany.yearlyProfit());

        testCompany.addIncome(500F);
        Assertions.assertEquals(1500F, testCompany.yearlyProfit());

        testCompany.addExpense(800F);
        Assertions.assertEquals(700F, testCompany.yearlyProfit());
    }

    @Test
    void occupancyRate() {
        testCompany.hireEmployee("Person-1");
        Assertions.assertEquals(2/50F, testCompany.occupancyRate());

        testCompany.hireEmployee("Person-2");
        Assertions.assertEquals(3/50F, testCompany.occupancyRate());

        testCompany.terminateEmployee("test");
        Assertions.assertEquals(2/50F, testCompany.occupancyRate());
    }

    @Test
    void isCompanyActive() {
        Assertions.assertTrue(testCompany.isCompanyActive());

        testCompany.inactivateCompany();
        Assertions.assertFalse(testCompany.isCompanyActive());
    }
}
