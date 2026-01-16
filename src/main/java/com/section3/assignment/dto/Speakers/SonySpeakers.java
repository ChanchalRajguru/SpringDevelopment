package com.section3.assignment.dto.Speakers;

import com.section3.assignment.dao.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound(){
        return "Playing Music from Sony Speakers.";
    }
}
