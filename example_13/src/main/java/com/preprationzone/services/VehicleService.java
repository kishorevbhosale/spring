package com.preprationzone.services;

import com.preprationzone.interfaces.Speakers;
import com.preprationzone.interfaces.Tyres;
import com.preprationzone.model.Song;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;


@Slf4j
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleService {

    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    private final Speakers speakers;
    private final Tyres tyres;

    @Autowired
    public VehicleService(Speakers speakers, Tyres tyres) {
        this.speakers = speakers;
        this.tyres = tyres;
    }

    public void playMusic(boolean vehicleStarted, Song song) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String music = null;
        if(vehicleStarted){
            music = speakers.makeSound();
        }else {
            logger.info("Vehicle not started...");
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        System.out.println(speakers.makeSound());
    }

    public void moveVehicle() {
        System.out.println(tyres.rotate());
    }
}
