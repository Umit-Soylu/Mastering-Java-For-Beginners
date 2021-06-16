package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * Describes the capabilities of a company
 */
public interface Company {
    String TYPE = "Company";

    /**
     *
     * @return This years profit
     */
    float yearlyProfit();

    /**
     *
     * @return Ratio of the occupancy
     */
    float occupancyRate();

    /**
     *
     * @return {@link true} if copmany is active, {@code false} otherwise
     */
    boolean isCompanyActive();
}
