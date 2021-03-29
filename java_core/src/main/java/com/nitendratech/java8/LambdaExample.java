package com.nitendratech.java8;




import java.util.ArrayList;

/**
 * Lambda Expression allows one to pass the code as an argument in a concise and readable way.
 */

public class LambdaExample {



    private static void singleArgumentsLambda(){


        // Lets Create an Array List

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);


        // Print Elements using for Loop before Java 8

        for (int item: arrList)
            System.out.println(item);

        /**
         * Lambda Expression Syntax
         *
         * arrList.forEach(   ......   ); ===> Here we define a method that will perform
         *                                     certain operations for each item in the list
         *
         * forEach method for Iterables was introduced in Java 8
         *
         * Method Reference for For Each Method is (System.out::println)
         */
        //Print all elements using Lambda expression

        //Using for Each Method for Iterables introduced in Java 8
        arrList.forEach(System.out::println);


        //Print Cube of each Elements using Lambda expression

        arrList.forEach(item -> System.out.println(item&3));

        arrList.forEach( num-> {
            if (num %2 == 0) System.out.println("Even number: "+num);

        });

    }
    public static void main(String [] args){


        singleArgumentsLambda();




    }

}
