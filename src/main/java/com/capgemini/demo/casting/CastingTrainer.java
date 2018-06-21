package com.capgemini.demo.casting;

import com.capgemini.guitar.model.BasGuitar;
import com.capgemini.guitar.model.ElectricGuitar;
import com.capgemini.guitar.model.Guitar;

import javax.sound.midi.Soundbank;

public class CastingTrainer {

    public static void main(String[] args) {

        short number = 32766;

        System.out.println(number);

        byte shorterNumber = (byte) number;

        System.out.println(shorterNumber);

        // Objects

        Guitar g = new BasGuitar();

        if (g instanceof BasGuitar) {
            BasGuitar bass = (BasGuitar) g;
            bass.playTheBass();
        }

        // dark side

        Guitar e = new ElectricGuitar(3);

//        BasGuitar bassGuitarAgain = (BasGuitar) e;

//        bassGuitarAgain.playTheBass();


        for (int i = 0; i < 10; i++) {
            int aRandomNumber = (int) (Math.random() * 20);

            System.out.println(aRandomNumber);

            int anotherRandom = Double.valueOf(Math.random() * 20).intValue();


        }


    }
}
