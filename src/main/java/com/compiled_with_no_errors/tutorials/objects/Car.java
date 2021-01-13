package com.compiled_with_no_errors.tutorials.objects;

/**
 * This calls defines Car class.
 */
public class Car {
    // Following fields belong to Car class
    private static final String NAME = "Car-";
    private static int COUNTER;

    // Following field belong to car objects.
    private final int index;

    /**
     * Constructor used for generating Car object.
     */
    protected Car() {
        index = ++COUNTER;
    }

    @Override
    public String toString() {
        return NAME + index;
    }
}
