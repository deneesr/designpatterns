package com.gmail.deneesr.factory;

import com.gmail.deneesr.model.Aircraft;
import com.gmail.deneesr.model.Boeing;
import com.gmail.deneesr.model.Car;
import com.gmail.deneesr.model.Ford;

/**
 *
 */
public class UsaFactory implements TransportFactory{

    @Override
    public Aircraft createAircraft() {
        return new Boeing();
    }

    @Override
    public Car createCar() {
        return new Ford();
    }
}
