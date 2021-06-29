package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * This is a generic Company
 */
public abstract class AbstractCompany implements Company{
    private boolean isActive;
    private final int requiredEmployeesCount;
    private int currentEmployeesCount;
    private float incomes, expenses;

    /**
     * Initialize a generic company
     * @param requiredEmployeesCount Number of required employees to run this company.
     */
    public AbstractCompany(int requiredEmployeesCount) {
        this.requiredEmployeesCount = requiredEmployeesCount;
        currentEmployeesCount = 1; // Owner of the company
        incomes = 0F;
        expenses = 0F;
        isActive = true;
    }

    /**
     * Initialize a generic company with multiple owners
     * @param requiredEmployeesCount Number of required employees to run this company.
     */
    public AbstractCompany(int requiredEmployeesCount, int currentEmployeesCount) {
        this.requiredEmployeesCount = requiredEmployeesCount;
        this.currentEmployeesCount = currentEmployeesCount; // Owners of the company
        incomes = 0F;
        expenses = 0F;
        isActive = true;
    }

    /**
     * @return current year's profit
     */
    @Override
    public float yearlyProfit() {
        return incomes - expenses;
    }

    /**
     * Initialize the new period budget
     */
    protected void initializeNewBudget(){
        incomes = 0F;
        expenses = 0F;
    }

    /**
     *
     * @param income A new income to add current period
     */
    protected void addIncome(float income){
        if (isInputPositive(income))
            incomes += income;
    }
    /**
     *
     * @param expense A new income to add current period
     */
    protected void addExpense(float expense){
        if (isInputPositive(expense))
            expenses += expense;
    }

    /**
     * @return The ratio of people employed vs the number of people needed
     */
    @Override
    public float occupancyRatio() {
        return (float) currentEmployeesCount / requiredEmployeesCount;
    }

    /**
     * Hires a new employee
     * @param name Name of the new employee
     */
    protected void hireEmployee(String name){
        currentEmployeesCount++;
    }

    /**
     * Terminates the contract of the employee
     * @param name Name of the current employee
     */
    protected void terminateEmployee(String name){
        if(isEmployeeExist(name))
            currentEmployeesCount--; // Also removes the employee from the company
    }

    /**
     * Check whether or not given employee employed by the Company
     * @param name Name of the employee to check
     * @return true if employee exist, false otherwise
     */
    protected abstract boolean isEmployeeExist(String name);

    /**
     * @return true if the company is active, false otherwise
     */
    @Override
    public boolean isActive() {
        return isActive;
    }

    /**
     * This will change current company status to open
     */
    protected void openCompany(){
        isActive = true;
    }

    /**
     * This will change current company status to close
     */
    protected void closeCompany(){
        isActive = false;
    }

    private boolean isInputPositive(float input){
        return input >= 0;
    }
}
