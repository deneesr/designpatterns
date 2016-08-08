package com.gmail.deneesr.model;

import com.gmail.deneesr.model.Car;

/**
 *
 */
public class Jeep implements Car {

    @Override
    public void drive() {
        System.out.println("Jeep rides");
    }

    @Override
    public void stop() {
        System.out.println("Jeep stop");
    }
}
