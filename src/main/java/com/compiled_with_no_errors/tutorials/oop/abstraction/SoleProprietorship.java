package com.compiled_with_no_errors.tutorials.oop.abstraction;

import java.util.Objects;

/**
 * A small sized company
 */
public class SoleProprietorship extends AbstractCompany{

    /**
     *
     * @param owner Owner of the company
     * @param name Name of the company. Default to owner
     * @param numberOfEmployeesRequired Number of employees required to run, should be less than 50
     */
    public SoleProprietorship(String owner, String name, int numberOfEmployeesRequired) {
        super(owner, Objects.requireNonNullElse(name, owner), Math.min(numberOfEmployeesRequired, 50));
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
