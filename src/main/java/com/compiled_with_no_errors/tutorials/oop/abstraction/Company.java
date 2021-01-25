package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * This interface defines company behaviours
 */
public interface Company {
    // This is the type of private entity.
    String type = "Company";

    /**
     * This method provides profit of the company for the last year.
     * @return profit is US Dollars
     */
    float yearlyProfit();

    /**
     * This method provides current occupancy rate for the company itself
     * @return the ratio of current occupants vs. the required occupants.
     */
    float occupancyRate();

    /**
     * This method provides information about current active or bankruptcy status of company.
     * @return {@code true} if active, {@code false} otherwise
     */
    default boolean isCompanyActive(){
        return true;
    }

}
