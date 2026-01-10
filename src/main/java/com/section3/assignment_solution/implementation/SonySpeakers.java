package com.section3.assignment_solution.implementation;

import com.section3.assignment_solution.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound() {
        return "Playing music with Sony Speakers";
    }
}
