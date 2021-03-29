package com.nitendratech.tutorials;
/**
 * Created by @author nitendratech on 3/28/21
 */
public class Variables {

  public static String globalVariable ="Hello World"; //Globally Defined Variable

  public static void methodScopeForVariable(){
    String myName="Nitendra Gautam"; //Variable defined Within the method
    System.out.println(myName);
    System.out.println(globalVariable);
  }
  public static void main(String[] args){
    int var1, var2, var3; // Declaring three variables var1,var2 and var3
    int variable1 = 22; // Declaring and Initializing one Variable
    int var4 = 3, var5, var6 = 5; // Declare var5 but initialize var4 and var6
    byte z = 22;
    double shoppingBill = 120.29;
    char characterValue = 'x'; // Variable characterValue has value of X
    String myWebsite ="nitendratech.com";

    methodScopeForVariable();
    System.out.println(globalVariable);
  }
}