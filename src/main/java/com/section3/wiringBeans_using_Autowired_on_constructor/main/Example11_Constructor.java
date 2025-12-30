package com.section3.wiringBeans_using_Autowired_on_constructor.main;

import com.section3.wiringBeans_using_Autowired_on_constructor.beans.Person;
import com.section3.wiringBeans_using_Autowired_on_constructor.beans.Vehicle;
import com.section3.wiringBeans_using_Autowired_on_constructor.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example11_Constructor {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle =  context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());

    }
}
