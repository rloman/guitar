package com.capgemini.guitar;

import com.capgemini.guitar.model.ChildElectricGuitar;
import com.capgemini.guitar.model.ElectricGuitar;

public class OverrideTrainerApp {

    public static void main(String[] args) {
        ElectricGuitar eg = new ElectricGuitar(6);

//        eg.play();

        ChildElectricGuitar childEg = new ChildElectricGuitar();
        childEg.play();

        childEg.play("U2");

    }
}
