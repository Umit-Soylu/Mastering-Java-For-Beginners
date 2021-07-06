package com.compiled_with_no_errors.examples.life_simulation.creatures;

/**
 * Stores the DNA of a creature for per turn.
 */
record DNA(int walkDistance,
           int movementCalorie,
           int copulateCalorie,
           int birthCalorie,
           float DNARandomization) {
}
