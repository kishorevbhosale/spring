package com.preprationzone.config;

import com.preprationzone.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "audi")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value = "bmw")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean("ferrari")
    Vehicle  vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
