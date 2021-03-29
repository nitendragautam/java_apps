package com.nitendratech.tutorials;

import java.util.LinkedList;


/**
 * An Example of Linkedlist which creates the Travel Bucket List
 */
public class LinkedListTut {


    public static void main(String [] args){

        LinkedList travelBucketList = new LinkedList();

        // Let's Add Items in the Travel Bucket List
        travelBucketList.add("Hawai, USA"); //Appends the specified element to the end of this list. It is equivalent to addLast(E).
        travelBucketList.addFirst("Barcelona, Spain"); //Inserts the specified element at the beginning of this list.
        travelBucketList.addLast("Kathmandu, Nepal"); //Appends the specified element to the end of this list. It is equivalent to method add(E)
        travelBucketList.add(2,"Mustang, Nepal");
        System.out.println(travelBucketList);


        //Access Items from Linked List

        System.out.println(travelBucketList.get(2)); // Gets values from 2nd index in the list
        System.out.println(travelBucketList.getFirst()); // Its better to use this to get first item than using the get metho

        //Search Functionality
        System.out.println(travelBucketList.contains("Barcelona, Spain"));

        // removing Items from LinkedList
        travelBucketList.removeFirst();
        travelBucketList.removeLast();

        System.out.println(travelBucketList);

        // Removing the elements by either using the object or by using index

        travelBucketList.remove("Mustang, Nepal");
        travelBucketList.remove(0); // Same as removing the first item from LinkedList
        System.out.println(travelBucketList);





    }
}
