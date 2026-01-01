package com.section3.circular_dependency.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    /*Comment below to run the code else observe Circular dependency (UnsatisfiedDependencyException)*/
    @Autowired
    private Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing hello from Component Vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle name = " + name;
    }
}
