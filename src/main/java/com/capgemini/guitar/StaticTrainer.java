package com.capgemini.guitar;

import com.capgemini.guitar.model.Guitar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StaticTrainer {

    public static void main(String[] args) {

        Guitar g1 = new Guitar();



        System.out.println(g1.guitarCounter);
        Guitar g2 = new Guitar();
        System.out.println(g2.guitarCounter);

        System.out.println(g1.guitarCounter);


        System.out.println(Guitar.guitarCounter);


        LocalDate sannesBirthday = LocalDate.of(1993, 12, 20);


        LocalDate now = LocalDate.now();

        long sannesDays = ChronoUnit.DAYS.between(sannesBirthday, now);

        System.out.println("Sanne is living now:"+sannesDays);

    }
}
