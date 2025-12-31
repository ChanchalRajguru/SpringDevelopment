package com.section3.deep_dive_into_autowiring.config;

import com.section3.deep_dive_into_autowiring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.section3.deep_dive_into_autowiring.beans")
public class ProjectConfig {


    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
//    @Primary
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
