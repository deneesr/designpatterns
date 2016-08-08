package com.gmail.deneesr.model;

import com.gmail.deneesr.model.Car;

/**
 *
 */
public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Porsche rides");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stop");
    }

}
