package com.capgemini.guitar.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuitarTest {


    private Guitar guitar;

    @Before
    public void setUp() {
        this.guitar = new Guitar();
    }


    @Test
    public void testSetAndGetForNumberOfString() {

        this.guitar.setNumberOfStrings(5);

        int actual = this.guitar.getNumberOfStrings();

        Assert.assertEquals(5, actual);
    }

    @Test
    public void setAndSetMaterial() {
        this.guitar.setMaterial("Wood");

        Assert.assertEquals("Wood", this.guitar.getMaterial());
    }

    @After
    public void tearDown() {
        this.guitar = null;
    }

}
