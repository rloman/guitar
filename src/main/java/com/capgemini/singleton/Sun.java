package com.capgemini.singleton;

public class Sun {


    private static Sun instance;


    public /* synchronized */ static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }

        return instance;
    }

    private Sun() {

    }


}
