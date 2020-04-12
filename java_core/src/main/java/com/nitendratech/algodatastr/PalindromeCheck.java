package com.nitendratech.algodatastr;

/**
 * a string is a palindrome if it remains unchanged when reversed,
 */

public class PalindromeCheck {

	public static boolean checkPalindromeNew(String inputString){
		int stringLength = inputString.length();

		for (int i =0 ;i<(stringLength/2);i++){
			if(inputString.charAt(i) != inputString.charAt(stringLength-i-1)){
				return false;
			}
		}
		return true;
	}


	public static boolean checkPalinDrome1(String inputString){

		int stringLength = inputString.length();

		for (int i =0; i<(stringLength/2); i++){
			System.out.println(inputString.charAt(i));
			System.out.println(inputString.charAt(stringLength-i-1));
			if(inputString.charAt(i) != inputString.charAt(stringLength-i-1)){
				return false;
			}

		}

		return true;
	}

	public boolean checkPalindrome(String originalString) {
		boolean isPalindrome;
		String reverseWord = "";
		int stringLength = originalString.length();
		for (int i = stringLength - 1; i >= 0; i--) {

			reverseWord = reverseWord + originalString.charAt(i);

		}

		if (originalString.equals(reverseWord)) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}

		return isPalindrome;
	}

	public static void main(String args[]){

		checkPalinDrome1("ana");
	}

}
