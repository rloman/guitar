package com.capgemini.guitar.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void testDaysInMonth() {
        Assert.assertEquals(31, DateUtils.getNumberOfDaysInMonth(8));
    }

    @Test
    public void testDaysInMOnthWithYear() {

        {
            LocalDate testDate = LocalDate.of(1900, 2, 28);

            System.out.println(testDate.getDayOfMonth());

            Assert.assertEquals(28, DateUtils.getNumberOfDaysInMonth(2, 1900));
        }

        {
            LocalDate testDate = LocalDate.of(2000, 2, 29);

            System.out.println(testDate.getDayOfMonth());

            Assert.assertEquals(29, DateUtils.getNumberOfDaysInMonth(2, 2000));
        }

        {
            LocalDate testDate = LocalDate.of(1996, 2, 29);

            System.out.println(testDate.getDayOfMonth());

            Assert.assertEquals(29, DateUtils.getNumberOfDaysInMonth(2, 1996));
        }



    }
}
