package com.nitendratech.algodatastr;

/**
 * 
 * @author nitendratech
 *
 *
 *Given the Fullname ,get the last Name
 */
public class GetLastName {
	
	public static String getLastName(String arguments) {
		
String splittedString[] =arguments.split("\t");

int lenSplitString=splittedString.length;

String finalString =splittedString[lenSplitString-1];
		
		
return finalString;
	}
	
	public static void main(String [] args) {
		
		String name1 ="Nitendra Gautam";
		String name2 ="Upendra Prasad Gautam";
		
		System.out.println(GetLastName.getLastName(name1));
		System.out.println(GetLastName.getLastName(name2));
		
	}

}
