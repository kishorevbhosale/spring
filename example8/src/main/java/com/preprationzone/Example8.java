package com.preprationzone;

import com.preprationzone.beans.Person;
import com.preprationzone.beans.Vehicle;
import com.preprationzone.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example8 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from spring context is : " + person.getName());
        System.out.println("Vehicle name from spring context is : " + vehicle.getName());
        System.out.println("Vehicle that person own is : " + person.getVehicle());

    }
}