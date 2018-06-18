package com.capgemini.motor;

import com.capgemini.guitar.model.MotorCycle;

import java.util.*;

public class CollectionsTrainerApplication {

    public static void main(String[] args) {
        MotorCycle honda = new MotorCycle("Honda");
        MotorCycle suzuki = new MotorCycle("Suzuki");
        MotorCycle bmw = new MotorCycle("BMW");


        System.out.println(bmw);

        bmw.setLicensePlate("AABBCC");

        System.out.println(bmw);  // implicitly invoking toString

        String label = "" + bmw; // implicitly invoking toString



        System.exit(0);




























        // Two dimensional stuff // Map // Garderobe
        {
            Map<String, MotorCycle> myMotorCycleStore = new HashMap<>();

            myMotorCycleStore.put("AABBCC", honda);
            myMotorCycleStore.put("SU11KU", suzuki);
            myMotorCycleStore.put("ABMW3", bmw);


            MotorCycle retrievedMotorCycle = myMotorCycleStore.get("AABBCC");

            // toString

            System.out.println(retrievedMotorCycle);



            // enough for now but you might continue using a loop over the keys or something

            System.out.println("Retrieved from the Map/HashMap : " + retrievedMotorCycle.getBrand());


            for (String key : myMotorCycleStore.keySet()) {
                // print the keys
                System.out.print(key + ", ");
            }

            System.out.println();

            for (MotorCycle value : myMotorCycleStore.values()) {
                System.out.print(value + ", ");
            }
            System.out.println();

            for (Map.Entry<String, MotorCycle> keyValuePair : myMotorCycleStore.entrySet()) {

                System.out.println("Key: " + keyValuePair.getKey());
                System.out.println("Value: " + keyValuePair.getValue());
            }

            System.exit(0);

        }

        // At first the single-/one-dimensional stuff
        // List ordered
        {
            List<MotorCycle> motorCycles = new ArrayList<>();

            motorCycles.add(honda);
            motorCycles.add(suzuki);
            motorCycles.add(bmw);


            for (MotorCycle motorCycleComingFromTheList : motorCycles) {
                System.out.println(motorCycleComingFromTheList.getBrand());
            }

            MotorCycle first = motorCycles.get(0);
            System.out.println(first.getBrand());
            MotorCycle second = motorCycles.get(1);

            System.out.println(second.getBrand());

            System.out.println(motorCycles.get(2).getBrand());
        }


        //Set unordered
        {
            Set<MotorCycle> motorCycles = new HashSet<>();

            motorCycles.add(honda);
            motorCycles.add(suzuki);
            motorCycles.add(bmw);


            for (MotorCycle motorCycleComingFromTheList : motorCycles) {
                System.out.println(motorCycleComingFromTheList.getBrand());
            }

        }



    }
}
