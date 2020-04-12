package com.nitendratech.generics;

public class CustomList<T> {
	
	private T[] dataStore;
	private int size;
	private int position;
	
	
	public CustomList(int numElements){
		
		size = numElements;
		position = 0; //Initial Position = 0
		dataStore = (T[]) new Object[size];
	}
	
	
	/*
	 * Add Element to the List 
	 */
	public void add (T element){
		dataStore[position] = element;
		++position;
	}
	
	
	/*
	 * Returns all elements in the List Seperated by String 
	 */
	public String toString(){
		
		String elements = "";
		for (int i = 0 ;i <position; i++){
			elements += dataStore[i] + " ";
		}
		return elements;
	}

}
