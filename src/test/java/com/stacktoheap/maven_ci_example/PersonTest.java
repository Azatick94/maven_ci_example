package com.stacktoheap.maven_ci_example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Running Person Tests !!!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finished all tests !!!");
    }

    @DisplayName("test Person toString method")
    @Test
    public void testPerson() {
        System.out.println("Test1 !!!");
        Person person = new Person("name", 20);
        assertEquals(person.getAge(), 20);
        assertEquals(person.getName(), "name");
    }

    @DisplayName("test Person age method")
    @Test
    public void testPersonAge() {
        System.out.println("Test2 !!!");
        Person person = new Person("name", 20);
        assertEquals(person.getAge(), 20);
    }
}