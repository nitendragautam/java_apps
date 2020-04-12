package com.nitendratech.algodatastr;

import java.util.Arrays;

/**
 * Two string will be anagram to each other if and only if they contain the same number of characters
 * (order of the characters doesn't matter). That is,
 * If the two strings are anagram to each other, then one string can be rearranged to form the other string
 */


public class AnagramCheck {


    public boolean checkAnagram(String firstString ,String secondString){

String lowerCaseFirst = firstString.toLowerCase();
String lowerCaseSecond = secondString.toLowerCase();

if(lowerCaseFirst.length() != lowerCaseSecond.length()) return false;

char[] c1 = lowerCaseFirst.toCharArray();
char[] c2 = lowerCaseSecond.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        //Returns true when both arrays are equal
        return Arrays.equals(c1,c2);
    }

    public static void main(String args[]){


        AnagramCheck anagramCheck = new AnagramCheck();
        System.out.println(anagramCheck.checkAnagram("mary","army"));
    }
}
