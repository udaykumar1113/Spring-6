package com.example.implementation;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeaker implements Speaker {

    public String makeSound() {
        return "Playing music with Sony speakers";
    }
}
