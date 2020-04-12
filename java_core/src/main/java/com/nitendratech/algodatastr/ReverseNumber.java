package com.nitendratech.algodatastr;

/**
 * Created by nitendragautam on 11/16/2018.
 */

/**
 * Program: Write a program to reverse a number.

 Description:
 Write a program to reverse a number using numeric operations
 */
public class ReverseNumber {

    public int reverseNumber(int number){
        int reverse = 0;
        System.out.println("Number: "+number);
        while(number != 0 ){
            reverse = (reverse*10)+ (number%10);
            System.out.println("Reverse: "+reverse);
            number = number/10;
            System.out.println("Number: "+number);
        }
        return reverse;
    }

    public static void main(String args[]){
        ReverseNumber rn = new ReverseNumber();
        System.out.println("Reverse Number: "+rn.reverseNumber(1786));
    }
}
