package com.compiled_with_no_errors.tutorials.oop.polymorphism;

import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Hamburger;
import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Meal;
import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class CookTest {
    private Cook testClass;
    @BeforeEach
    void setUp() {
        testClass = new Cook("Dummy");
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void prepareMeal() {
        assertEquals(Pizza.class, testClass.prepareMeal("Pizza").getClass());
        assertEquals(Hamburger.class, testClass.prepareMeal("Hamburger").getClass());

        assertNull(testClass.prepareMeal("Dummy"));
    }

    @Test
    void testPrepareMeal() {
        Meal[] meals = testClass.prepareMeal("Pizza", 5);

        for (Meal meal : meals) {
            assertEquals(Pizza.class, meal.getClass());
        }
        
        meals = testClass.prepareMeal("Hamburger", 3);
        for (Meal meal : meals) {
            assertEquals(Hamburger.class, meal.getClass());
        }
    }
}

