package com.capgemini.guitar;


import com.capgemini.guitar.model.Car;
import com.capgemini.guitar.model.Guitar;

public class CarConstructorTrainerApplication {

    public static void main(String[] args) {
        /*
        Car auto = new Car("AABBCC", 263);
        Car otherCar = new Car("AA33BB");


        System.out.println(auto.getLicensePlate());

          */

        Car auto = new Car();
        Guitar g = new Guitar();

        String firstName = "Rachid";

        StringBuilder builder = new StringBuilder();

        builder.append("Raymond Loman");
        builder.reverse();


        System.out.println(builder.toString());
    }
}
