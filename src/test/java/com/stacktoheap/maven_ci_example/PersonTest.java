package com.stacktoheap.maven_ci_example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @DisplayName("test Person toString method")
    @Test
    public void testPerson() {
        Person person = new Person("name", 20);
        assertEquals(person.getAge(), 20);
        assertEquals(person.getName(), "name");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finished all tests !!!");
    }
}