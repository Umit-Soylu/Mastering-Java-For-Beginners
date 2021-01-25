package com.compiled_with_no_errors.tutorials.oop.abstraction;

/**
 * A private Company
 */
public class PrivateCompany extends GenericCompany{
    /**
     * Create a private company
     * @param owner Owner of the company
     * @param numberOfRequiredEmployees Number of employees required to run the company.
     */
    public PrivateCompany(String owner, int numberOfRequiredEmployees) {
        super(owner, numberOfRequiredEmployees);
    }

    /**
     * This method provides information about current active or bankruptcy status of company.
     * @return {@code true} if active, {@code false} otherwise
     */
    @Override
    public boolean isCompanyActive() {
        return true;
    }
}
