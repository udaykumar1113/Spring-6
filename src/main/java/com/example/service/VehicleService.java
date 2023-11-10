package com.example.service;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleService {

    @Autowired
    private Speaker speakers;
    private Tyre tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speaker getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speaker speakers) {
        this.speakers = speakers;
    }

    public Tyre getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyre tyres) {
        this.tyres = tyres;
    }
}
