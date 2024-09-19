package com.preprationzone;

import com.preprationzone.beans.Person;
import com.preprationzone.beans.Vehicle;
import com.preprationzone.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example11 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        person.setName("Mithil Bhosale");
        System.out.println("Person name is : " + person.getName());
        person.getVehicle().getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();

    }
}