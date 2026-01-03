package com.section3.assignment.dto.Tyres;

import com.section3.assignment.dao.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle is using Bridge Stone Tyres";
    }
}
