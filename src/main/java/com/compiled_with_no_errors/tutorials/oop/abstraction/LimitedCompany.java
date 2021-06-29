package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * Large scale company owned by multiple owners
 */
public class LimitedCompany extends AbstractCompany{
    private final String[] owners;


    public LimitedCompany(int numberOfRequiredEmployees, String[] owners) {
        super(numberOfRequiredEmployees, owners.length);
        this.owners = owners;
    }

    public String[] getOwners() {
        return owners;
    }

    /**
     * Check whether or not given employee employed by the Company
     *
     * @param name Name of the employee to check
     * @return true if employee exist, false otherwise
     */
    @Override
    protected boolean isEmployeeExist(String name) {
        return true; // Placeholder implementation
    }
}
