package com.section2.primary_annotation_04.main;

import com.section2.primary_annotation_04.beans.Vehicle;
import com.section2.primary_annotation_04.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh.getName());
    }
}
