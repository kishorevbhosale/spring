package com.preprationzone.config;

import com.preprationzone.beans.Person;
import com.preprationzone.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Mithil");
        person.setVehicle(vehicle);
        return person;
    }

}
