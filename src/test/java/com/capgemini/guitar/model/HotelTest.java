package com.capgemini.guitar.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void setUp() {
        this.hotel = new Hotel();
    }

    @Test
    public void testAddRoom() {
        int allclear = this.hotel.getRooms().size();

        Assert.assertEquals(0, allclear);

        this.hotel.addRoom(new Room());

        int shouldBeOne = this.hotel.getRooms().size();

        Assert.assertEquals(1, shouldBeOne);
    }
}
