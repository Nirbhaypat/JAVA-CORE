package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number ");
	        int n = scanner.nextInt();

	        int firstTerm = 0, secondTerm = 1;
	        System.out.println("Fibonacci Series" + n + " terms:");

	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + ", ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }

	        scanner.close();
	    }
}
