package com.stacktoheap.maven_ci_example;

public class CreditCard {
    private String sectetNumber;
    private String name;
    private String surname;

    public CreditCard(String sectetNumber, String name, String surname) {
        this.sectetNumber = sectetNumber;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
