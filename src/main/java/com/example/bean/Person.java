package com.example.bean;

import com.example.bean.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
        System.out.println("Person bean created by Spring");
    }

    private String name = "Luck";
    private Vehicle vehicle;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Vehicle getVehicle() { return vehicle; }

    @Autowired
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
}