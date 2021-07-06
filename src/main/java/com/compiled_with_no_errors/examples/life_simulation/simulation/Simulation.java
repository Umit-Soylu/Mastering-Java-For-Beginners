package com.compiled_with_no_errors.examples.life_simulation.simulation;

import com.compiled_with_no_errors.examples.life_simulation.creatures.Creature;
import com.compiled_with_no_errors.examples.life_simulation.creatures.CreatureFactory;

public class Simulation {
    private final Settings settings;
    private final CreatureFactory factory;
    private Creature[] creatures;
    /**
     * Creates the foundation for the simulation
     * @param nbOfTurns Number of turns the simulation will run
     * @param nbOfCreatures Number of creatures in the beginning
     * @param vegetationRatio The ration of vegetation in the world
     * @param width Width of the world
     * @param length Length of the world
     */
    public Simulation(int nbOfTurns, int nbOfCreatures, float vegetationRatio, int width, int length) {
        settings = new Settings(nbOfTurns, nbOfCreatures, vegetationRatio, width, length);

        System.out.println(settings);

        factory = new CreatureFactory(settings.height(), settings.width());
    }

    /**
     * Execute the simulation based on settings
     */
    public void simulate(){
        creatures = factory.generateCreatures(settings.nbOfCreatures());

        // Loop for nb of turns
        for (int i = 0; i < settings.nbOfTurns(); i++) {

            // Move in each turn
            for (int j = 0; j < creatures.length; j++) {
                creatures[j].move(); // TODO: Currently creatures only moves
            }
        }
    }


}
