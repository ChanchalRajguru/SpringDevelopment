package com.section3.wiringBeans_using_MethodCall.main;

import com.section3.wiringBeans_using_MethodCall.beans.Person;
import com.section3.wiringBeans_using_MethodCall.beans.Vehicle;
import com.section3.wiringBeans_using_MethodCall.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.SortedMap;

public class Example9 {

    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is = " + person.getName());
        System.out.println("Vehicle name from Spring context is = " + vehicle.getName());
        System.out.println("Vehicle that a Person owns is = " + person.getVehicle());
    }
}
