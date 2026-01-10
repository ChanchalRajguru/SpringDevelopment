package com.section3.assignment_solution.implementation;

import com.section3.assignment_solution.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music Bose Speakers";
    }
}
