package com.section3.wiringBeans_using_Autowired_on_classFields.main;

import com.section3.wiringBeans_using_Autowired_on_classFields.beans.Person;
import com.section3.wiringBeans_using_Autowired_on_classFields.beans.Vehicle;
import com.section3.wiringBeans_using_Autowired_on_classFields.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example11 {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }

}
