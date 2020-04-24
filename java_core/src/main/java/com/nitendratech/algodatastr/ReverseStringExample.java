package com.nitendratech.algodatastr;

/**
 * 
 * There are two ways of Reversing String
 * 
* Using String Builder 
* 
*  --> Use reverse() method and then call toString() method
* 
* 
* 
* 
*

* Another Manually
* 
* String str="Hello";
 *
 */

public class ReverseStringExample{



public static void main(String args[]){

String str = "Nitendra Gautam";

//System.out.println(reverseWithStringBuilder(str));
System.out.println(reverseManually(str));


}

private static String reverseWithStringBuilder(String str){


return new StringBuilder(str)
		.reverse()
		.toString();

}

private static String reverseManually(String str){

StringBuilder sb = new StringBuilder(); //String builder for Storing the results

for (int i= str.length()-1; i>=0;i--){
	sb.append(str.charAt(i));
}

return sb.toString();

}

}