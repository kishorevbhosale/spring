package com.preprationzone.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {

    private String name = "Mithil";

    @Autowired
    private Vehicle vehicle;

    public Person() {
        System.out.println("Person bean is created by Spring");
    }
}
