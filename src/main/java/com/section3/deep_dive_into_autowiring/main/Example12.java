package com.section3.deep_dive_into_autowiring.main;

import com.section3.deep_dive_into_autowiring.beans.Person;
import com.section3.deep_dive_into_autowiring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12 {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
