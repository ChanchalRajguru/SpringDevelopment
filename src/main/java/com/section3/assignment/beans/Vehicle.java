package com.section3.assignment.beans;

import com.section3.assignment.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {

    private String name = "Honda";
    private final VehicleService service;

    @Autowired
    public Vehicle(VehicleService service) {
        this.service = service;
    }

    public void getSpeakersAndTyres() {
        service.getAll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name = " + name;
    }
}
