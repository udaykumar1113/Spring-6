package com.example.implementation;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
