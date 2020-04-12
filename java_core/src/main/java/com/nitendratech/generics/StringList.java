package com.nitendratech.generics;

public class StringList<T> implements IList<T> {

    private T[] dataStore;
    private int size;
    private int position;


    public StringList(int numElements){
        size = numElements;
        position =0;
        dataStore = (T[]) new Object[size];
    }


    public void add (T element){
        dataStore[position] = element;
        ++position ;
    }

    public T get (int n) {
        return dataStore[n];
    }


}
