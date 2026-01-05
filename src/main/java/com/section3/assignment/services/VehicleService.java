package com.section3.assignment.services;

import com.section3.assignment.dao.Speakers;
import com.section3.assignment.dao.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void move(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
