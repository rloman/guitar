package com.capgemini.motor;

import com.capgemini.guitar.model.MotorCycle;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTrainerApplication {

    public static void main(String[] args) {
        MotorCycle honda = new MotorCycle("Honda");
        MotorCycle suzuki = new MotorCycle("Suzuki");
        MotorCycle bmw = new MotorCycle("BMW");


        List<MotorCycle> motorCycles = new ArrayList<>();

        motorCycles.add(honda);
        motorCycles.add(suzuki);
        motorCycles.add(bmw);


        for (MotorCycle motorCycle : motorCycles) {
            System.out.println(motorCycle.getBrand());
        }

        MotorCycle second = motorCycles.get(1);

        System.out.println(second.getBrand());

    }
}
