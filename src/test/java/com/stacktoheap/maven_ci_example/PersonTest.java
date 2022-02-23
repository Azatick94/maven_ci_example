package com.stacktoheap.maven_ci_example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testPerson() {
        Person person = new Person("name", 20);
        assertEquals(person.getAge(), 20);
        assertEquals(person.getName(), "name");
    }

}