package com.gmail.deneesr;

import com.gmail.deneesr.factory.TransportFactory;
import com.gmail.deneesr.factory.UaFactory;
import com.gmail.deneesr.factory.UsaFactory;
import com.gmail.deneesr.model.Aircraft;
import com.gmail.deneesr.model.Car;

/**
 *
 */
public class Start {

    public static void main(String[] args) {
        TransportFactory uaFactory = new UaFactory();

        Aircraft aircraftUa = uaFactory.createAircraft();
        aircraftUa.flight();

        Car carUa = uaFactory.createCar();
        carUa.drive();
        carUa.stop();

        TransportFactory usaFactory = new UsaFactory();

        Aircraft aircraftUsa = usaFactory.createAircraft();
        aircraftUsa.flight();

        Car carUsa = usaFactory.createCar();
        carUsa.drive();
        carUsa.stop();
    }

}
