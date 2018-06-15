package com.capgemini.guitar.model.thisdemo;

public class BirdDoctor {


    public void foo(BirdDoctor d) {

    }


    public void heal(Bird b) {
        b.setHealthy(true);

        foo(this);
    }


}
