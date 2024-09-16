package com.preprationzone.config;

import com.preprationzone.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    String hello(){
        return "hello for spring bean";
    }

    @Bean
    Integer number(){
        return 11131;
    }
}
