package com.section3.assignment_solution.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.section3.assignment_solution.implementation", "com.section3.assignment_solution.services"})
@ComponentScan(basePackageClasses = {com.section3.assignment_solution.beans.Person.class, com.section3.assignment_solution.beans.Vehicle.class})
public class ProjectConfig {
}
