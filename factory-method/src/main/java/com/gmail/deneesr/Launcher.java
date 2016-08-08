package com.gmail.deneesr;

import com.gmail.deneesr.model.Car;

/**
 *
 */
public class Launcher {

    public static void main(String[] args) {

        CarSelector carSelector = new CarSelector();

        Car carCity = carSelector.getCar(RoadType.CITY);

        carCity.drive();
        carCity.stop();

        Car carOffRoad = carSelector.getCar(RoadType.OFF_ROAD);

        carOffRoad.drive();
        carOffRoad.stop();
    }

}
