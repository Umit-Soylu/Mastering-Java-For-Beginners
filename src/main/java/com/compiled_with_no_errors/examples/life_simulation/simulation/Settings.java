package com.compiled_with_no_errors.examples.life_simulation.simulation;

import com.compiled_with_no_errors.examples.life_simulation.utils.ConstraintValidator;

record Settings(int nbOfTurns, int nbOfCreatures, float vegetationRatio, int width, int height) {

    Settings(int nbOfTurns, int nbOfCreatures, float vegetationRatio, int width, int height) {
        this.nbOfTurns = ConstraintValidator.validatePositiveNumber(nbOfTurns) ? nbOfTurns : 0;
        this.nbOfCreatures = ConstraintValidator.validatePositiveNumber(nbOfCreatures) ? nbOfCreatures : 0;
        this.vegetationRatio = ConstraintValidator.validateFloatNumber(vegetationRatio) ? vegetationRatio: 0F;
        this.width = ConstraintValidator.validatePositiveNumber(width) ? width : 0;
        this.height = ConstraintValidator.validatePositiveNumber(height) ? height : 0;
    }
}
