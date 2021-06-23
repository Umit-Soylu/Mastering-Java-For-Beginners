package com.compiled_with_no_errors.tutorials.records;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PersonRecordTest {
    private PersonRecord personOne, personTwo;
    private Date birthday;

    @BeforeEach
    void setUp() {
        birthday = new Date();
        personOne = new PersonRecord("Mastering Java", "For Beginners", birthday);
        personTwo = new PersonRecord("Compiled with", "No errors");
    }

    @Test
    void testFirstPerson() {
        assertEquals("Mastering Java", personOne.firstName());
        assertEquals("For Beginners", personOne.lastName());
        assertEquals(birthday, personOne.birthday());
    }

    @Test
    void testSecondPerson() {
        assertEquals("Compiled with", personTwo.firstName());
        assertEquals("No errors", personTwo.lastName());
        assertNull(personTwo.birthday());
    }

    @Test
    void testSamePerson(){
        PersonRecord samePerson = new PersonRecord(personOne.firstName(), personOne.lastName(), personOne.birthday());
        assertEquals(samePerson, personOne); //Records solve this by implementing hashCode & equals methods automatically
    }
}
