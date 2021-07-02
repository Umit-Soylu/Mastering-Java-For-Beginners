package com.compiled_with_no_errors.examples.life_simulation.creatures;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DogTest {
    private static int ID, width, height;

    private Dog testClass;

    @BeforeAll
    static void beforeAll() {
        width = 15;
        height = 10;
    }

    @Nested
    class newDogPerTest {
        @BeforeEach
        void setUp() {
            testClass = new Dog(0, 0, width, height);
            assertEquals("Dog-" + ID++, testClass.getName());
        }

        @Test
        void eat() {
            assertEquals(500, testClass.getCurrentCalorie());

            testClass.eat(500);
            assertEquals(1000, testClass.getCurrentCalorie());
        }

        @Test
        void eatNegative(){
            assertEquals(500, testClass.getCurrentCalorie());

            testClass.eat(-500);
            assertEquals(500, testClass.getCurrentCalorie());
        }
    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class sameDogForAllTests {

        @BeforeAll
        void beforeMovement() {
            testClass = new Dog(0, 0, width, height);
            assertEquals("Dog-" + ID++, testClass.getName());
        }

        @RepeatedTest(150)
        void move() {
            testClass.move();

            assertTrue(testClass.getCurrentLocation()[0] >= 0 && testClass.getCurrentLocation()[0] <= width);
            assertTrue(testClass.getCurrentLocation()[1] >= 0 && testClass.getCurrentLocation()[1] <= height);
        }
    }
}
