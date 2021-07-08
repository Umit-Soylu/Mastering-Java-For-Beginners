package com.compiled_with_no_errors.examples.life_simulation;

import com.compiled_with_no_errors.examples.life_simulation.simulation.Simulation;

import java.util.Scanner;

/**
 * This is the main class for executing simulation
 */
public class SimulationCoordinator {

    public static void main(String[] args) {
        coordinateSimulation();
    }

    private static void coordinateSimulation(){
        try{
            initializeSimulation();
        } catch (IllegalArgumentException e){
            Scanner inputs = new Scanner(System.in);
            System.out.println("Simulation is not properly defined.");
            System.out.print("Do you want to provide inputs again (Type '(Y)es'), or exit (Type '(N)o'):");
            String answer = inputs.next();
            switch (answer) {
                case "Yes", "yes", "Y", "y" -> coordinateSimulation();
                case "No", "no", "N", "n" -> System.out.println("Exiting simulation without running");
                default -> throw new IllegalArgumentException("Improper input '" + answer + "', exiting");
            }
        }
    }

    private static void initializeSimulation(){
        Scanner inputs = new Scanner(System.in);

        System.out.println("\n\n---This is the beginning of the simulation---\n\n");

        System.out.print("\nPlease provide the number of turns the simulation will run: ");
        int turn = inputs.nextInt();

        System.out.print("\nPlease provide the number of creatures: ");
        short numberOfCreatures = inputs.nextShort();

        System.out.print("\nPlease provide the ratio of vegetation: ");
        float vegetationRatio = inputs.nextFloat();

        System.out.print("\nPlease provide the width of the simulation: ");
        int width = inputs.nextInt();

        System.out.print("\nPlease provide the height of the simulation: ");
        int height = inputs.nextInt();
        System.out.println("\n");

        Simulation lifeSimulation = new Simulation(turn, numberOfCreatures, vegetationRatio, width, height);
        lifeSimulation.simulate();
    }

}
