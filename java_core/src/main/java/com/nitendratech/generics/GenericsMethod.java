package com.nitendratech.generics;


import java.util.Arrays;

public class GenericsMethod {

    static <T> void Display(T[] arr){
        //Loop through the Array
        for (int i =0 ; i<arr.length ;i ++){

            //Check if array is not null

            if(arr[i] !=null){
                System.out.print(arr[i] + " ");
            }

        }

    }

    public static void main (String [] args){
        String[] names = new String[10];

        names[0] = "Tom";
        names[1] = "Hari";
        names[2] = "Rachael";
        names[3] = "Jim";
        names[4] = "Bryan";
        names[6] ="Jenny";

Display(names);
/*
Generic classes and Objects works with only
object data types but not the primitive data types like int
 */

        //Goes to new Line
        System.out.print("\n");
Integer[] numArray = new Integer[] {1,2,3,4,5,6,7};

Display(numArray);
    }
}
