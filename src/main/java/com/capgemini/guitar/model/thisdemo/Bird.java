package com.capgemini.guitar.model.thisdemo;

public class Bird {

    private String name;
    private double weight;
    private boolean healthy;

    public Bird() {
        this(0);
    }

    public Bird (int weight) {
        this.setWeight(weight);
    }


    public void healMe() {

        BirdDoctor doctor = new BirdDoctor();
        this.healthy = false;
        doctor.heal(this);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
}
