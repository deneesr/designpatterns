package com.gmail.deneesr.model;

/**
 *
 */
public class Vida implements Car {

    @Override
    public void drive() {
        System.out.println("Vida rides");
    }

    @Override
    public void stop() {
        System.out.println("Vida stop");
    }
}
