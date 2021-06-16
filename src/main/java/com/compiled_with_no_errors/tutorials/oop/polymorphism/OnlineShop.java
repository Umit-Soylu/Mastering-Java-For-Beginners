package com.compiled_with_no_errors.tutorials.oop.polymorphism;

import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Hamburger;
import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Meal;
import com.compiled_with_no_errors.tutorials.oop.polymorphism.meal.Pizza;

/**
 * This class allows use of Online Shopping capabilities
 */
public class OnlineShop {

    private final Cook currentCook;

    /**
     * Constructor for crating a shop
     * @param currentCook The cook that will work in the shop
     */
    public OnlineShop(Cook currentCook) {
        this.currentCook = currentCook;
    }

    /**
     * This method allow us to order {@link Hamburger} online
     * @param count Number of {@link Hamburger} to be ordered
     * @return List of {@link Hamburger}
     */
    public Hamburger[] orderHamburger(int count){
        // Check for valid input
        if (count < 1)
            return null;

        Hamburger[] hamburgers = new Hamburger[count];
        Meal[] meals = currentCook.prepareMeal("Hamburger", count);

        // Check for quality
        if (!checkQuality(meals))
            return null;

        // Prepare Hamburgers
        for (int i = 0; i < count && meals[i] instanceof Hamburger; i++) {
            hamburgers[i] = (Hamburger) meals[i];
        }

        return hamburgers;
    }

    /**
     * This method allow us to order {@link Pizza} online
     * @param count Number of {@link Pizza} to be ordered
     * @return List of {@link Pizza}
     */
    public Pizza[] orderPizza(int count){
        if (count < 1)
            return null;

        Pizza[] pizzas = new Pizza[count];
        Meal[] meals = currentCook.prepareMeal("Pizza", count);

        // Check for quality
        if (!checkQuality(meals))
            return null;

        // Prepare Pizzas
        for (int i = 0; i < count && meals[i] instanceof Pizza; i++) {
            pizzas[i] = (Pizza) meals[i];
        }

        return pizzas;
    }

    /**
     * This method given arrays elements satisfy Quality standards.
     * @param meals {@link Meal} to be checked
     * @return {@code true} if meals satisfy quality standards, {@code false} otherwise
     */
    private boolean checkQuality(Meal[] meals){
        boolean isAcceptable = true;
        int timeCriterion = 35;

        // Cast criterion to milliseconds for Pizza
        if (meals[0] instanceof Pizza)
            timeCriterion *= 60_000;

        for (Meal meal : meals) {
            // Example check scenario
            if (meal.getPreparationTime() > timeCriterion) {
                isAcceptable = false;
                break;
            }
        }

        return isAcceptable;
    }
}
