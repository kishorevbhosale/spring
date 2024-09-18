package com.preprationzone.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;
    private Vehicle vehicle;

    public Person() {
        System.out.println("Person bean is created by Spring");
    }
}
