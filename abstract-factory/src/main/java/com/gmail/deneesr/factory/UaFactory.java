package com.gmail.deneesr.factory;

import com.gmail.deneesr.model.Aircraft;
import com.gmail.deneesr.model.Car;
import com.gmail.deneesr.model.Mriya;
import com.gmail.deneesr.model.Vida;

/**
 *
 */
public class UaFactory implements TransportFactory {

    @Override
    public Aircraft createAircraft() {
        return new Mriya();
    }

    @Override
    public Car createCar() {
        return new Vida();
    }
}
