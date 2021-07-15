package com.compiled_with_no_errors.examples.life_simulation.creatures;

import com.compiled_with_no_errors.examples.life_simulation.utils.MathSupport;

/**
 * Common capabilities of the creature
 */
abstract class AbstractCreature implements Creature{
    private final String ID;
    private final int width, height, lowerWalkDistance, higherWalkDistance; // These are borders of the simulation
    private final DNA dna;
    private int[] location;
    private int calorie;

    /**
     * Generate a new creature
     * @param ID Identity (Name) of the creature
     * @param x Latitude in the world
     * @param y Longitude in the world
     */
    protected AbstractCreature(String ID, int x, int y, int width, int height, DNA dna) {
        this.ID = ID;
        location = new int[]{x, y};
        this.width = width;
        this.height = height;
        this.dna = dna;
        this.calorie = dna.birthCalorie(); //TODO: Calorie may go negative, no check for that!!!

        lowerWalkDistance = -1 * Math.floorDiv(dna.walkDistance(), 2);
        higherWalkDistance = (int) Math.ceil((float) dna.walkDistance() / 2);
    }

    public String getName() {
        return ID;
    }

    /**
     * Moves semi randomly
     */
    @Override
    public void move() {
        calorie -= dna.movementCalorie();

        location[0] = Math.floorMod(location[0] + MathSupport.generateRandomInteger(lowerWalkDistance, higherWalkDistance), width);
        location[1] = Math.floorMod(location[1] + MathSupport.generateRandomInteger(lowerWalkDistance, higherWalkDistance), height);
    }

    public int[] getCurrentLocation() {
        return location;
    }

    /**
     * Produces offspring if possible
     */
    @Override
    public void copulate() {
        calorie -= dna.copulateCalorie();
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
