package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("AUDI");
        return vehicle;
    }

    @Bean
    String hello(){
        return "HELLO WORLD";
    }

    @Bean
    int number(){
        return 10;
    }

}
