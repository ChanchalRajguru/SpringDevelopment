package com.section2.creatingBeans_01.main;

import com.section2.creatingBeans_01.beans.Vehicle;
import com.section2.creatingBeans_01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is = " + vehicle.getName());

        /* The var keyword was introduced in Java 10.
        * Type inference is used in var keyword which automatically detects the datatype of a variable
        * based on the surrounding context.. */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh.getName());

        /* We do not need to do any explicit casting while fetching a bean from context.
        * Spring is smart enough to look for a bean of the type you requested in its context.
        * If such a bean doesn't exist, Spring will throw an exception. */

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring context is = " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring context is = " + num);
    }
}
