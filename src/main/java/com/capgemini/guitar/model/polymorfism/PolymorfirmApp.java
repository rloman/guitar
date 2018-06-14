package com.capgemini.guitar.model.polymorfism;

import com.capgemini.guitar.model.ChildElectricGuitar;
import com.capgemini.guitar.model.ElectricGuitar;
import com.capgemini.guitar.model.Guitar;
import com.capgemini.guitar.model.Room;

public class PolymorfirmApp {

    public static void main(String[] args) {

        Employee e = new Employee();

        // new now
        Person p = new Employee();


        // always the case the TaxPayer IS-A citizen
        Citizen c = new TaxPayer();


        // error
//        TaxPayer t = new Citizen();


        // error again ...
//        Friend f = new Person();


        Guitar g = new ElectricGuitar(3);

        g.play();


        // good
//        ChildElectricGuitar g1 = new ChildElectricGuitar();

        // better ...
        Guitar g2 = new ChildElectricGuitar();

    }
}
