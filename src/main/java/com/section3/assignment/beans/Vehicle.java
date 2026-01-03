package com.section3.assignment.beans;

import com.section3.assignment.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    @Autowired
    VehicleService service;

    public void getSpeakersAndTyres(){
        service.getAll();
    }

    private String name;

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
