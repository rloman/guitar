package com.capgemini.guitar.model;

public class Guitar extends MusicInstrument implements Comparable<Guitar> /* extends Object, never write in code but it is very true */ {


    public static int guitarCounter = 0;

    private int numberOfStrings;
    private String material;

    public Guitar(String material) {
        this();
        this.setMaterial(material);
    }

    public Guitar(int numberOfStrings) {
        this.setNumberOfStrings(numberOfStrings);
    }


    public Guitar() {
        this(6);
        guitarCounter++;
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

    @Override
    public void play() {
        System.out.println("Playing normal guitar");
    }

    public void play(String sound) {
        System.out.println("Playing normal guitar with the sound "+sound);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public int compareTo(Guitar o) {
        // the contract is
        // return 0 when both are equal / the same
        // return >0 when this / I am greater
        // return <0 when I am smaller

        // return table.getId() - o.getId();

        return this.getNumberOfStrings() - o.getNumberOfStrings();
    }
}
