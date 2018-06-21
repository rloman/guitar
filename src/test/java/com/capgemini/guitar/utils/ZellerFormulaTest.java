package com.capgemini.guitar.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZellerFormulaTest {

    private ZellerFormula zellerFormula;

    @Before
    public void setUp() {
        this.zellerFormula = new ZellerFormula();
    }

    @Test
    public void testRaymondW() {
        int raysBirthDayNumber = zellerFormula.getWeekday(29, 9, 1987);

        Assert.assertEquals(6, raysBirthDayNumber);
    }
}
