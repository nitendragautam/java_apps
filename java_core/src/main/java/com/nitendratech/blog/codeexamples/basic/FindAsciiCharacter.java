package com.nitendratech.blog.codeexamples.basic;

/**
 * Created by @author nitendratech on 5/1/20
 */

/**
 * We will find the  ASCII value of a character in Java and display in console.
 * We are able to do this by type-casting and normal variable assignment operations.
 */
public class FindAsciiCharacter {

    private static void findAsciiValue(char inputChar){
        // Find the ASCII value
        int asciiValue = inputChar;

        // We can get ASCII value by type casting to int
        int asciiValueByCasting = (int) inputChar;

        System.out.println("ASCII Value by Variable assignment for Input Character by  : "+inputChar +" is "+asciiValue);
        System.out.println("ASCII Value by Type Casting for  Input Character : "+inputChar +" is "+asciiValueByCasting);
    }

    public static void main(String args[]){

        findAsciiValue('a');
        findAsciiValue('d');
        findAsciiValue('e');
    }
}
