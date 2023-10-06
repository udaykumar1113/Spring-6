package com.example.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Vehicle {

    private String name = "Toyota";

    public Vehicle(){
        System.out.println("Vehicle bean created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("@Component Annotation implementation");
    }
}
