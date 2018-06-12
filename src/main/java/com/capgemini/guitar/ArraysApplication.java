package com.capgemini.guitar;

public class ArraysApplication {

    public static void main(String[] args) {

        int[] numbers = new int[3];


        numbers[0] = 1968;
        numbers[1] = 1970;
        numbers[2] = 1987;

        System.out.println(numbers[2]);

        System.out.println(numbers[0]);

//        System.out.println(numbers[3]); // error

        numbers = new int[]{1968, 1970, 1987}; // size is 3  based on the init block


        // simple loop
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("The value of this element in simple loop: " + numbers[index]);
        }


        // enhanced for loop
        for (int number : numbers) {
            System.out.println("The value of this element in enhanced lp: " + number);
        }

        String[] names = new String[]{"Raymond", "Rachid", "Sjanneke", "Eva"};

        // examtip

        for (String name : names) {
            System.out.println("This is a classroom member: " + name);
        }


        String[] shanaArray = new String[1];

        for (String element : shanaArray) {
            System.out.println(element);
        }

        // without new // still an object
        int[] hielkesNumbers = {1, 2, 3};



        int counter = 0;

        // 0 or more times
        while(counter < 10) {
            System.out.println(counter);

            counter++;
        }


        counter = 15;
        // invoked 1 or more times
        do {
            System.out.println(counter);
        }
        while(counter < 5);

        String[] names2 = new String[]{"Shana"};

        if(names2.length != 0) {

        }





    }
}
