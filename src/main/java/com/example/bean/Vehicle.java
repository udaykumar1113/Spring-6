package com.example.bean;

import com.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "Toyota";

    private final VehicleService vehicleServices;

    @Autowired
    public Vehicle(VehicleService vehicleServices){
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public VehicleService getVehicleServices() {
        return vehicleServices;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("@Component Annotation implementation");
    }
}
