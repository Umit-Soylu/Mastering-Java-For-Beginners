package com.compiled_with_no_errors.tutorials.records;

import java.util.Date;

/**
 * A record for Person
 */
public record PersonRecord(String firstName, String lastName, Date birthday) {

    /**
     * Creates a person with required fields
     * @param firstName First name of the person
     * @param lastName Last name of the person
     */
    public PersonRecord(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
}
