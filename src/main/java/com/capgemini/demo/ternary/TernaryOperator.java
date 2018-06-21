package com.capgemini.demo.ternary;

public class TernaryOperator {


    public static void main(String[] args) {

        int age = 42;


        String label = "";

        if(age > 68) {
            label = "You are pretty worn";
        }
        else {
            label = "You can live for ten years";
        }


        // this can also be expressed using the so called ternary operator

        String newLabel = null;

        newLabel = (age > 68) ? "You are pretty worn" : getLabelForYoungPeople() ; // invoking bar is bad

    }

    public void bar() {

    }

    public static String getLabelForYoungPeople() {
        return "You can live for ten years";
    }
}
