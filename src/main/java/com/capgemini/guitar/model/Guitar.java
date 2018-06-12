package com.capgemini.guitar.model;

public class Guitar {

    private int numberOfStrings = -1;
    private String material = "Plastic";

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int play() {
        System.out.println("Playing guitar");

        return 42;
    }
}
