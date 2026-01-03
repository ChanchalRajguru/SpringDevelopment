package com.section3.assignment.dto.Speakers;

import com.section3.assignment.dao.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound(){
        return "Now playing from Sony Speakers";
    }
}
