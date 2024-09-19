package com.preprationzone.beans;

import com.preprationzone.services.VehicleService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Vehicle {
    private final VehicleService vehicleService;
    private String name = "BMW";

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
}
