package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * This class describes PitBull
 */
public class PitBull extends Dog{

    /**
     * Constructor for PitBull
     */
    public PitBull() {
        super("PitBull");
    }

    /**
     * PitBull can be aggressive.
     */
    public void attack(){
        System.out.println("Attacking!!!");
    }
}
