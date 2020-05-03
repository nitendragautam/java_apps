package com.nitendratech.blog.codeexamples.basic;

import java.util.Scanner;

/**
 * Created by @author nitendratech on 5/1/20
 */
public class CheckOddEven {

    public static void main(String args[]){

        int inputNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Integer Number: ");

        inputNumber=scanner.nextInt();

        if(inputNumber>0){
            if(inputNumber %2==0) { // Check Number Divisible by 2 or not
                System.out.println("Input Number: "+inputNumber +" is Even");
            }
            else System.out.println("Input Number: "+inputNumber +" is Odd");
        } else {
            System.out.println("Enter a proper Positive Number");
        }

    }
}
