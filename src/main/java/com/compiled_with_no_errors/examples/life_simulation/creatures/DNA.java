package com.compiled_with_no_errors.examples.life_simulation.creatures;

import com.compiled_with_no_errors.examples.life_simulation.utils.ConstraintValidator;

/**
 * Stores the DNA of a creature for per turn.
 */
record DNA(int walkDistance,
           int movementCalorie,
           int copulateCalorie,
           int birthCalorie,
           float DNARandomization) {

    DNA(int walkDistance, int movementCalorie, int copulateCalorie, int birthCalorie, float DNARandomization) {
        this.walkDistance = ConstraintValidator.validatePositiveNumber(walkDistance) ? walkDistance : 0;
        this.movementCalorie = ConstraintValidator.validatePositiveNumber(movementCalorie) ? movementCalorie : 0;
        this.copulateCalorie = ConstraintValidator.validatePositiveNumber(copulateCalorie) ? copulateCalorie : 0;
        this.birthCalorie = ConstraintValidator.validatePositiveNumber(birthCalorie) ? birthCalorie : 0;
        this.DNARandomization = ConstraintValidator.validateFloatNumber(DNARandomization) ? DNARandomization : 0;
    }
}
