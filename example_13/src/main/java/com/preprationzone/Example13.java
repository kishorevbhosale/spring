package com.preprationzone;

import com.preprationzone.config.ProjectConfig;
import com.preprationzone.model.Song;
import com.preprationzone.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example13 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleServices = context.getBean(VehicleService.class);
        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor swift");
        boolean vehicleStarted = true;

        vehicleServices.moveVehicle();
        vehicleServices.playMusic(vehicleStarted, song);


    }
}