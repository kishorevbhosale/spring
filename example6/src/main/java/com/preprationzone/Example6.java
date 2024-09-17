package com.preprationzone;

import com.preprationzone.beans.Vehicle;
import com.preprationzone.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;


public class Example6 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Supplier<Vehicle> bmwSupplier = () -> {
            Vehicle bmw = new Vehicle();
            bmw.setName("BMW");
            return bmw;
        };

        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println("Random number : "+n);

        if (n%2==0){
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }else{
            context.registerBean("bmw", Vehicle.class, bmwSupplier);
        }

        Vehicle audi = null;
        Vehicle bmw = null;

        try{
            audi = context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException  noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi vehicle");
        }

        try{
            bmw = context.getBean("bmw", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating BMW vehicle");
        }

        if(null != bmw){
            System.out.println("Programming Vehicle name from Spring Context is: " + bmw.getName());
        }else{
            System.out.println("Programming Vehicle name from Spring Context is: " + audi.getName());
        }
    }
}