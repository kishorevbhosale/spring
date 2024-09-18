package com.preprationzone.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle bean is created by spring");
    }

    public void printHello() {
        System.out.println("Printing hello from component vehicle beans");
    }
}
