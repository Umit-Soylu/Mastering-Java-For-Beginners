package com.compiled_with_no_errors.tutorials.oop.abstraction;

import java.util.Objects;

/**
 * A generic company class
 */
public abstract class AbstractCompany implements Company{
    private final String owner, name;
    private final int numberOfEmployeesRequired;

    private int numberOfCurrentEmployees;
    private boolean isActive;
    private float expenses, incomes;

    /**
     * Create a company
     * @param owner Owner of the company
     * @param name Name of the company
     * @param numberOfEmployeesRequired The number required to run this company
     */
    public AbstractCompany(String owner, String name, int numberOfEmployeesRequired) {
        Objects.requireNonNull(owner);
        this.owner = owner;

        Objects.requireNonNull(name);
        this.name = name;

        this.numberOfEmployeesRequired = numberOfEmployeesRequired > 0 ? numberOfEmployeesRequired : 1;

        numberOfCurrentEmployees = 1;
        expenses = 0f;
        incomes = 0f;
        isActive = true;
    }

    /**
     * Add an expense for this year
     * @param expense New expense
     */
    protected void addExpense(float expense){
        if(expense > 0)
            this.expenses += expense;
    }

    /**
     * Add an income for this year
     * @param income new income
     */
    protected void addIncome(float income){
        if (income > 0)
            this.incomes += income;
    }

    /**
     * @return This years profit
     */
    @Override
    public float yearlyProfit() {
        return incomes - expenses;
    }

    /**
     * Hires a new employee
     * @param name Name of the employee
     */
    protected void hireEmployee(String name){
        Objects.requireNonNull(name);
        numberOfCurrentEmployees++;
    }

    /**
     * Finalize the relation with the employee
     * @param name Name of the employee in question
     */
    protected void terminateEmployee(String name){
        if (checkEmployeeExist(name))
            numberOfCurrentEmployees--;
    }

    /**
     * Checks given employee exist or not
     * @param name Name of the employee
     * @return true if employee exist, false otherwise
     */
    protected abstract boolean checkEmployeeExist(String name);

    /**
     * @return Ratio of the occupancy
     */
    @Override
    public float occupancyRate() {
        return (float) numberOfCurrentEmployees / numberOfEmployeesRequired;
    }

    /**
     * @return true if company is active, false otherwise
     */
    @Override
    public boolean isCompanyActive() {
        return isActive;
    }

    /**
     * Deactivates the company
     */
    protected void inactivateCompany(){
        isActive = false;
    }

    /**
     * Activate the company
     */
    protected void activateCompany(){
        isActive = true;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }
}
