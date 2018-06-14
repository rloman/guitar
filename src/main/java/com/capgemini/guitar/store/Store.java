package com.capgemini.guitar.store;

import com.capgemini.guitar.model.Guitar;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static int lastGuestNumber = 0;

    // key : integer, value : Room (or subtype)
    private Map<Integer, Room> roomHashMap = new HashMap<>();

    private Map<Integer, Guest> guestStore = new HashMap<>();


    public void add(int i, Room r) {
        this.roomHashMap.put(i, r);
    }

    public void add(Guest g) {
        this.guestStore.put(++lastGuestNumber, g);

    }
}


class Room {

}

class Guest {

}