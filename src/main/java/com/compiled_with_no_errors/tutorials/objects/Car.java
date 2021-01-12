package com.compiled_with_no_errors.tutorials.objects;

/**
 * This calls defines Car class.
 */
public class Car {
    private static final String NAME = "Car-";
    private final int index;

    /**
     * Constructor used for generating Car object.
     * @param index Index of current Car.
     */
    protected Car(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return NAME + index;
    }
}
