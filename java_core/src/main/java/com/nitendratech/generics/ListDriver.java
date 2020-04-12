package com.nitendratech.generics;


/*
 * Driver for Custom List Class
 * Which shows Generic Capability od CustomList Class
 */
public class ListDriver {

	public static void main(String args[]){
		CustomList<String> groceryList = new CustomList<String>(10);
		groceryList.add("Fruits");
		groceryList.add("Milk");
		
		System.out.println("Grocery List " +groceryList.toString());
		
		//Number List
		
		CustomList<Integer> numberList = new CustomList<Integer>(10);
		
		numberList.add(1);
		numberList.add(2);
		
		System.out.println("Number List: "+ numberList.toString());
		
	}
}
