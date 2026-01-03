package com.section3.assignment.dto.Speakers;

import com.section3.assignment.dao.Speakers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BoseSpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Now playing from Bose Speakers";
    }
}
