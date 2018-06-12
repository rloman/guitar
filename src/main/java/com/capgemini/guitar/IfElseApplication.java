package com.capgemini.guitar;

public class IfElseApplication {

    public static void main(String[] args) {


        int x = 3;
        int y = 5;

        int waar = 1;

//        if(waar) {

//        }

        if (x == 3) {

        }

        if (x + 1 == 5) {

        }

        if ((x = y + 3) == 5) {
            // false
        }


        if (x < y) {
            System.out.print("X is smaller than Y");
        } else {
            // do something else
            System.out.println("X is equal or larger than Y");
        }

        if (x > y) {
            // do something
        } else {
            if (x > 15) {
                // do something
            } else {
                if (x > 10) {

                }
            }
        }

        if (x < 5) {

        } else if (x < 3) {

        }

        boolean first = false;
        boolean second = true;

        if (first) {
            // will not enter here ...
        }

        if (second) {
            // will enter here ...
        }

        if (first = second) {
            // so now we will enter here
        } else {
            // we will not enter here
        }

        first = false;
        second = true;
        if (second = first) {
            // will not enter here
        } else {
            // will enter here!!!

        }

        if (second == first) {

        }

        if (!second) {

        }

        second = false;
        if (second & first && isMale()) {

        }

        if (first | second | isMale()) {

        }

        first = !second;


    }

    public static boolean isMale() {
        return true;
    }


}
