package com.compiled_with_no_errors.tutorials.enums;

/**
 * This enum stores the information of Cars owned
 */
public enum CarCollection {
    sport("Porsche"),
    daily("Jeep"),
    business("BMW");

    private final String brand;
    /**
     * Modified constructor to store brand information.
     */
    CarCollection(String carBrand) {
        brand = carBrand;
    }

    /**
     * This is an object method to return Car's brand
     * @return brand of the car.
     */
    public String getBrand() {
        return brand;
    }
}
