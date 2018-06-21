package com.capgemini.demo;

import com.capgemini.guitar.model.Guitar;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        List<Guitar> guitars = new ArrayList<>();

        foo(guitars);

        System.out.println(new Guitar());


        String label = "" + new Guitar();


    }


    public static void foo(List<Guitar> guitars) {

        for (Guitar guitar : guitars) {
            System.out.println(guitar);
            if (guitar.getNumberOfStrings() == 4) {
                System.out.println("That guitar is a bass guitar, like the bass sounds");
            }
        }

    }
}
