package com.gmail.deneesr.model;

/**
 *
 */
public class Ford implements Car {

    @Override
    public void drive() {
        System.out.println("Ford rides");
    }

    @Override
    public void stop() {
        System.out.println("Ford stop");
    }
}
