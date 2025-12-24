package com.section2.component_annotation_05.config;

import com.section2.component_annotation_05.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/* Spring @Configuration annotation is a part of the spring core framework.
Spring @Configuration annotation indicates that the class has @Bean definition methods.
So Spring container can process the class and generate Spring Beans to be used in the application.*/


@Configuration
@ComponentScan(basePackages = "com.section2.component_annotation_05.beans")
public class ProjectConfig {
    /*  @Bean    annotation lets Spring know that it need to call this method when it initializes its context and adds the returned value to its context*/
}
