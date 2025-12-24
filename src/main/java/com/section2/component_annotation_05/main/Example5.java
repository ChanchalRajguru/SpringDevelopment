package com.section2.component_annotation_05.main;

import com.section2.component_annotation_05.beans.Vehicle;
import com.section2.component_annotation_05.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from the spring context is: " + veh.getName());
        veh.printHello();
    }
}
