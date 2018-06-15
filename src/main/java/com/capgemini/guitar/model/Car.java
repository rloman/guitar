package com.capgemini.guitar.model;

public class Car extends Vehicle {

    private String licensePlate;
    private int mileage;
    private String holder;


    public Car() {

    }

    public Car(String licensePlate, int mileage) {
        this.licensePlate = licensePlate;
        this.mileage = mileage;
    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {

        return this.licensePlate;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void drive() {

        this.mileage++;  // same as: this.mileage = this.mileage + 1;

    }


}
