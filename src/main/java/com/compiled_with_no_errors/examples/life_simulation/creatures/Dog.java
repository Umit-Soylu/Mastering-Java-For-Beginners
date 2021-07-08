package com.compiled_with_no_errors.examples.life_simulation.creatures;

class Dog extends AbstractCreature {
    private static int COUNTER; // Counts the number of Dogs
    static final DNA DEFAULT_DNA = new DNA(5, 1000, 800, 2500, 0.2F);

    /**
     * Generate a new Dog
     * @param x Current latitude
     * @param y Current longitude
     */
    protected Dog(int x, int y, int width, int height, DNA dna) {
        super(String.format("Dog-%d", COUNTER++), x, y, width, height, dna);
    }

}
