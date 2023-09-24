package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="firstVehicle")
    Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("AUDI");
        return vehicle;
    }

    @Bean(value="secondVehicle")
    Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean
    @Primary
    Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("JEEP");
        return vehicle;
    }
}
