package com.compiled_with_no_errors.tutorials.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FactoryTest {
    private int initialCarCount;

    @BeforeEach
    void setUp() {
        initialCarCount = Factory.getNumberOfCarsBuilt();
    }

    @Test
    void buildCars() {
        Car[] result = Factory.buildCars(5);

        for (Car c : result) {
            System.out.println(c);
        }
        assertEquals(5 + initialCarCount, result.length);
    }

    @Test
    void buildInvalidCars(){
        assertNull(Factory.buildCars(-5));
    }


    @Test
    void getNumberOfCarsBuilt() {
        int x= 5, y = -1, z = 3;

        Factory.buildCars(x);
        assertEquals(x + initialCarCount, Factory.getNumberOfCarsBuilt());

        assertNull(Factory.buildCars(y));
        assertEquals(x + initialCarCount, Factory.getNumberOfCarsBuilt());

        Factory.buildCars(z);
        assertEquals(x+z + initialCarCount, Factory.getNumberOfCarsBuilt());
    }

    /*
    @Test
    void demo(){
        Factory testClass = new Factory();
        testClass.dummy();

        Factory secondObject = new Factory();
        secondObject.dummy();
    }*/
}
