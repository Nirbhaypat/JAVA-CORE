package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        int num1, num2;
	        do {
	            System.out.println("Enter the first number (between 1 and 40): ");
	            num1 = scanner.nextInt();
	        } while (!isValidNumber(num1));

	        do {
	            System.out.println("Enter the second number (between 1 and 40): ");
	            num2 = scanner.nextInt();
	        } while (!isValidNumber(num2));

	       
	        int[] array = {7, 25, 5, 19, 30};

	        
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;

	        for (int i = 0; i < array.length; i++) {
	            if (num1 == array[i]) {
	                foundNum1 = true;
	            }
	            if (num2 == array[i]) {
	                foundNum2 = true;
	            }
	        }

	       
	        if (foundNum1 && foundNum2) {
	            System.out.println("Bingo");
	        } else {
	            System.out.println("Not Found");
	        }
	    }

	  
	    private static boolean isValidNumber(int number) {
	        return number >= 1 && number <= 40;
	    }
}
