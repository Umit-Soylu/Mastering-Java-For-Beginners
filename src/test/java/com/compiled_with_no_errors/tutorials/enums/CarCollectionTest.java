package com.compiled_with_no_errors.tutorials.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CarCollectionTest {

    @Test
    void values() {
        for (CarCollection car: CarCollection.values()) {
            System.out.println(car);
        }
    }

    @Test
    void getBrand() {
        assertEquals("BMW", CarCollection.business.getBrand());
        assertEquals("Porsche", CarCollection.sport.getBrand());
        assertEquals("Jeep", CarCollection.daily.getBrand());
    }

    @Test
    void getOrdinals(){
        for (CarCollection car: CarCollection.values()) {
            System.out.println(car.ordinal() + ": " + car);
        }
    }

    @Test
    void convertEnum(){
       CarCollection car = CarCollection.valueOf("business");
       assertEquals(CarCollection.business, car);

       System.out.println(car + " with ordinal " + car.ordinal() + " with brand " + car.getBrand());
    }
}