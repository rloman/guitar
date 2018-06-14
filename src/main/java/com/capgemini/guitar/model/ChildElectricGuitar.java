package com.capgemini.guitar.model;

public class ChildElectricGuitar extends ElectricGuitar {

    public ChildElectricGuitar() {
        super(5);
    }

    public void play() {
        super.play();
        System.out.println("Playing child electric guitar ...");
    }
}
