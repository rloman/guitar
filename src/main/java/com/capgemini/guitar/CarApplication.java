package com.capgemini.guitar;

import com.capgemini.guitar.model.Car;

public class CarApplication {


    public static void main(String[] args) {

        Car  auto = new Car("a");
        Car otherCar = new Car("A");
        System.out.println(auto.getMileage());


        // invoking the method
        auto.drive();

        System.out.println(auto.getMileage());

        auto.drive();
        auto.drive();

        System.out.println(auto.getMileage());

        System.out.println(otherCar.getMileage());
        otherCar.drive();
        otherCar.drive();

        System.out.println(otherCar.getMileage());

        System.out.println(auto.getMileage());


        auto.setLicensePlate("PS49RS");


    }

}
