package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {
	
	public static void main (String[]args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 
		        // Input: Get the number of elements (n)
		        System.out.print("Enter the number of elements (n): ");
		        int n = scanner.nextInt();

		        // Input: Get the range [L, R]
		        System.out.print("Enter the range (L, R) where 0 <= L <= R <= n-1: ");
		        int L = scanner.nextInt();
		        int R = scanner.nextInt();

		        // Validate the input range
		        if (L < 0 || R >= n || L > R) {
		            System.out.println("Invalid range input. Please ensure 0 <= L <= R <= n-1.");
		            return; // Exit the program if the input range is invalid
		        }

		        // Input: Get the elements of the array
		        System.out.println("Enter the elements of the array:");
		        int sum = 0;
		        for (int i = 0; i < n; i++) {
		            int num = scanner.nextInt();
		            if (i >= L && i <= R) { // Check if the current index is within the range [L, R]
		                sum += num; // Add the number to the sum if it's within the range
		            }
		        }

		        // Display the sum
		        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);

		        scanner.close();
		    }
		 

	
	}

