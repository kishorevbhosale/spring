package com.preprationzone.beans;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Data
@Component
public class Person {
    private final Vehicle vehicle;
    private String name = "Mithil";

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
