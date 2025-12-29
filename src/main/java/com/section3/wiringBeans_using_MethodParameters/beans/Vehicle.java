package com.section3.wiringBeans_using_MethodParameters.beans;

public class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle bean created  by Spring!");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name = " + name;
    }

    public void printHello(){
        System.out.println("Printing hello from Component Vehicle Bean");
    }
}
