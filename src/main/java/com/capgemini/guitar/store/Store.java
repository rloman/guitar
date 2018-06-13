package com.capgemini.guitar.store;

import com.capgemini.guitar.model.Guitar;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private  Map<Integer, Guitar> store = new HashMap<>();

    public void add(int i, Guitar g) {
        this.store.put(i, g);
    }
}
