package com.nitendratech.algodatastr;


/**
 * 
 * Making Custom LinkedList 
 * 
 * Linked list has bunch of Nodes which we can access .
 * We only only need to track first node in our list instead of tracking every member in the list 
*/
//Linked List
public class CustomLinkedList {
    Node head;

}


//Node Class

class Node {
    int data;
    Node next;

    // Node Constructor
    Node(int d) {
        this.data =d; 
    }
}