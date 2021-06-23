package com.compiled_with_no_errors.tutorials.records;

import java.util.Date;

public class Person {
    private final String firstName, lastName;
    private final Date birthday;

    /**
     * Creates a person with all fields
     * @param firstName First name of the person
     * @param lastName Last name of the person
     * @param birthday Birthday of the person
     */
    public Person(String firstName, String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    /**
     * Creates a person with required fields
     * @param firstName First name of the person
     * @param lastName Last name of the person
     * @implNote Birthday set as null
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }
}
