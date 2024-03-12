package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter string: ");
	        String inputString = scanner.nextLine();

	        System.out.println("Length of string " + inputString.length());
	        System.out.println("Uppercase string " + inputString.toUpperCase());
	        System.out.println("it's a palindrome? " + isPalindrome(inputString));
	        
	        scanner.close();
	    }

	    private static boolean isPalindrome(String str) {
	        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	    }
	    }
	

