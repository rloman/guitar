package com.capgemini.guitar.utils;


import com.capgemini.guitar.model.MotorCycle;

import java.util.List;

/**
 * This class contains several Date related methods
 */
public final class DateUtils {

    /**
     * Get days of month
     *
     * @param month =  the month we are interested in
     * @return the days which are in that month
     */
    public static int getNumberOfDaysInMonth(int month) {

        int result = 0;

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

    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month != 2) {
            return getNumberOfDaysInMonth(month);
        } else {
            if (year % 100 == 0 && year / 100 % 4 == 0) {
                return 29;
            }
            if (year % 100 != 0 && year / 4 == 0) {
                return 29;
            }
        }
        return 28;
    }

}
