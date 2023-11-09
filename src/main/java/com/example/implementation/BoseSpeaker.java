package com.example.implementation;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}