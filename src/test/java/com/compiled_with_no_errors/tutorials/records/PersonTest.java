package com.compiled_with_no_errors.tutorials.records;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person personOne, personTwo;
    private Date birthday;

    @BeforeEach
    void setUp() {
        birthday = new Date();
        personOne = new Person("Mastering Java", "For Beginners", birthday);
        personTwo = new Person("Compiled with", "No errors");
    }

    @Test
    void testFirstPerson() {
        assertEquals("Mastering Java", personOne.getFirstName());
        assertEquals("For Beginners", personOne.getLastName());
        assertEquals(birthday, personOne.getBirthday());
    }

    @Test
    void testSecondPerson() {
        assertEquals("Compiled with", personTwo.getFirstName());
        assertEquals("No errors", personTwo.getLastName());
        assertNull(personTwo.getBirthday());
    }

    @Test
    void testSamePerson(){
        Person samePerson = new Person(personOne.getFirstName(), personOne.getLastName(), personOne.getBirthday());
        assertNotEquals(samePerson, personOne);
    }
}
