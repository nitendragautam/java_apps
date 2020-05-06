package com.nitendratech.java8;




import java.util.ArrayList;


public class LambdaExample {



    private static void multipleParamLambda(){


    }

    private static void singleArgumentsLambda(){


        // Lets Create an Array List

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);


        //Print all elements using Lambda expression

        arrList.forEach(item-> System.out.println(item));


        //Print some Elements using Lambda expression

        arrList.forEach( num-> {
            if (num %2 == 0) System.out.println("Even number: "+num);

        });

    }
    public static void main(String args[]){


        singleArgumentsLambda();




    }

}
