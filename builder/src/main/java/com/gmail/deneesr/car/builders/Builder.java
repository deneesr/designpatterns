package com.gmail.deneesr.car.builders;

import com.gmail.deneesr.car.cars.Type;
import com.gmail.deneesr.car.components.Engine;
import com.gmail.deneesr.car.components.GPSNavigator;
import com.gmail.deneesr.car.components.Transmission;
import com.gmail.deneesr.car.components.TripComputer;

/**
 *
 */
public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine (Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
