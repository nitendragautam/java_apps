package com.nitendratech.javatesting.mockitotest;

/**
 * Created by @author nitendratech on 11/22/20
 */
public class AddServiceImpl  implements  AddService{

    @Override
    public int add(int number1, int number2) {
        System.out.println("AddServiceImpl add Method Executed ");

        return number1 +number2;
    }
}
