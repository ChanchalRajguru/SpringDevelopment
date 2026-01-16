package com.section4.bean_scope.implementation;

import com.section4.bean_scope.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    public String rotate(){
        return "Vehicle moving with Michelin Tyres";
    }
}
