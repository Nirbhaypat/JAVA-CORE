package com.learning.core.day3;

import java.util.Scanner;

public class D03P04 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();

	       
	        int[] arr = new int[size];

	      
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int minIndex = Integer.MAX_VALUE;

	        
	        for (int i = 0; i < arr.length; i++) {
	            
	            for (int j = 0; j < i; j++) {
	                if (arr[j] == arr[i] && j < minIndex) {
	                    minIndex = j;
	                    break;  
	                }
	            }
	        }

	      
	        if (minIndex == Integer.MAX_VALUE) {
	            System.out.println("No repeating element found.");
	        } else {
	            System.out.println("Index of the first repeating element: " + minIndex);
	        }
	    }

}
