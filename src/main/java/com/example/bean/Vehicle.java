package com.example.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialize(){ this.name = "JEEP"; }

    public void printHello() {
        System.out.println("@Component Annotation implementation");
    }
}
