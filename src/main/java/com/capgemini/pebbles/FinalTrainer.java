package com.capgemini.pebbles;

import com.capgemini.guitar.model.ElectricGuitar;
import com.capgemini.guitar.model.Guitar;

public class FinalTrainer {


    public static final String QUEENNAME = "Maxima";

    public static void main(String[] args) {

        final double PI = 3.1415929636;  // constant hence uppercase

        // vout
//        PI++;


        //object
        final Guitar finalGuitar = new ElectricGuitar(3);
        finalGuitar.setNumberOfStrings(5);

//        finalGuitar = new BasGuitar();


    }
}


final class Cafe {

}


class BeerCafe /* vout extends Cafe  */ {

    public final void drink() {

    }

}


class ChocoladeCafe extends BeerCafe {

    /*
    @Override
    public void drink() {

    }
    */

}


