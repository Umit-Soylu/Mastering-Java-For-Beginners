package com.compiled_with_no_errors.tutorials.oop.abstraction;

import java.util.Date;

/**
 * This is abstract company class
 */
public abstract class GenericCompany implements Company{

    private final String owner;
    private final Date buildDate;
    private int numberOfEmployees, numberOfCurrentEmployees;

    /**
     * This creates a company with given name
     * @param owner Owner of the company
     */
    public GenericCompany(String owner, int numberOfRequiredEmployees) {
        this.owner = owner;
        buildDate = new Date();
        this.numberOfEmployees = numberOfRequiredEmployees;
        this.numberOfCurrentEmployees = 1;
    }

    /**
     * This method provides profit of the company for the last year.
     * @return profit is US Dollars
     */
    @Override
    public float yearlyProfit() {
        return 100;
    }

    /**
     * This method provides current occupancy rate for the company itself
     * @return the ratio of current occupants vs. the required occupants.
     * @implNote Will result 0.0 .. 1.0 or more if over crowded
     */
    @Override
    public float occupancyRate() {
        return (float) numberOfCurrentEmployees / numberOfEmployees;
    }

    /**
     * This method allow company to update its required number of employees to work efficiently
     * @param updatedNumberOfRequiredEmployees new number of employees required to run the company;
     */
    protected void updateNumberOfRequiredEmployees(int updatedNumberOfRequiredEmployees){
        this.numberOfEmployees = updatedNumberOfRequiredEmployees;
    }

    /**
     * This method allow us to hire people
     * @param numberOfHires number of new employees
     */
    protected void hire(int numberOfHires){
        numberOfCurrentEmployees += numberOfHires;
    }

    /**
     * This method allow us to let people leave the company
     * @param numberOfTerminatedEmployees number of employees leaving the company
     */
    protected void terminateEmployee(int numberOfTerminatedEmployees){
        numberOfCurrentEmployees -= numberOfTerminatedEmployees;
    }

    public String getOwner() {
        return owner;
    }

    public Date getBuildDate() {
        return buildDate;
    }
}
