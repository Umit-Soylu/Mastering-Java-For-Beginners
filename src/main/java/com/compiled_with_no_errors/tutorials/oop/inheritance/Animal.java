package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * The common ancestor in evolution tree.
 */
public class Animal {
    private final String kind;

    // Stored the information of the animal.
    private int[] location;
    /**
     * The constructor for animals
     * @param kind kind of the animal.
     */
    public Animal(String kind) {
        this.kind = kind;
        location = new int[]{0, 0};
    }

    /**
     * This allow given animal to move to a new location
     */
    public void move(){
        location[0] += Math.random()*5;
        location[1] += Math.random()*5;
    }

    public int[] getLocation() {
        return location;
    }

    public String getKind() {
        return kind;
    }
}
