package com.section3.wiringBeans_using_MethodParameters.main;

import com.section3.wiringBeans_using_MethodParameters.beans.Person;
import com.section3.wiringBeans_using_MethodParameters.beans.Vehicle;
import com.section3.wiringBeans_using_MethodParameters.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {

    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person name from Spring context is = " + person.getName());
        System.out.println("Vehicle name from Spring context is = " + vehicle.getName());
        System.out.println("Vehicle that Person own is = " + person.getVehicle());
    }
}
