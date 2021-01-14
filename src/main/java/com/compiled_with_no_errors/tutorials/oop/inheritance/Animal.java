package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * This class defines capabilities of Animals
 */
public class Animal {
    // This field preserves the location of the animal
    private final Location location;

    // This field stores the kind of the animal, ex: ship, dog, bird, etc.
    private final String kind;

    // This field exist only for tutorial purposes
    protected final int commonField = 0;

    /**
     * Constructor to create an animal
     *
     * @param kind kind of the animal
     */
    public Animal(String kind) {
        this.kind = kind;
        location = new Location();
    }

    /**
     * Animal moves randomly
     */
    public void move() {
        location.updateLocation((int) (Math.random() * 10), (int) (Math.random() * 10));
    }

    /**
     * Information about animal kind
     *
     * @return the kind of the animal
     */
    public String getKind() {
        return kind;
    }

    public Location getLocation() {
        return location;
    }
}
