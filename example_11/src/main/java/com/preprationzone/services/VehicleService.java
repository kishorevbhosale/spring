package com.preprationzone.services;

import com.preprationzone.interfaces.Speakers;
import com.preprationzone.interfaces.Tyres;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VehicleService {

    private final Speakers speakers;
    private final Tyres tyres;

    @Autowired
    public VehicleService(Speakers speakers, Tyres tyres) {
        this.speakers = speakers;
        this.tyres = tyres;
    }

    public void playMusic() {
        System.out.println(speakers.makeSound());
    }

    public void moveVehicle() {
        System.out.println(tyres.rotate());
    }
}
