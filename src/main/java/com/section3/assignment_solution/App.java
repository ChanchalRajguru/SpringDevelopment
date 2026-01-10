package com.section3.assignment_solution;

import com.section3.assignment_solution.beans.Person;
import com.section3.assignment_solution.beans.Vehicle;
import com.section3.assignment_solution.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);

        Person person = context.getBean(Person.class);
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
