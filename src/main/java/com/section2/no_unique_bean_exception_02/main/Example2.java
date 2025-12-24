package com.section2.no_unique_bean_exception_02.main;

import com.section2.no_unique_bean_exception_02.beans.Vehicle;
import com.section2.no_unique_bean_exception_02.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle", Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh.getName());


    }
}
