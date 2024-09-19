package com.preprationzone;

import com.preprationzone.beans.Person;
import com.preprationzone.beans.Vehicle;
import com.preprationzone.config.ProjectConfig;
import com.preprationzone.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example12 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleServices1 = context.getBean(VehicleService.class);
        VehicleService vehicleServices2 = context.getBean("vehicleService",VehicleService.class);
        System.out.println("Hashcode of the object vehicleServices1 : " +vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " +vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }

    }
}