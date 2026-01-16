package com.section4.bean_scope.main;

import com.section4.bean_scope.config.ProjectConfig;
import com.section4.bean_scope.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {

    static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
//        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
//        System.out.println("Hashcode of the object vehicleServices1 : " +vehicleServices1.hashCode());
//        System.out.println("Hashcode of the object vehicleServices2 : " +vehicleServices2.hashCode());
//        if(vehicleServices1==vehicleServices2){
//            System.out.println("VehicleServices bean is a singleton scoped bean");
//        }


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " + vehicleServices2.hashCode());
        if (vehicleServices1 == vehicleServices2) {
            System.out.println("Vehicle Services bean is a singleton scopes bean");
        }
    }
}
