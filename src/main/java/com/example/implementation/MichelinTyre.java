package com.example.implementation;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre implements Tyre {

    public String rotate(){
        return "Vehicle moving with Michelin tyres";
    }

}
