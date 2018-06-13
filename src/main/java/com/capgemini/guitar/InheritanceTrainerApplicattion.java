package com.capgemini.guitar;

import com.capgemini.guitar.model.ElectricGuitar;
import com.capgemini.guitar.model.Guitar;

public class InheritanceTrainerApplicattion {

    public static void main(String[] args) {

        ElectricGuitar electricGuitar = new ElectricGuitar(7);

        System.out.println(electricGuitar.getElement());
        System.out.println(electricGuitar.getMaterial());

        electricGuitar.setNumberOfStrings(6);
        electricGuitar.setElement("RGB001");
        electricGuitar.setMaterial("Wood");

        System.out.println(electricGuitar.getNumberOfStrings());
        System.out.println(electricGuitar.getMaterial());
        System.out.println(electricGuitar.getElement());

        // for demo
        Guitar g = new Guitar("Wood");
    }
}
