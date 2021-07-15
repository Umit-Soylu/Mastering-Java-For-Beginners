package com.compiled_with_no_errors.tutorials.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalOperatorTest {
    private MathematicalOperator testClass;

    @BeforeEach
    void setUp() {
        testClass = new MathematicalOperator();
    }

    @Test
    void sumValues() {
        assertEquals(10, testClass.sumValues(1, 2, 3, 4));
    }

    @Test
    void throwExceptionTest(){
        Exception exception = assertThrows(UnknownInputException.class, () -> testClass.sumValues(1, 2, 3 ,-5));
        System.out.println("exception message() = " + exception.getMessage());
        assertTrue(exception.getMessage().contains("-5"));

        assertThrows(IllegalArgumentException.class, () -> testClass.sumValues(0, -2));

        assertThrows(RuntimeException.class, () -> testClass.sumValues(-100));
    }
}
