package com.section3.circular_dependency.main;

import com.section3.circular_dependency.beans.Person;
import com.section3.circular_dependency.beans.Vehicle;
import com.section3.circular_dependency.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependency {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
