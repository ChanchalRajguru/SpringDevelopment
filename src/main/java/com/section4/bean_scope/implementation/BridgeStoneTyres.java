package com.section4.bean_scope.implementation;

import com.section4.bean_scope.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with Bridgestone tyres";
    }
}
