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
}
