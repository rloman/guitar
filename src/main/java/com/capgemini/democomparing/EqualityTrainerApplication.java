package com.capgemini.democomparing;

import com.capgemini.demoseasons.Tourist;

public class EqualityTrainerApplication {

    public static void showDemoRegardingEqualsOnObjects() {

        Tourist shana = new Tourist();
        shana.setName("Shana");
        Tourist viet = new Tourist();
        viet.setName("Shana");

        if(shana.equals(viet)) {
            System.out.println("The tourists are the same");
        }
        else {
            System.out.println("The tourists are NOT the same");
        }

    }

    public static void main(String[] args) {

        int myAge = 49;

        int stephansAge = 24;

        if (compareAges(myAge, stephansAge)) {
            System.out.println("They have the same age");
        } else {
            System.out.println("They do not have the same age");
        }

        char firstLetter = 'J';
        char lastLetter = 'B';


        String mooName = "Mo";
        String sanneName = "Sanne";

        if(compareNames(mooName, sanneName)) {
            System.out.println("They have the same name");
        }
        else {
            System.out.println("They do not have the same name");
        }


        showDemoRegardingEqualsOnObjects();



    }

    public static boolean compareNames(String first, String second) {
        if(first.equals(second)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean areCharsTheSame(char first, char second) {
        if(first == second) {
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean compareAges(int first, int second) {

        if (first == second) {
            return true;
        } else {
            return false;
        }


    }
}
