package com.example.main;

import com.example.bean.Person;
import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import com.example.service.VehicleService;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String args[]){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean(VehicleService.class);
        System.out.println(vehicleService1.equals(vehicleService2) ?
         " Objects are equal": vehicleService1.hashCode()+" "+vehicleService2.hashCode()+
                " Both Objects are not equal");
    }
}

