package com.section2.creatingBeans_01.config;

import com.section2.creatingBeans_01.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Spring @Configuration annotation is a part of the spring core framework.
Spring @Configuration annotation indicates that the class has @Bean definition methods.
So Spring container can process the class and generate Spring Beans to be used in the application.*/


@Configuration
public class ProjectConfig {
    /*  @Bean annotation lets Spring know that it need to call this method when it initializes its context and adds the returned value to its context*/
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    /*  The method names usually follow verb notation like sayHello() or printNumber().
      But for methods which we will use to create beans, can use nouns as names.
      This will be a good practice as the method names will become bean names as well in the context */

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
