package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * This class defines capabilities of Animals
 */
public class Animal {
    // This field preserves the location of the animal
    private int[] location;

    // This field stores the kind of the animal, ex: ship, dog, bird, etc.
    private final String kind;

    // This field exist only for tutorial purposes
    protected final int commonField = 0;

    /**
     * Constructor to create an animal
     * @param kind kind of the animal
     */
    public Animal(String kind) {
        this.kind = kind;
        location = new int[]{0, 0}; // This allows animal to start in lower left position (default).
    }

    /**
     * Animal moves randomly
     */
    public void move(){
        location[0] += Math.random() * 10;
        location[1] += Math.random() * 10;
    }

    /**
     * Information about animal kind
     * @return the kind of the animal
     */
    public String getKind() {
        return kind;
    }

    /**
     * Information about animal location
     * @return location of the animal
     */
    public int[] getLocation() {
        return location;
    }
}
