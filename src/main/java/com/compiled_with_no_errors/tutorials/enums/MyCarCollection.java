package com.compiled_with_no_errors.tutorials.enums;

/**
 * This class stores the information of Cars owned.
 */
public final class MyCarCollection {
    private final String brand;
    /**
     * A private constructor to prevent object creation.
     * @param brand Brand of the car
     */
    private MyCarCollection(String brand) {
        this.brand = brand;
    }

    /**
     * This method belongs to per object.
     * @return The brand of the car
     */
    public String getBrand() {
        return brand;
    }

    // Here the list of Cars owned.
    public static final MyCarCollection sport = new MyCarCollection("Porsche");
    public static final MyCarCollection daily = new MyCarCollection("Jeep");
    public static final MyCarCollection business = new MyCarCollection("BMW");

    private static final MyCarCollection[] cars = new MyCarCollection[]{sport, daily, business};

    /**
     * This method returns list of Cars
     * @return List of cars owned
     */
    public static MyCarCollection[] getCars() {
        return cars;
    }
}
