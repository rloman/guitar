package com.capgemini.demo.instanceofdemo;

import com.capgemini.guitar.model.BasGuitar;
import com.capgemini.guitar.model.Guitar;
import com.capgemini.guitar.model.MusicInstrument;

public class InstanceofTrainer {

    public static void main(String[] args) {
        Guitar g = new BasGuitar();


        if(g instanceof BasGuitar) {

            BasGuitar myBasGuitar = (BasGuitar) g;

            myBasGuitar.playTheBass();


        }
    }

    public static void playInstrument(MusicInstrument musicInstrument) {


    }
}
