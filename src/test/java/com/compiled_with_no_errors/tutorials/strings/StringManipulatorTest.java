package com.compiled_with_no_errors.tutorials.strings;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void investigateStringLocation() {
        String one = "Complied with no errors", two = "Mastering Java for Beginners";

        int locOne = StringManipulator.investigateStringLocation(one),
                locTwo = StringManipulator.investigateStringLocation(two);

        System.out.println("Location for " + one + " is " + locOne);
        System.out.println("Location for " + two + " is " + locTwo);

        assertNotEquals(locOne, locTwo);

        int locThree = StringManipulator.investigateStringLocation(new String(one));
        System.out.println("Location for " + one + " is " + locThree);
        assertNotEquals(locOne, locThree);
    }

    @Nested
    class stringBuilderTest {
        private int currentCapacity;

        @AfterAll
        static void afterAll() {
            assertEquals("Mastering Java For Beginners", StringManipulator.returnString());

            assertEquals(0, StringManipulator.returnString().length());
            System.out.println("Last capacity = " + StringManipulator.getCapacity());
        }

        @BeforeEach
        void setUp() {
            currentCapacity = StringManipulator.getCapacity();
            System.out.println("Before test, currentCapacity = " + currentCapacity);
        }

        @AfterEach
        void tearDown() {
            System.out.println("After test, length = " + StringManipulator.getLength());
            assertTrue(StringManipulator.getCapacity() >= currentCapacity);
        }

        @ParameterizedTest
        @ValueSource(strings = {"Mastering", "Java", "For", "Beginners"})
        void addStrings(String s) {
            StringManipulator.addStrings(s);
        }
    }
}
