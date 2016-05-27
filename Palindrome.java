// Write a function to determine if a string is a palindrome

package com.epromos;

public class Palindrome {
	/**
	 * Returns True if the String is a palindrome.
	 */
	public static boolean isPalindrome(String str) throws IllegalArgumentException {
		if (null == str)
			throw new IllegalArgumentException("String can't be null");

		// can use ignoreCase if required
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static void main(String[] args) {

		System.out.println(Palindrome.isPalindrome("kayak"));
		System.out.println(Palindrome.isPalindrome("abCdcba"));
		

	}
}
