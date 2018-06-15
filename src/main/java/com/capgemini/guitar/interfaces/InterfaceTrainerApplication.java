package com.capgemini.guitar.interfaces;

public class InterfaceTrainerApplication {

//    Television v = new Television(); // vout

    public static void main(String[] args) {

        Television v = new Samsung();
        Samsung s = new Samsung();

        v.on();
        v.off();

        TelevisionSwitcher switcher = new TelevisionSwitcher();
        switcher.switchOn(v);
        switcher.switchOn(s);

    }




}
