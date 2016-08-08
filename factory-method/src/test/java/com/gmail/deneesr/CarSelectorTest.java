package com.gmail.deneesr;

import com.gmail.deneesr.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class CarSelectorTest {

    private CarSelector carSelector;

    @Before
    public void init() {
        carSelector = new CarSelector();
    }

    @Test
    public void testGetCar() {

        Car carCity = carSelector.getCar(RoadType.CITY);
        carCity.drive();
        carCity.stop();
        Assert.assertNotNull(carCity);

        Car carOffRoad = carSelector.getCar(RoadType.OFF_ROAD);
        carOffRoad.drive();
        carOffRoad.stop();
        Assert.assertNotNull(carOffRoad);

    }
}
