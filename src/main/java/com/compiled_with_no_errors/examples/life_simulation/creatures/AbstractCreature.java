package com.compiled_with_no_errors.examples.life_simulation.creatures;

import com.compiled_with_no_errors.examples.life_simulation.utils.MathSupport;

/**
 * A generic creature with all core capabilities
 */
abstract class AbstractCreature implements Creature {
    private final String name;
    private final int[] position;
    private final CreatureSettings settings;
    private int calories; // Used for keep track of current hunger level


    /**
     * Creates a generic creature
     * @param name Name of the creature
     * @param latitude Current latitude of the creature
     * @param longitude Current longitude of the creature
     * @param settings Settings of the new creature (DNA)
     */
    public AbstractCreature(String name, int latitude, int longitude, CreatureSettings settings) {
        this.name = name;
        position = new int[]{latitude, longitude};
        this.settings = settings;
        calories = settings.initialCalorie();
    }

    /**
     * Move to a new position
     */
    @Override
    public void move() {
        position[0] += MathSupport.generateRandomNumber(settings.stepLength());
        position[1] += MathSupport.generateRandomNumber(settings.stepLength());
        calories -= settings.movementCalorie();
    }

    public int[] getCurrentPosition() {
        return position;
    }

    /**
     * Eat food in the current position
     */
    @Override
    public void eat(int foodCalorie) {
        calories += foodCalorie;
    }

    /**
     * Copulate with another creature and produce offsprings
     */
    @Override
    public void copulate() {
        calories -= settings.copulateCalorie();

    }

    /**
     * Gave birth to a new creature
     */
    protected abstract AbstractCreature birth();

    public String getName() {
        return name;
    }

    CreatureSettings getSettings() {
        return settings;
    }
}
