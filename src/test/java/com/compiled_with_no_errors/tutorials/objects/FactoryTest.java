package com.compiled_with_no_errors.tutorials.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FactoryTest {

    @Test
    void buildCars() {
        Car[] result = Factory.buildCars(5);

        for (Car c : result) {
            System.out.println(c);
        }
        assertEquals(5, result.length);
    }

    @Test
    void buildInvalidCars(){
        assertNull(Factory.buildCars(-5));
    }


    @Test
    void getNumberOfCarsBuilt() {
        int x= 5, y = -1, z = 3;

        Factory.buildCars(x);
        assertEquals(x, Factory.getNumberOfCarsBuilt());

        assertNull(Factory.buildCars(y));
        assertEquals(x, Factory.getNumberOfCarsBuilt());

        Factory.buildCars(z);
        assertEquals(x+z, Factory.getNumberOfCarsBuilt());
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