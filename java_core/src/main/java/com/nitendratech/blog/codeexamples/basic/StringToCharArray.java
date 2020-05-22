package com.nitendratech.blog.codeexamples.basic;

/**
 * Created by @author nitendratech on 5/6/20
 */

/**
 * Converts a Given Input String into Character Array
 */
public class StringToCharArray {

    public static void main(String args[]){

        String inputString = "Nitendra Tech";

        System.out.println("Input String: "+inputString);

        char[] inputCharArray;

        // Convert to Character Array
        inputCharArray = inputString.toCharArray();

        //Print the Characters from the Char Array using different Method
        //Use For Loop

        System.out.println("First Method Output");

        for (int i =0;i<inputCharArray.length; i++){
            System.out.print(inputCharArray[i]);
        }

        System.out.println("\n Second Method Output");

        for (char c : inputCharArray) {
            System.out.print(c);
        }
    }
}
