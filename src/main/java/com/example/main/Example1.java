package com.example.main;

import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String args[]){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

        var name = context.getBean(String.class);
        System.out.println("Name from Spring Context is: " + name);

        var number = context.getBean(Integer.class);
        System.out.println("Number from Spring Context is: " + number);
    }
}

