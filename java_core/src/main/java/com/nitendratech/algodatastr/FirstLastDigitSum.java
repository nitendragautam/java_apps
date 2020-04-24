package com.nitendratech.algodatastr;


/**
 * Write a java program to find
 * first digit
 * last digit of a number
 * sum of these two number
 *
 * Example:
 * number =145
 * firstDigit =1
 * lastDigit =5
 *
 * ##Finding Last digit
 * lastDigit = 145%10 = 5{ Using the Modulus operator}
 * Sum_first_last =1+5=6
 *
 * ## Finding first digit
 *To find the first digit we keep on dividing the number by 10 until it is equals to 10
 *
 * firstDigit = inputNumber;
 *
 * while(firstDigit >=10){
 *
 *     firstDigit = firstDigit/10;
 * }
 */


public class FirstLastDigitSum {


    public static int getSum(int inputNumber){
        System.out.println("Input Number= " +inputNumber);

        int lastDigit = inputNumber % 10;

        int firstDigit =0;

        while(inputNumber >= 10){
            inputNumber = inputNumber / 10;
            firstDigit = inputNumber;
        }

        int twoDigitSum = firstDigit +lastDigit;

        System.out.println("Sum: "+ twoDigitSum);

        return twoDigitSum;
    }

    public static void main(String[] args){

            getSum(2539);
            getSum(22675);

    }

}
