package com.section3.assignment;

import com.section3.assignment.beans.Person;
import com.section3.assignment.beans.Vehicle;
import com.section3.assignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AssignmentApplication {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Vehicle that person owns = " + person.getVehicle());

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name = " + vehicle.getName());
    }
}
