package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * Class that store and manipulates location of objects.
 */
public class Location {
    private int x, y;

    /**
     * Default location set to {0, 0}
     */
    public Location() {
        x = 0;
        y = 0;
    }

    /**
     * Update location
     * @param xMovement movement in x dimension
     * @param yMovement movement in y dimension
     */
    protected void updateLocation(int xMovement, int yMovement){
        x += xMovement;
        y += yMovement;
    }

    /**
     * Provides position.
     * @return The position of object as an array.
     */
    public int[] getLocation(){
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
