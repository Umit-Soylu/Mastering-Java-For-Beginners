package com.compiled_with_no_errors.tutorials.oop.polymorphism.meal;

/**
 * This class defines common meal attributes
 */
public class Meal {
    private final String name;
    private final int preparationTime;

    /**
     * A generic constructor for defining meals
     * @param name Name of the meal
     * @param preparationTime Preparation time required for aforementioned meal
     */
    protected Meal(String name, int preparationTime) {
        this.name = name;
        this.preparationTime = preparationTime;
    }

    public String getName() {
        return name;
    }

    public int getPreparationTime() {
        return preparationTime;
    }
}
