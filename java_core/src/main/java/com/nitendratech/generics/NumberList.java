package com.nitendratech.generics;

/**
 * Implements the IList Interface
 */
public class NumberList<T> implements IList<T> {

    private T[] datastore;
    private int size;
    private int position;


    public NumberList(int numElements){
        size = numElements;
        position =0;
        datastore = (T[])new Object[size];
    }

    //Stores the element at the current position at Array
    public void add(T element){
        datastore[position] = element;
        ++position;
    }

    // return the data at indexed position
    public T get(int n){

        return datastore[n];
    }


}
