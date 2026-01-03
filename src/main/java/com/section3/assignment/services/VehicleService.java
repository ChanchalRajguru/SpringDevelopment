package com.section3.assignment.services;

import com.section3.assignment.dao.Speakers;
import com.section3.assignment.dao.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private Speakers speakers1;

    @Autowired
    private Tyres tyres1;

    public VehicleService(@Qualifier("BoseSpeakers") Speakers speakers, @Qualifier("BridgeStoneTyres") Tyres tyres) {
        System.out.println("in VehicleService constructor");
        this.speakers1 = speakers;
        this.tyres1 = tyres;
    }

    public void getAll() {
        System.out.println("Vehicle is = " + speakers1.makeSound());
        System.out.println("Vehicle is = " + tyres1.rotate());
    }

}
