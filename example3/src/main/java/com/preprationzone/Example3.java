package com.preprationzone;

import com.preprationzone.beans.Vehicle;
import com.preprationzone.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // This throws the exception
        //Vehicle veh = context.getBean(Vehicle.class);

        Vehicle veh = context.getBean("audi", Vehicle.class);
        System.out.println("Vehicle name from the spring context is : "+veh.getName());

        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the spring context is : "+veh1.getName());

        Vehicle veh2 = context.getBean("ferrari", Vehicle.class);
        System.out.println("Vehicle name from the spring context is : "+veh2.getName());
    }
}