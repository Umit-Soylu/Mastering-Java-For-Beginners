package com.compiled_with_no_errors.examples.simulation.utils;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathSupportTest {
    private static int min, max;

    @BeforeAll
    static void beforeAll() {
        min = -5;
        max = 54;
    }


    @Test
    void generateRandomWithWrongInputs(){
        int x = MathSupport.generateRandomInteger(max, min);
        assertTrue(x >= min && x <= max);
    }

    @RepeatedTest(100)
    void generateRandomWithSameBoundary(){
        int x = MathSupport.generateRandomInteger(15, 15);
        assertEquals(15, x);
    }

    @RepeatedTest(100)
    void generateRandomWithSameBoundary2(){
        int x = MathSupport.generateRandomInteger(-15, -15);
        assertEquals(-15, x);
    }

    @Nested
    class randomNumbers {
        private static int minCount, maxCount;

        @AfterAll
        static void afterAll() {
            assertTrue(minCount > 0);
            assertTrue(maxCount > 0);
            System.out.println("Min count is " + minCount + ", and max count is " + maxCount);
        }

        @RepeatedTest(10_000)
        void generateRandomInteger() {
            int x = MathSupport.generateRandomInteger(min, max);

            if (x == min)
                minCount++;
            else if (x == max)
                maxCount++;

            assertTrue(x >= min && x <= max);
        }
    }
}
