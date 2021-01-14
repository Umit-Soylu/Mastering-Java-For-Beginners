package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * This class provides 2D location information
 */
public class Location {
    // Stored 2D location information.
    private int x, y;

    /**
     * Updates position in 2D
     * @param xMovement movement in x dimension
     * @param yMovement movement in y dimension
     */
    protected void updateLocation(int xMovement, int yMovement){
        x += xMovement;
        y += yMovement;
    }

    /**
     * Provides information about position
     * @return an array consist of x and y location
     */
    public int[] getLocation(){
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return "Location:" + x + ", "+  y;
    }
}
