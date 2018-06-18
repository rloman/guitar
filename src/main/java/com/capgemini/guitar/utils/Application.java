package com.capgemini.guitar.utils;

public class Application {

    public static void main(String[] args) {


        int daysOfAugust = DateUtils.getNumberOfDaysInMonth(8);

        System.out.println(daysOfAugust);

        int days13 = DateUtils.getNumberOfDaysInMonth(13);

        System.out.println(days13);
    }
}
