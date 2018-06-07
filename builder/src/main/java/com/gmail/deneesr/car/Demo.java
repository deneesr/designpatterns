package com.gmail.deneesr.car;

import com.gmail.deneesr.car.builders.CarBuilder;
import com.gmail.deneesr.car.builders.CarManualBuilder;
import com.gmail.deneesr.car.cars.Car;
import com.gmail.deneesr.car.cars.Manual;
import com.gmail.deneesr.car.director.Director;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
