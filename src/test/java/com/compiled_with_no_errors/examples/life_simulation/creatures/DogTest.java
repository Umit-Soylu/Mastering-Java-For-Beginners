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
            testClass = new Dog(0, 0, width, height, Dog.DEFAULT_DNA);
            assertEquals("Dog-" + ID++, testClass.getName());
        }

        @Test
        void eat() {
            assertEquals(Dog.DEFAULT_DNA.birthCalorie(), testClass.getCurrentCalorie());

            testClass.eat(500);
            assertEquals(Dog.DEFAULT_DNA.birthCalorie() + 500, testClass.getCurrentCalorie());
        }

        @Test
        void eatNegative(){
            assertEquals(Dog.DEFAULT_DNA.birthCalorie(), testClass.getCurrentCalorie());

            testClass.eat(-500);
            assertEquals(Dog.DEFAULT_DNA.birthCalorie(), testClass.getCurrentCalorie());
        }
    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class sameDogForAllTests {

        @BeforeAll
        void beforeMovement() {
            testClass = new Dog(0, 0, width, height, Dog.DEFAULT_DNA);
            assertEquals("Dog-" + ID++, testClass.getName());
        }

        @RepeatedTest(150)
        void move() {
            int currentCalorie = testClass.getCurrentCalorie();
            int[] currentPosition = testClass.getCurrentLocation();

            testClass.move();

            // Position Check
            assertTrue(testClass.getCurrentLocation()[0] >= 0 && testClass.getCurrentLocation()[0] <= width);
            assertTrue(testClass.getCurrentLocation()[1] >= 0 && testClass.getCurrentLocation()[1] <= height);
            // Distance Check
            assertTrue(testClass.getCurrentLocation()[0] - currentPosition[0] <= Dog.DEFAULT_DNA.walkDistance() ||
                    testClass.getCurrentLocation()[0] - currentPosition[0] <= width - Dog.DEFAULT_DNA.walkDistance());
            assertTrue(testClass.getCurrentLocation()[1] - currentPosition[1] <= Dog.DEFAULT_DNA.walkDistance() ||
                    testClass.getCurrentLocation()[1] - currentPosition[1] <= height - Dog.DEFAULT_DNA.walkDistance());
            // Calorie check
            assertEquals(testClass.getCurrentCalorie(), currentCalorie - Dog.DEFAULT_DNA.movementCalorie());
        }
    }
}
