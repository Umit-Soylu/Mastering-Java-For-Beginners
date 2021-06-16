package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * A limited company class
 */
public class LimitedCompany extends AbstractCompany{
    /**
     * Create a company
     *
     * @param owner                     Owner of the company
     * @param name                      Name of the company
     * @param numberOfEmployeesRequired The number required to run this company
     * @implNote number of Employees Required should be at least 50
     */
    public LimitedCompany(String owner, String name, int numberOfEmployeesRequired) {
        super(owner, name, Math.max(numberOfEmployeesRequired, 50));

    }

    /**
     * Checks given employee exist or not
     *
     * @param name Name of the employee
     * @return true if employee exist, false otherwise
     */
    @Override
    protected boolean checkEmployeeExist(String name) {
        return true;
    }
}
