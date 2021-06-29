package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * A small sized company owned by an individual
 */
public class SoleProprietorship extends AbstractCompany{
    private final String owner;

    /**
     * Initialize a generic company
     *
     * @param numberOfRequiredEmployees Number of required employees to run this company.
     */
    public SoleProprietorship(int numberOfRequiredEmployees, String owner) {
        super(numberOfRequiredEmployees);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
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
