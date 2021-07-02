package com.compiled_with_no_errors.examples.life_simulation.creatures;

import com.compiled_with_no_errors.examples.life_simulation.utils.MathSupport;

/**
 * Common capabilities of the creature
 */
abstract class AbstractCreature implements Creature{
    private final String ID;
    private final int width, height; // These are borders of the simulation
    private int[] location;
    private int calorie;

    /**
     * Generate a new creature
     * @param ID Identity (Name) of the creature
     * @param x Latitude in the world
     * @param y Longitude in the world
     */
    protected AbstractCreature(String ID, int x, int y, int width, int height) {
        this.ID = ID;
        location = new int[]{x, y};
        this.calorie = 500;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return ID;
    }

    /**
     * Moves semi randomly
     */
    @Override
    public void move() {
        location[0] = Math.floorMod(location[0] + MathSupport.generateRandomInteger(-5, 5), width);
        location[1] = Math.floorMod(location[1] + MathSupport.generateRandomInteger(-5, 5), height);
    }

    public int[] getCurrentLocation() {
        return location;
    }

    /**
     * Produces offspring if possible
     */
    @Override
    public void copulate() {
        // TODO Will handle in next phases
    }

    /**
     * Eats the food and gains calorie
     *
     * @param calorie The calorie of the food
     */
    @Override
    public void eat(int calorie) {
        if (calorie > 0)
            this.calorie += calorie;
    }

    public int getCurrentCalorie() {
        return calorie;
    }
}
