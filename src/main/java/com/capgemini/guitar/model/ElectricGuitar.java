package com.capgemini.guitar.model;

public class ElectricGuitar extends Guitar {

    private String element;


    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings); // call the super constructor super(int);
    }


    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public void play() {
        System.out.println("Playing electric guitar");
    }

    public void play(String sound) {
        super.play("Play");
    }


    public void playingWithMyElectricGuitar() {
        System.out.println("Playing with my electrig guitar using my only local method and sub a override");
    }
}
