package com.compiled_with_no_errors.examples.life_simulation.simulation;

/**
 * A generic simulation
 */
public class Simulation {
    private final Settings settings;
    private final int[][] environment;

    /**
     * Initialize a simulation
     * @param turns Number of turns
     * @param vegetationRatio Ratio of the vegetation
     * @param creatureCount Number of creatures
     */
    public Simulation(int turns, float vegetationRatio, int creatureCount, int width, int height) {
        this.settings = new Settings(turns, vegetationRatio, creatureCount, width, height);
        environment = new int[width][height];
        System.out.println(settings);
    }
}
