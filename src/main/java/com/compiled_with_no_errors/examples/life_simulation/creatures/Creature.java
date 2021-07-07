package com.compiled_with_no_errors.examples.life_simulation.creatures;

/**
 * Defines the core capabilities of creatures
 */
public interface Creature {
    /**
     * <p>Moves semi randomly.</p> <p>The world is connected from left to right and up to down (Same as Pac-man)</p>
     */
    void move();

    /**
     * Produces offspring if possible
     */
    void copulate();

    /**
     * Eats the food and gains calorie
     * @param calorie The calorie of the food
     */
    void eat(int calorie);
}
