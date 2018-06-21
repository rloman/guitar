package com.capgemini.demoseasons;

import java.util.ArrayList;
import java.util.List;

public class EnumApplication {

    private static List<Tourist> tourists = new ArrayList<>();


    public static void addSomePersonToList(String name, Season favourite, Season leastFavourite) {
        Tourist tourist = new Tourist();
        tourist.setName(name);
        tourist.setMyFavouriteSeason(favourite);
        tourist.setMyLeastFavouriteSeason(leastFavourite);

        tourists.add(tourist);
    }

    public static void printList() {

        int numberOfPeopleLikingSummer = 0;
        int numberOfPeopleLikingWinter = 0;

        for (Tourist elementOfList : tourists) {
            if (elementOfList.getMyFavouriteSeason() == Season.SUMMER) {
                numberOfPeopleLikingSummer++;
            } else if (elementOfList.getMyFavouriteSeason() == Season.WINTER) {
                numberOfPeopleLikingWinter++;
            }
        }

        System.out.println("The number of people like summer is: " + numberOfPeopleLikingSummer);
        System.out.println("The number of people like winter is: " + numberOfPeopleLikingWinter);

    }

    public static void printAllSeasonEnumValues() {

        Season[] seasonValues = Season.values();

        for (Season aValueFromTheSeasonEnumType : seasonValues) {
            System.out.println("A value of the Season enum type is: " + aValueFromTheSeasonEnumType);
        }


    }

    public static void printOrdinalValues() {

        for (Season aValueFromTheSeasonEnumType : Season.values()) {
            System.out.println("A value of the Season enum type is: " +
                    aValueFromTheSeasonEnumType + ", and his ordinal value is:" + aValueFromTheSeasonEnumType.ordinal());
        }

    }

    public static void printAllEnums() {


        for (GroupMember member : GroupMember.values()) {
            System.out.println("A member is:" + member);
        }
    }

    public static void printGroupMembers() {

        GroupMember mightBeArjan = GroupMember.valueOf("ARJAN");

//        GroupMember mightBeNotInTheGroup = GroupMember.valueOf("Pieter");

//        System.out.println(mightBeNotInTheGroup);

        System.out.println(mightBeArjan);

        String lowerCaseArjan = mightBeArjan.toString().toLowerCase();

        System.out.println(lowerCaseArjan);

    }

    public static void printLikeness() {

    }


    public static void main(String[] args) {

        /*
        addSomePersonToList("Raymond", Season.SPRING, Season.WINTER);
        addSomePersonToList("Hielke", Season.SUMMER, Season.WINTER);
        addSomePersonToList("Mo", Season.SUMMER, Season.WINTER);

        printList();
        */

//        printAllSeasonEnumValues();


//        printOrdinalValues();






    }

}


