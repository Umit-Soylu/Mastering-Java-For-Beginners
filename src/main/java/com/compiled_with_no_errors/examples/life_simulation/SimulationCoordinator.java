package com.compiled_with_no_errors.examples.life_simulation;

import com.compiled_with_no_errors.examples.life_simulation.simulation.Simulation;

import java.util.Scanner;

/**
 * This is the main class for executing simulation
 */
public class SimulationCoordinator {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("\n\n---This is the beginning of the simulation---\n\n");

        System.out.println("\nPlease provide the number of turns the simulation will run:");
        int turn = inputs.nextInt();

        System.out.println("\nPlease provide the number of creatures:");
        short numberOfCreatures = inputs.nextShort();

        System.out.println("\nPlease provide the ratio of vegetation:");
        float vegetationRatio = inputs.nextFloat();
        System.out.println("\n\n");

        Simulation simulation = new Simulation(turn, vegetationRatio, numberOfCreatures);
    }

}
