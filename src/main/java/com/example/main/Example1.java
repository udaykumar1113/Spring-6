package com.example.main;

import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String args[]){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle1 = context.getBean("firstVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle1.getName());

        var vehicle2 = context.getBean("secondVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle2.getName());

        var vehicle3 = context.getBean("thirdVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle3.getName());
    }
}

