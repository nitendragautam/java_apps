package com.nitendratech.algodatastr;


public class ArraySort {

	
	
	
    public static void main(String args[]){

        int[] numbersArray = new int[]{6,8,88,965,89,16};
        int tmp = 0;

        for( int i =0; i< numbersArray.length;i++){
             for(int j= i+1 ;j <numbersArray.length;j++){

                 if(numbersArray[i] > numbersArray[j]){
                     tmp=numbersArray[i];
                     numbersArray[i] =numbersArray[j];
                     numbersArray[j]=tmp;
                 }
             }
        }

        for(int i = 0;i<numbersArray.length ;i++){
            System.out.println(numbersArray[i]);
        }

    }
}
