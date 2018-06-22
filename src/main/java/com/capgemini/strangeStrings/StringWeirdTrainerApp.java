package com.capgemini.strangeStrings;

public class StringWeirdTrainerApp {

    public static void main(String[] args) {

        String s = "Eva";
        String s2 = "Eva";


        String s3 = new String("Eva");


        String computer="Computer";


        StringBuilder stringBuilder = new StringBuilder("Compute");
        stringBuilder.append("r");


        //GOOD
        if(computer.equals(stringBuilder.toString())) {
            System.out.println("The objects are equal semantically");
        }


        //vout
        if(computer == stringBuilder.toString()) {

            System.out.println("The objects are ==");

        }

        String label = "Capgemini ";

        StringBuilder capBuilder = new StringBuilder(label);

        for(int i = 0;i<100;i++) {

            capBuilder.append(i);

            // making an other new String in between
//            System.out.println(label);

        }
        String capString = capBuilder.toString();
        System.out.println(capString);

        String sanne = "Sanne";
        sanne += " van Mourik";

        capBuilder = new StringBuilder("Adam");
        capBuilder.append(" & Eva");


//        String reversed = capBuilder.reverse().toString();

//        System.out.println(reversed);

//        capBuilder.setLength(25);

        System.out.println(capBuilder.toString());

//        capBuilder.setLength(5);

        System.out.println(capBuilder.toString());

        capBuilder.deleteCharAt(5);

        System.out.println(capBuilder);

        char firstLetter = capBuilder.charAt(0);

        char lastLetter = capBuilder.charAt(capBuilder.length()-1);

        System.out.println(firstLetter+". "+lastLetter);

        System.out.println(new StringBuilder("Parterretrap").reverse());

        System.out.println(new StringBuilder("Raymond Loman").reverse());






    }
}
