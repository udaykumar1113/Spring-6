package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("AUDI");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("JEEP");
        return vehicle;
    }
}
