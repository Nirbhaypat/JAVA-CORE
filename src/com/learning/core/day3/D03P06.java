package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	     
	        System.out.println("Enter the value of 'n':");
	        int n = scanner.nextInt();

	       
	        int actualCount = countLastNVowels(inputString, n);

	        if (actualCount >= 0) {
	            System.out.println("Count of last " + n + " vowels: " + actualCount);
	            if (actualCount < n) {
	                System.out.println("Mismatch in Vowel Count");
	            }
	        } else {
	            System.out.println("Invalid input string");
	        }
	    }

	    private static int countLastNVowels(String inputString, int n) {
	        if (inputString == null || n < 0) {
	            return -1; // Invalid input
	        }

	        int count = 0;
	        int stringLength = inputString.length();

	        for (int i = stringLength - 1; i >= 0 && n > 0; i--) {
	            char currentChar = Character.toLowerCase(inputString.charAt(i));
	            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
	                count++;
	                n--;
	            }
	        }

	        return count;
	    }

}
