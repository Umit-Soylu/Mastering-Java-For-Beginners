package com.compiled_with_no_errors.examples.life_simulation.simulation;

/**
 * A generic simulation
 */
public class Simulation {
    private final Settings settings;

    /**
     * Initialize a simulation
     * @param turns Number of turns
     * @param vegetationRatio Ratio of the vegetation
     * @param creatureCount Number of creatures
     */
    public Simulation(int turns, float vegetationRatio, int creatureCount) {
        this.settings = new Settings(turns, vegetationRatio, creatureCount);
        System.out.println(settings);
    }
}
