package com.capgemini.guitar.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();


    public void addRoom(Room r) {
        this.rooms.add(r);
    }

    public List<Room> getRooms() {
        return this.rooms;
    }




}


