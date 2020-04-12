package com.nitendratech.algodatastr;

import java.util.Map;
import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

 /**
  * PseudoCode

  Input Array: [2,3,7,4,8]

  Expected Results: 7
  Output: [1, 3]

  Brute Force Approach: Loop through the Array and take each Element
  Compare Each Element with other element 

  i = 0 to N
    j = 0 to N
    arr[i] +arr[j]  == Expected Results
     If we use this approach it will result in time comlexity of O(n^2) which is not the best algorithm.

     An Alternate approach is to loop throuhgh that Array once and save that number elsewhere.Saving that number 
     elsewhere will help to do the look up for that number 

     Lets say we start with element 2 and 3. Since we already checked 2 , we will store it in a data structure.

     That data structure can be either Map or Set. 
    If we use set it will give the number, but will will not give the exact location where the number was.
    If we want both the location and numberl itself, we have to use Map data structure

    New Approach with Map data Strcuture with one Pass
    Input Array: [2,3,7,4,8]           ==> Expected Result =7

    numMap = Empty Map
    for index_num_i = 0 to N
        delta = target_result - arr[index_num_i]
        if numMap contains delta
            return [index_num_i, numMap(delta).value]
        numMap.put(arr[index_num_i],index_num_i) 
    Every time we go through the element we save the Array Element(arr[index_num_i]) and the index of the Array Element(index_num_i)
      

  */
public class TwoSumExample {

    public static void main(String args[]){

        int[] inputNumbers = new int[]{2, 3, 7, 4, 8};
        int targetValue = 10;

        int results[] = getTwoSum(inputNumbers, targetValue);
        System.out.println(results[0] + " " +results[1]);

    }



    public static int[] getTwoSum(int[] inputNumbers, int targetValue){

        Map<Integer,Integer> visitedNumbers = new HashMap<>();


        for (int i = 0;i<inputNumbers.length;i++){
            int deltaValue = targetValue-inputNumbers[i];

            if (visitedNumbers.containsKey(deltaValue)) {
                return new int[] {i, visitedNumbers.get(deltaValue)}; // Returning the indexes

            }
            visitedNumbers.put(inputNumbers[i],i);

        }
        return new int[] {-1,-1};

        

    }

}