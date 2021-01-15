package com.compiled_with_no_errors.tutorials.oop.polymorphism.meal;

public class Pizza extends Meal{
    /**
     * A pizza will be ready in 12 minutes.
     */
    public Pizza() {
        super("Pizza", 12);
    }

    /**
     * This method allow user to retrieve meal preparation time
     * @return The preparation time in milliseconds
     */
    @Override
    public int getPreparationTime() {
        return super.getPreparationTime() * 60 * 1000;
    }
}
