package com.preprationzone.config;

import com.preprationzone.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.preprationzone.beans")
public class ProjectConfig {

    @Primary
    @Bean
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("AUDI");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("FERRARI");
        return vehicle;
    }
}
