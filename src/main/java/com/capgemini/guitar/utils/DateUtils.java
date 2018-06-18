package com.capgemini.guitar.utils;


import com.capgemini.guitar.model.MotorCycle;

import java.util.List;

/**
 This class contains several Date related methods
 */
public class DateUtils {

    /** Get days of month
     *
     *
     * @param month =  the month we are interested in
     * @return the days which are in that month
     */
    public static int getNumberOfDaysInMonth(int month) {

        int result = 0;


        // dit is een regel with comment and the comments end at the end of the line
         int i = 45; //my age the rest of the line comment ... e.g. this is for 45 teams

        /*

        Commentblock:
        start with /*

        end with
        */


        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                result = 31;

                break;
            case 2:
                result = 28;

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;

                break;

            default:

                System.out.println("Error, there is no 13th month");
                result = -1;

                break;
        }

        return result;
    }

    /**
     *
     * @param bar
     * @return some int
     */
    public static int foo(int bar) {

    }
}
