package com.nitendratech.blog.codeexamples.basic;

/**
 * Created by @author nitendratech on 5/2/20
 */

/**
 *  We will find if an character is an alphabet is a vowel or a consonant using if..else
 *  and switch statements in Java.
 */
public class CheckVowelConsonant {

    /**
     * Checks If character is Vowel or consonant using If Else Statement
     */
    public static void checkVowelCosonantIfElse(char inputChar){

        System.out.println("checkVowelCosonantIfElse Method");

        //Convert to Lower Case
        char lowerCase = Character.toLowerCase(inputChar);

        if(lowerCase =='a' || lowerCase =='e' || lowerCase =='i' || lowerCase =='o'|| lowerCase =='u'){
            System.out.println("Input Character: " +inputChar +" is Vowel");
        } else{
            System.out.println("Input Character: " +inputChar +" is Consonant");
        }
        System.out.println("");


    }

    public static void checkVowelConsonantSwitch(char inputChar){
        System.out.println("checkVowelConsonantSwitch Method");

        char lowerCase = Character.toLowerCase(inputChar);
        boolean isVowel = false;

        switch(lowerCase){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }

        if (isVowel)
            System.out.println("Input Character: " + inputChar + " is Vowel");
        else
            System.out.println("Input Character: " +inputChar +" is Consonant");

        System.out.println("");
    }

    public static void main(String args[]){

        checkVowelCosonantIfElse('a');
        checkVowelCosonantIfElse('b');
        checkVowelCosonantIfElse('e');
        checkVowelCosonantIfElse('Z');

        checkVowelConsonantSwitch('a');
        checkVowelConsonantSwitch('b');
        checkVowelConsonantSwitch('e');
        checkVowelConsonantSwitch('Z');
    }


}
