package com.nitendratech.tutorials;

/**
 * Created by @author nitendratech on 7/9/21
 */
public class ObjectOrientedConcepts {


  public void bark(){
    System.out.println("Bark");
  }

  public static void main(String[] args){
    ObjectOrientedConcepts dogObject = new ObjectOrientedConcepts(); // Creating a object named dogObject
    dogObject.bark(); // Calling the method bark

    String dogName = "German Sheppard";
    int dogAge = 2;
    System.out.println("Dog Name: "+dogName);
    System.out.println("Dog Age: "+dogAge);
  }
}
