package com.compiled_with_no_errors.tutorials.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private String one, two, three, four;

    @BeforeEach
    void setUp() {
        one = "Mastering Java For Beginners";
        two = "Compiled With No Errors";
        three = one;
        four = new String(two);
    }

    @Test
    void nullCheck() {
        assertThrows(NullPointerException.class, () -> StringManipulator.areStringsEqual(null, ""));
        assertThrows(NullPointerException.class, () -> StringManipulator.areStringsEqual(null, null));

        assertThrows(NullPointerException.class, () -> StringManipulator.areContentsEqual(null, null));
        assertThrows(NullPointerException.class, () -> StringManipulator.areContentsEqual("null", null));

        assertThrows(NullPointerException.class, () -> StringManipulator.generateString(null, ""));
        assertThrows(NullPointerException.class, () -> StringManipulator.generateString("", null));
    }

    @Test
    void areStringsEqual() {
        assertFalse(StringManipulator.areStringsEqual(one, two));

        assertTrue(StringManipulator.areStringsEqual(three, one));

        assertFalse(StringManipulator.areStringsEqual(four, two));
    }

    @Test
    void areContentsIdentical(){
        assertFalse(StringManipulator.areContentsEqual(one, two));
        assertTrue(StringManipulator.areContentsEqual(one, three));
        assertTrue(StringManipulator.areContentsEqual(two, four));
    }

    @Test
    void testStringBuilder() {
        assertEquals("Mastering, Java, For, Beginners", StringManipulator.generateString(", ", "Mastering", "Java", "For", "Beginners"));
        assertEquals("Mastering Java For Beginners and Compiled with No Errors", StringManipulator.generateString(" ", "Mastering", "Java", "For", "Beginners", "and", "Compiled", "with", "No", "Errors"));
    }

    @Test
    void displayGenericTest() {
        assertDoesNotThrow(() -> StringManipulator.displayGenericString("Mastering Java For Beginners", new char[]{'J', 'A', 'V', 'A'}));
    }

    @Test
    void displayNumericTest() {
        assertDoesNotThrow(() -> StringManipulator.displayNumbers(-1904, Float.NEGATIVE_INFINITY));
        assertDoesNotThrow(() -> StringManipulator.displayNumbers(15_508, 25.56E-41F));
    }
}
