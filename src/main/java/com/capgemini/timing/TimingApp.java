package com.capgemini.timing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimingApp {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1992, 4, 5);

        LocalDate now = LocalDate.now();

        long yearsOfOfMo = ChronoUnit.YEARS.between(localDate, now);

        System.out.println("Mo is now living " + yearsOfOfMo + " years");


        LocalDateTime dateNow = LocalDateTime.of(1968, 8, 9, 15, 30, 00);

        System.out.println(dateNow);




    }
}
