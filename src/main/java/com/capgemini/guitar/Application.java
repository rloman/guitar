package com.capgemini.guitar;

import com.capgemini.guitar.model.Guitar;

public class Application {


    public static void main(String[] args) {
        System.out.println("Hello World!");


        int a = 4;
        int b = 3;

        // adagio: <type> <name> = <value>;

        int c = a + b;


        Guitar guitarOfSanne = new Guitar();


        //
        String firstName = "Mo";
        String shanaFirstName = "Shana";

//        Guitar g = "Guitar";


      guitarOfSanne.play();

//        System.out.println(timesPlayed);


        Guitar eve = new Guitar();
        System.out.println(eve.getNumberOfStrings());
        eve.setNumberOfStrings(5);

        System.out.println(eve.getNumberOfStrings());




    }

    public void foo() {
        String v = new String("Poedel");
    }
}
