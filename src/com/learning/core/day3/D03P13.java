package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String output = replaceSpaces(input);

	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);

	        scanner.close();
	    }

	    private static String replaceSpaces(String input) {
	        StringBuilder result = new StringBuilder();

	        for (char c : input.toCharArray()) {
	            if (c == ' ') {
	                result.append("%20");
	            } else {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }
}
