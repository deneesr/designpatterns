package com.gmail.deneesr;

import com.gmail.deneesr.model.Car;
import com.gmail.deneesr.model.Jeep;
import com.gmail.deneesr.model.Porsche;

/**
 *
 */
public class CarSelector {

    public Car getCar (RoadType roadType){
        Car car = null;

        switch (roadType){
            case CITY: car = new Porsche();
                break;
            case OFF_ROAD: car = new Jeep();
                break;
        }

        return car;
    }
}
