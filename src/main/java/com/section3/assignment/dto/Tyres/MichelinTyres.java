package com.section3.assignment.dto.Tyres;

import com.section3.assignment.dao.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {

    @Override
    public String rotate(){
        return "Vehicle is using Michelin Tyres";
    }
}
