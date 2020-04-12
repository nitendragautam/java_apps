package com.nitendratech.utilities;



public class NumberUtilities {
	
	/**
	 * 
	 * Factorial of Number
	 */
	static int factorial(int number){

		if(number ==1 ) return 1;
		else
		 return (number * factorial(number-1));
		 }
	
	
	/** Use of printf Function

	 */

    public static void main(String args[]){


        final double pi = 3.14159263;

        //Display pi up to 4 decimal places
        System.out.printf("pi = %.4f",pi);
        System.out.print("\n");  //New Line
        //Format output  with some space
        System.out.printf("pi = %10.5f",pi);
    }
}
