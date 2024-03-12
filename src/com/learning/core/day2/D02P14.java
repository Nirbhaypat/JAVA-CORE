package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("base number");
	        double base = scanner.nextDouble();

	        System.out.print("exponent");
	        int exponent = scanner.nextInt();

	       
	        double result1 = calculatePower(base, exponent);
	        double result2 = calculatePower(exponent, (int) base);

	        System.out.println(base + " power " + exponent + " is: " + result1);
	        System.out.println(exponent + " power " + base + " is: " + result2);

	        scanner.close();
	    }

	  
	    private static double calculatePower(double base, int exponent) {
	        if (exponent < 0) {
	            throw new IllegalArgumentException("Exponent is non-negative integer.");
	        }
	        double result = 1.0;
	        for (int i = 0; i < exponent; i++) {
	            result *= base;
	        }
	        return result;
	    }
	    
	   /* public static void main(String[] args) {

	        int base = 3, exponent = 4;

	        long result = 1;

	        while (exponent != 0) {
	          result *= base;
	          --exponent;
	        }

	        System.out.println("Answer = " + result);
	      }*/
	    
}
