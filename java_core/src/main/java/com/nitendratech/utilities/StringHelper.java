package com.nitendratech.utilities;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by nitendragautam on 10/3/2017.
 */
public class StringHelper {

	/**
	 * Add padding to given number
	 * 
	 * @param inputNumber
	 */
	public static String padNumbers(Integer inputNumber) {

		return String.format("%4s", Integer.toString(inputNumber)).replace(" ", "0");
	}

	/**
	 * Encodes String which can be used for Html Url
	 * 
	 * @param inputString
	 * @return
	 */
	public static String encodeString(String inputString) {
		String encodedString = null;
		try {
			encodedString =

					URLEncoder.encode(inputString, "UTF-8").replace("+", "%20");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return encodedString;
	}

	/**
	 * Reverses String
	 **/

	public static String reverseString(String inputString) {

		// Convert the Input String into Char Array
		char[] charString = inputString.toCharArray();
		int stringLength = charString.length;

		char[] finalArray = new char[stringLength];

		for (int i = stringLength - 1; i >= 0; i--) {
			finalArray[i] = charString[i];
		}

		String finalString = String.valueOf(finalArray);

		return finalString;
	}

	
	/**
	 * Concates two Strings using String Builder 
	 */
	
	public static String concatTwoStrings(String firstString, String secondString){
		
		StringBuilder stringB = new StringBuilder();
		
		stringB.append(firstString);
		stringB.append(secondString);
		return stringB.toString();
	}
	
}
