package com.compiled_with_no_errors.examples.life_simulation.simulation;

public class Simulation {
    private final Settings settings;

    /**
     * Creates the foundation for the simulation
     * @param turns Number of turns the simulation will run
     * @param nbOfCreatures Number of creatures in the beginning
     * @param vegetationRatio The ration of vegetation in the world
     * @param width Width of the world
     * @param length Length of the world
     */
    public Simulation(int turns, int nbOfCreatures, float vegetationRatio, int width, int length) {
        settings = new Settings(turns, nbOfCreatures, vegetationRatio, width, length);

        System.out.println(settings);
    }
}
