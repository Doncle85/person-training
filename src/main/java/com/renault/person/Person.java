package com.renault.person;

import lombok.*;

@Data
public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

}
