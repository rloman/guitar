package com.capgemini.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperApp {

    public static void main(String[] args) {

        foo(3);

        // handy stuff

        Boolean male = false;

        Boolean female = true;

        Boolean genderNeutral = null;

        System.out.println(genderNeutral);

        String myAge = "49";


        int myAgeAsInt = Integer.parseInt(myAge);

        System.out.println(myAgeAsInt+1);

        myAge= "Hielke1";

//        int ageOfHielke = Integer.parseInt(myAge);

        int maxint = Integer.MAX_VALUE;

        System.out.println(maxint);

        System.out.println(Long.MAX_VALUE);

        System.out.println(Byte.MAX_VALUE);

        int max = Integer.max(12,54);


        System.out.println(max);

        System.out.println(Integer.reverse(123));

        ArrayList<Long> numbers = new ArrayList<>();

        List <String> someStrings = new ArrayList<>();



    }


    public static void foo(Object o) {

    }


}
