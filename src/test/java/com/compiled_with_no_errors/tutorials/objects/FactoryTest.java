package com.compiled_with_no_errors.tutorials.objects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FactoryTest {
    private Factory testClass;

    @BeforeEach
    void setUp() {
        testClass = new Factory();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void buildCars() {
        Car[] result = testClass.buildCars(5);

        for (Car c : result) {
            System.out.println(c);
        }
        assertEquals(5, result.length);
    }

    @Test
    void buildInvalidCars(){
        assertNull(testClass.buildCars(-5));
    }


    @Test
    void getNumberOfCarsBuilt() {
        int x= 5, y = -1, z = 3;

        testClass.buildCars(x);
        assertEquals(x, testClass.getNumberOfCarsBuilt());

        assertNull(testClass.buildCars(y));
        assertEquals(x, testClass.getNumberOfCarsBuilt());

        testClass.buildCars(z);
        assertEquals(x+z, testClass.getNumberOfCarsBuilt());
    }
}