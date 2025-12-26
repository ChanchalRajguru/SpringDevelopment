package com.section2.post_construct_annotation_06.main;

import com.section2.post_construct_annotation_06.beans.Vehicle;
import com.section2.post_construct_annotation_06.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {

    static void main(String[] args) {

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle veh = context.getBean(Vehicle.class);
//        System.out.println("Component Vehicle name from the spring context is: " + veh.getName());
//        veh.printHello();
//        context.close();
//        veh.printHello();

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Vehicle veh = context.getBean(Vehicle.class);
            System.out.println("Component Vehicle name from the spring context is: " + veh.getName());
            veh.printHello();
        }

    }
}
