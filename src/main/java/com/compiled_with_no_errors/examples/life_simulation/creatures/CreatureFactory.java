package com.compiled_with_no_errors.examples.life_simulation.creatures;

import com.compiled_with_no_errors.examples.life_simulation.utils.MathSupport;

/**
 * This is a factory for generating creatures
 */
public class CreatureFactory {
    private final int width, height;

    /**
     * Initialize a factory with required parameters
     * @param width Width of the environment
     * @param height Height of the environment
     */
    public CreatureFactory(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Creature generateCreatures(){
        return createDog();
    }


    private Dog createDog(){
        CreatureSettings settings = new CreatureSettings(
                generateRandomSetting(Dog.DOG_SETTINGS.stepLength(), Dog.DOG_SETTINGS_VARIANCE),
                generateRandomSetting(Dog.DOG_SETTINGS.initialCalorie(), Dog.DOG_SETTINGS_VARIANCE),
                generateRandomSetting(Dog.DOG_SETTINGS.movementCalorie(), Dog.DOG_SETTINGS_VARIANCE),
                generateRandomSetting(Dog.DOG_SETTINGS.givingBirthCalorie(), Dog.DOG_SETTINGS_VARIANCE),
                generateRandomSetting(Dog.DOG_SETTINGS.copulateCalorie(), Dog.DOG_SETTINGS_VARIANCE));

        return new Dog(
                MathSupport.generateRandomNumber(width),
                MathSupport.generateRandomNumber(height),
                settings,
                Gender.generateRandomGender());
    }

    /**
     * Creates a setting with some variance
     * @param setting Setting in question
     * @param variance Variance in percentage
     * @return New setting
     */
    private int generateRandomSetting(int setting, float variance){
        int variation = Math.round(setting * variance);
        return MathSupport.generateRandomNumber(setting - variation, setting + variation);
    }
}
