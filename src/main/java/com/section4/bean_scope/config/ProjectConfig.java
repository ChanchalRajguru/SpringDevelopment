package com.section4.bean_scope.config;

import com.section4.bean_scope.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.section4.bean_scope.implementation", "com.section4.bean_scope.services"})
@ComponentScan(basePackageClasses = {com.section4.bean_scope.beans.Vehicle.class, com.section4.bean_scope.beans.Person.class})
public class ProjectConfig {
}
