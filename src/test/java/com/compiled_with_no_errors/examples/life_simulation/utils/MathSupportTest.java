package com.compiled_with_no_errors.examples.life_simulation.utils;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathSupportTest {
   @Nested
    class randomNumbers {
        private static int lowerCount, upperCount;

        @BeforeAll
        static void setUp() {
            lowerCount = 0;
            upperCount = 0;
        }

        @AfterAll
        static void tearDown() {
            assertTrue(lowerCount > 0);
            assertTrue(upperCount > 0);
        }

        @RepeatedTest(10_000)
        void generateRandomNumber() {
            int lower = -45, upper = 65;
            int x = MathSupport.generateRandomNumber(lower, upper);
            if (x == lower)
                lowerCount++;
            else if (x == upper)
                upperCount++;
            assertTrue(x >= lower && x <= upper, "The value generated is " + x);
        }
    }

    @Test
    void testGenerateRandomNumberWithSameBoundaries() {
        assertEquals(15, MathSupport.generateRandomNumber(15, 15));
        assertEquals(0, MathSupport.generateRandomNumber(0));
    }
}
