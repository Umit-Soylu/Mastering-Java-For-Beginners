package com.compiled_with_no_errors.tutorials.oop.polymorphism;

import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Hamburger;
import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Meal;
import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Pizza;

/**
 * This class defines cooks
 */
public class Cook {

    private final String name;

    /**
     * Creates a cook with a name
     * @param name Name of the cook
     */
    public Cook(String name) {
        this.name = name;
    }

    /**
     * This method allow cook to prepare meals.
     * @param mealType Type of the meal that will be prepared.
     * @return Prepared meal
     * @implSpec Expected inputs are 'Hamburger', 'Pizza'.
     */
    public Meal prepareMeal(String mealType){
        return generateMeal(mealType);
    }

    /**
     * This method allow us to prepare multiple units of same type
     * @param mealType Type of meal
     * @param numberOfUnits Number of units for the requested meal
     * @return requested number of units.
     */
    public Meal[] prepareMeal(String mealType, int numberOfUnits){
        Meal[] meals = new Meal[numberOfUnits];

        for (int i = 0; i < numberOfUnits; i++)
            meals[i] = generateMeal(mealType);
        return meals;
    }


    /**
     * My own method to create meals
     * @param input Input to generate meal
     * @return A meal
     */
    private Meal generateMeal(String input){
        if (input.equals("Pizza"))
            return new Pizza();
        else if (input.equals("Hamburger"))
            return new Hamburger();
        else{
            return null;
        }
    }
}
