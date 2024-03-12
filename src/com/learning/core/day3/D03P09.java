package com.learning.core.day3;

import java.util.Scanner;

public class D03P09 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter the number of strings:");
	        int n = scanner.nextInt();

	       
	        String[] strings = new String[n];

	      
	        System.out.println("Enter " + n + " strings:");
	        for (int i = 0; i < n; i++) {
	            strings[i] = scanner.next();
	        }

	       
	        boolean result = canFormCircle(strings);

	       
	        if (result) {
	            System.out.println("Yes, the given strings can be chained to form a circle.");
	        } else {
	            System.out.println("No, the given strings cannot be chained to form a circle.");
	        }
	    }

	    private static boolean canFormCircle(String[] strings) {
	        return canFormCircleHelper(strings, strings[0], 1, new boolean[strings.length]);
	    }

	    private static boolean canFormCircleHelper(String[] strings, String current, int count, boolean[] visited) {
	        if (count == strings.length) {
	         
	            return current.charAt(current.length() - 1) == strings[0].charAt(0);
	        }

	        for (int i = 1; i < strings.length; i++) {
	            if (!visited[i] && current.charAt(current.length() - 1) == strings[i].charAt(0)) {
	                visited[i] = true;
	                if (canFormCircleHelper(strings, strings[i], count + 1, visited)) {
	                    return true;
	                }
	                visited[i] = false;
	            }
	        }

	        return false;
	    }
	
}
