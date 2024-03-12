package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {
	public static void main (String[]args) {
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.println("Enter three numbers: ");
	     
	        int max = Math.max(scanner.nextInt(), Math.max(scanner.nextInt(), scanner.nextInt()));
	        System.out.println("Maximum number: " + max);
	        
	        scanner.close();
	}
	  

}
