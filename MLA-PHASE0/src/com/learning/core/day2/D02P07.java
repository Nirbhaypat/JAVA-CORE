package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {
	public static void main (String[]args) {
		 Scanner scanner = new Scanner(System.in);


		 System.out.print("Enter the percentage ");
	        float n = scanner.nextFloat();

	        if (n > 60) {
	            System.out.println("Grade A");
	        } else if (n > 45) {
	            System.out.println("Grade B");
	        } else if (n > 35) {
	            System.out.println("Grade C");
	        } 
	        else {
	            System.out.println("fail");
	        }

	        scanner.close();
	    
		
		}
	}
