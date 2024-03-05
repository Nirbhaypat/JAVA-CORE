package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows ");
	        int numRows = scanner.nextInt();

	    
	        displayReversePyramidStarPattern(numRows);

	        scanner.close();
	    }

	   
	    private static void displayReversePyramidStarPattern(int numRows) {
	        for (int i = numRows; i >= 1; i--) {
	           
	            for (int space = numRows - i; space > 0; space--) {
	                System.out.print(" ");
	            }

	            
	            for (int j = 1; j <= i * 2 - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println(); 
	        }
	    }

}
