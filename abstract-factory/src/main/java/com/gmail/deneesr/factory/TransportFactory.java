package com.gmail.deneesr.factory;

import com.gmail.deneesr.model.Aircraft;
import com.gmail.deneesr.model.Car;

/**
 *
 */
public interface TransportFactory {

    Car createCar();
    Aircraft createAircraft();

}
