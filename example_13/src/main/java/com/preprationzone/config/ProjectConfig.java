package com.preprationzone.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.preprationzone.ServiceImpl", "com.preprationzone.services"})
@ComponentScan(basePackageClasses = {com.preprationzone.beans.Vehicle.class})
public class ProjectConfig {


}
