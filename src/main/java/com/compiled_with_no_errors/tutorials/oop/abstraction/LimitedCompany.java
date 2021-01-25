package com.compiled_with_no_errors.tutorials.oop.abstraction;

public class LimitedCompany extends GenericCompany{

    private String[] partners;

    /**
     * Method to create limited company
     * @param owner Owner of the company
     * @param partners Partners of the company
     * @param numberOfRequiredEmployees Number of required employees to run the company
     */
    public LimitedCompany(String owner, String[] partners, int numberOfRequiredEmployees) {
        super(owner, numberOfRequiredEmployees);
        this.partners = partners;

        // Partners works for our company should be added.
        super.hire(partners.length);
    }
}
