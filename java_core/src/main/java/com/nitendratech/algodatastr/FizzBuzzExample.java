package com.nitendratech.algodatastr;


import java.util.stream.IntStream;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number
 * and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.


 */
public class FizzBuzzExample {

	
public static void fizzBuzzJava81(){
    IntStream.rangeClosed(1,100).mapToObj(
            i -> i % 15 == 0 ? "FizzBuzz"
                    : (i % 3 == 0 ? "Fizz"
                    : (i % 5 ==0 ? "Buzz"
                    : String.valueOf(i))))
            .forEach( st -> System.out.println( st));
}

public static void fizzBuzzJava8(){
    IntStream.rangeClosed(1,100)
            .mapToObj(i ->
            i % 3 == 0 ?
                    (i % 5 ==0 ? "FizzBuzz" : "Fizz") :
                    (i % 5 == 0 ? "Buzz" : i))
            .forEach(System.out::println);
}

    public static void printFizzBuzz(){
        for (int i =1 ;i<=100 ;i++){
            if(i % 15 ==0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 ==0){
                System.out.println("Fizz");
            } else if(i % 5 ==0){
                System.out.println("Buzz");

            }else {
                System.out.println(String.valueOf(i));
            }
        }
    }

    public static void main(String args[]){
FizzBuzzExample.fizzBuzzJava81();
    }
}
