package com.nitendratech.blog.codeexamples.basic;

import java.util.Scanner;

/**
 * scanner allows us to capture the user input from command Line
 */
public class SumTwoNumbersScanner {

    public static void main(String args[]){

        int numOne;
        int numTwo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        numOne = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        numTwo = scanner.nextInt();

        scanner.close();

        int totalSum = numOne +numTwo;

        System.out.println("Sum of Two Numbers using Scanner Class: "+totalSum);

    }
}
