package com.capgemini.guitar.model;

public abstract class MusicInstrument {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void play();


}

class StandardRoom extends Room {

}