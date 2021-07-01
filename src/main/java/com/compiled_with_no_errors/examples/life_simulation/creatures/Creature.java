package com.compiled_with_no_errors.examples.life_simulation.creatures;

public interface Creature {

    /**
     * Move to a new position
     */
    void move();

    /**
     * Eat food in the current position
     * @param foodCalorie Calorie of the food
     */
    void eat(int foodCalorie);

    /**
     * Copulate with another creature and produce offsprings
     */
    void copulate();
}
