package com.nitendratech;


/**
 * We can access every node in Linked List if we can access the first node.
 * If we keep track of the first node, we can keep track of all the nodes
 * Every time we want to add data to the linked list we add it at the front of the list
 */
public class CustomLinkedList {

    Node head;
    // add method to add data to Linked list
    public void add(int data){
        // LL is empty
        if (this.head == null)  this.head = new Node(data);
        // LL is not empty
        else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }

    public static void main( String[] args){
        CustomLinkedList myList = new CustomLinkedList();
        myList.add(10);
        myList.add(18);

        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
    }


}


/**
 * Node contains data and has access to the next node
 */
class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
    }
}
