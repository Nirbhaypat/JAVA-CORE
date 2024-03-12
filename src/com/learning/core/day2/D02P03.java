package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        double num1 = readNumber("Enter the first number: ", scanner);
	        double num2 = readNumber("Enter the second number: ", scanner);
	        char operator = readOperator(scanner);

	        scanner.close();

	        double result = calculateResult(num1, num2, operator);
	        displayResult(result);
	    }


	    private static double readNumber(String message, Scanner scanner) {
	        System.out.print(message);
	        return scanner.nextDouble();
	    }

	    
	    private static char readOperator(Scanner scanner) {
	        System.out.print("Enter the mathematical operator (+, -, *, /): ");
	        return scanner.next().charAt(0);
	    }

	  
	    private static double calculateResult(double num1, double num2, char operator) {
	        switch (operator) {
	            case '+':
	                return num1 + num2;
	            case '-':
	                return num1 - num2;
	            case '*':
	                return num1 * num2;
	            case '/':
	                return (num2 != 0) ? num1 / num2 : Double.NaN;
	            default:
	                return Double.NaN;
	        }
	    }

	   
	    private static void displayResult(double result) {
	        if (Double.isNaN(result)) {
	            System.out.println("Error: Invalid operator. Please enter +, -, *, or /.");
	        } else {
	            System.out.println("Result: " + result);
	        }
	    }
}
