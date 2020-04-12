package com.nitendratech.algodatastr;

/**
 * Created by nitendragautam on 11/16/2018.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Program: Find out duplicate number between 1 to N numbers.
 * You have got a range of numbers between 1 to N,
 * where one of the number is
 repeated. You need to write a program to find out the duplicate number.
 *
 */
public class DuplicateNumber {

    public int findDuplicateNumber(List<Integer> numbers){
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);

        int duplicate = total -(highestNumber *(highestNumber+1)/2);
        return duplicate;
    }

    public int getSum(List<Integer> numbers){
        int sum=0;

        for(int num: numbers){
            sum += num;
        }

     return sum;
    }

    public static void main(String args[]){

        List<Integer> numberList = new ArrayList<Integer>();
        for (int i =1; i< 30;i ++){
            numberList.add(i);
        }

        // Add duplicate Numbers into the List
        numberList.add(22);

        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number:"+dn.findDuplicateNumber(numberList));

    }
}
