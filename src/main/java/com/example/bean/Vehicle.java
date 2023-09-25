package com.example.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PreDestroy
    public void destroy() { System.out.println("Executing method while closing context"); }

    public void printHello() {
        System.out.println("@Component Annotation implementation");
    }
}
