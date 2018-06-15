package com.capgemini.guitar.scoping;

public class Rollercoaster {

    private int price;


    public void foo() {

        {
            String name = "Python";

            price = 45;

            {
                name = "Adder";

                int counter = 0;

                do {
                    int add = 4;
                    counter = counter + add;

                } while (counter < 20);
                // can I access add here!
                // no ... I can't according to the law of Mo

            }
        }

        {
            // can I use name now which is declared above
//            name = "Hielke"; // vout
        }


    }

    public void bar() {
//        name here of the method foo is not reachable
        price = 23;
    }


}
