package com.compiled_with_no_errors.examples.life_simulation.creatures;

class Dog extends AbstractCreature {
    private static int COUNTER; // Counts the number of Dogs

    /**
     * Generate a new Dog
     * @param x Current latitude
     * @param y Current longitude
     */
    protected Dog(int x, int y, int width, int height) {
        super("Dog-" + COUNTER++, x, y, width, height);
    }

}
