package com.nitendratech.generics;

/**
 * Main Class for Generic Pair Class
 */

public class PairProgram {

    public static void main(String args[]){
//Pair Classes with <String ,Integer> Data Type
        Pair<String ,Integer > grade1 = new Pair<String ,Integer>
                ("Nitendra",90);

        Pair<String,Integer> grade2 = new Pair<String ,Integer>
                ("Gautam",99);

        System.out.println(grade1.first());
        System.out.println(grade1.second());
        System.out.println(grade2.first());
        System.out.println(grade2.second());


        //Pair Generic Class with <String ,String> Data Type

        Pair<String,String> name1 = new Pair<String,String>("Nitendra","Gautam");
        Pair<String ,String> name2 = new Pair<String,String>("Ram","Hari");

        System.out.println(name1.first());
        System.out.println(name1.second());
        System.out.println(name2.first());
        System.out.println(name2.second());

    }
}
