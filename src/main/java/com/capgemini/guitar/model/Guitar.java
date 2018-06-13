package com.capgemini.guitar.model;

public class Guitar /* extends Object, never write in code but it is very true */ {

    private int numberOfStrings;
    private String material;

    public double shana;

    public Guitar(String material) {
        this();
        this.setMaterial(material);
    }

    public Guitar(int numberOfStrings) {
        this.setNumberOfStrings(numberOfStrings);
    }


    public Guitar() {
        this(6);
    }


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

    public void play() {
        System.out.println("Playing normal guitar");
    }
}
