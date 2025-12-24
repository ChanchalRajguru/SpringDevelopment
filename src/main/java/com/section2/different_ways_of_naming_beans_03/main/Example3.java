package com.section2.different_ways_of_naming_beans_03.main;

import com.section2.different_ways_of_naming_beans_03.beans.Vehicle;
import com.section2.different_ways_of_naming_beans_03.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh2.getName());


        Vehicle veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh3.getName());
    }
}
