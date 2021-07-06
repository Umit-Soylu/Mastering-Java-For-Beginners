package com.compiled_with_no_errors.examples.life_simulation.creatures;

import com.compiled_with_no_errors.examples.life_simulation.utils.MathSupport;

/**
 * A factory to generate creatures
 */
public class CreatureFactory {
    private final int simHeight, simWidth;

    /**
     *
     * @param simHeight Height of the simulation
     * @param simWidth Width of the simulation
     */
    public CreatureFactory(int simHeight, int simWidth) {
        this.simHeight = simHeight;
        this.simWidth = simWidth;
    }

    /**
     *
     * @param nbOfCreatures Number of creatures to create
     * @return List of creatures generated
     */
    public Creature[] generateCreatures(int nbOfCreatures){
        if (nbOfCreatures > 0) {
            Creature[] creatures = new Creature[nbOfCreatures];
            for (int i = 0; i < nbOfCreatures; i++) {
                creatures[i] = generateDog();
            }

            return creatures;
        } else
            return null;
    }

    private Dog generateDog(){
        return new Dog(MathSupport.generateRandomInteger(0, simWidth),
                MathSupport.generateRandomInteger(0, simHeight),
                simWidth,
                simHeight,
                Dog.DEFAULT_DNA); // TODO, will introduce randomization in here
    }
}
