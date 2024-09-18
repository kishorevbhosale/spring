package com.preprationzone.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Vehicle {
    private String name = "BMW";

    public Vehicle() {
        System.out.println("Vehicle bean is created by spring");
    }

}
