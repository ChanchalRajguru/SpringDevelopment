package com.section3.wiringBeans_using_MethodParameters.beans;

public class Person {

    public Person(){
        System.out.println("Person bean created by Spring");
    }

    private String name;
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person name  = " + name;
    }
}
