package com.nitendratech.practice;


/**
 * Strings are Immutable
 */
public class StringConcatenation {



    public static void main(String args[]){
        String firstName = "Nitendra";
        String lastName = "Gautam";

        //Manual method to Concatenate
        String manConcatenatedName = firstName +" "+lastName;

        System.out.println(manConcatenatedName);
        System.out.println(firstName);
        System.out.println(lastName);

        //Using the contact method
        String conName = (firstName.concat(" ")).concat(lastName);

        System.out.println(conName);

        //Concatenate using the append of StringBuilder method
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World!");
        sb.append(" How ");
        sb.append("Are ");
        sb.append("You? ");

        System.out.println(sb.toString());

        sb.insert(4,"index");
        sb.delete(1,3); //Removing everything from index 1 to 3

        System.out.println(sb.toString());



    }
}
