package com.section4.bean_scope.implementation;

import com.section4.bean_scope.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {

    public String makeSound() {
        return "Playing music with Bose Speakers";
    }

}
