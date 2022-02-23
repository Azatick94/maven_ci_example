package com.stacktoheap.maven_ci_example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Running CreditCard Tests !!!");
    }

    @DisplayName("test CreditCard")
    @Test
    public void testCreditCard() {
        CreditCard card = new CreditCard("111", "Elena", "Molchanova");

        assertEquals(card.getName(), "Elena");
        assertEquals(card.getSurname(), "Molchanova");
    }
}