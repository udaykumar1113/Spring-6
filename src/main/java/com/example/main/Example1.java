package com.example.main;

import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String args[]){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();

    }
}

