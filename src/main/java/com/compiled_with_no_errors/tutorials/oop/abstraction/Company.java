package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * Defines the capabilities of a company
 */
public interface Company {
    String TYPE = "COMPANY";

    /**
     *
     * @return current year's profit
     */
    float yearlyProfit();

    /**
     *
     * @return The ratio of people employed vs the number of people needed
     */
    float occupancyRatio();

    /**
     *
     * @return true if the company is active, false otherwise
     */
    boolean isActive();
}
