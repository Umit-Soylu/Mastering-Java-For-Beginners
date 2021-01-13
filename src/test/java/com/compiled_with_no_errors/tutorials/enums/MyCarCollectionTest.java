package com.compiled_with_no_errors.tutorials.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCarCollectionTest {

    @Test
    void getBrand() {
        // MyCarCollection testClass = new MyCarCollection("TEST");

        assertEquals("BMW", MyCarCollection.business.getBrand());
        assertEquals("Porsche", MyCarCollection.sport.getBrand());
        assertEquals("Jeep", MyCarCollection.daily.getBrand());
    }

    @Test
    void getCars() {
        for (MyCarCollection car : MyCarCollection.getCars()) {
            System.out.println(car.getBrand());
        }
    }
}