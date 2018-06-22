package com.capgemini.comparing;

import com.capgemini.guitar.model.Guitar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareApp {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(23,4,52, 44, 98);

        System.out.println(numberList);

        Collections.sort(numberList);

        System.out.println(numberList);

        Guitar g1 = new Guitar(5);
        Guitar g2 = new Guitar(3);

        List<Guitar> guitarList = Arrays.asList(g1, g2);

        Collections.sort(guitarList);

        System.out.println(guitarList);


    }
}
