package com.nitendratech.practice;


/**
 * Checking String equality between String literal and String Object
 *
 */
public class StringEquality {

    public static void main(String [] args){
        String stringLiteral ="Hello";
        String stringObj = new String("Hello");
        String otherLiteral = "Hello";
        String otherObj = new String("Hello");

        // Below two refers the same String in memory
        //stringLiteral --> "Hello"
         // otherLiteral----^

        //Bellow two refers different object in memory
        //stringObject --> "Hello"   This refers to seperate reference as it is instance of ```java.lang.String``` class
        //otherObj --> "Hello"


        System.out.println(stringLiteral == stringObj); //Variable stringLiteral is referencing different "Hello" in memory
        System.out.println(stringLiteral == otherLiteral); // They reference the same String
        System.out.println(stringLiteral.equals(stringObj)); //It compares the true value of the String rather than cpomparing the references
        System.out.println(stringLiteral.equals(otherLiteral));


        System.out.println();
        System.out.println(stringObj == otherObj); // These two compare different references in memory
        System.out.println(stringObj.equals(otherObj));//Since we are comparing the value rather than the String,it will return true
    }
}
