package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P06 {

	 public static int findMinElement(Stack<Integer> stack) {
	        if (stack.isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }

	        int minValue = stack.pop(); // Assume the top element is the minimum
	        while (!stack.isEmpty()) {
	            int current = stack.pop();
	            minValue = Math.min(minValue, current);
	        }

	        return minValue;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter elements for the stack ");
	        String userInput = scanner.nextLine();

	        Stack<Integer> inputStack = new Stack<>();
	        for (String number : userInput.split("\\s+")) {
	            if (!number.isEmpty()) {
	                inputStack.push(Integer.parseInt(number));
	            }
	        }

	        try {
	            int minElement = findMinElement(inputStack);
	            System.out.println("Minimum Element in the Stack: " + minElement);
	        } catch (IllegalStateException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }
}
