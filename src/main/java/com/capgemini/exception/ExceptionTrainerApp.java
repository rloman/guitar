package com.capgemini.exception;

import com.capgemini.guitar.model.Guitar;

import javax.sound.midi.Soundbank;

public class ExceptionTrainerApp {

    public static void main(String[] args) throws ImpossibleToDivideByZeroException {

        int a = 6;
        int b = 0;


//        showIntegerParseIntWithException();


//        nullPointerDemo();


//        printDivide(a, b);


        int result = 0;
        result = divide(4, 0);

        System.out.println(result);


        System.out.println("End of program");


    }

    public static int divide(int a, int b) throws ImpossibleToDivideByZeroException {
        try {
            // a lot of call ssss whatefver ....
        } catch (ArithmeticException | NumberFormatException e) {

            throw new ImpossibleToDivideByZeroException();
        }

        finally {
            // close the DB or something
        }

        // since closing here is not always executed .....

        return 42;

    }

    public static void printDivide(int a, int b) {


        try {
            System.out.println(a / b);

            // do nothing here it fails ...
        } catch (ArithmeticException ae) {
            System.out.println("That went pretty wrong ... // cannot divide by zero ");
            System.out.println("I catched the exception ... and now I can continue my program normally ... ");
            System.out.println("Please don't do it again ... ");
        }
        // resume the program here ... whether coming from the try or the catch ...
    }

    public static void showIntegerParseIntWithException() {
        String ageEnteredOnMyScreenNextWeek = "59";

        // now I want to convert that to a number
        int aNumberOfIt = Integer.parseInt(ageEnteredOnMyScreenNextWeek);

        System.out.println(aNumberOfIt);
    }

    public static void nullPointerDemo() {
        Guitar noGuitar = null;


        System.out.println(noGuitar.getMaterial());
    }
}
