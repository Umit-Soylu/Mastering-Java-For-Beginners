package com.compiled_with_no_errors.tutorials.oop.polymorphism;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class OnlineShopTest {
    private OnlineShop testClass;
    @BeforeEach
    void setUp() {
        testClass = new OnlineShop(new Cook("Test"));
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void orderHamburger() {
        assertEquals(3, testClass.orderHamburger(3).length);
        assertNull(testClass.orderPizza(0));
    }

    @Test
    void orderPizza() {
        assertEquals(3, testClass.orderPizza(3).length);
        assertNull(testClass.orderPizza(-5));
    }
}