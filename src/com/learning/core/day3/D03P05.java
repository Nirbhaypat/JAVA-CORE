package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P05 {

	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();

	       
	        int[] arr = new int[size];

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        
	        System.out.println("Enter the value of k:");
	        int k = scanner.nextInt();

	        
	        List<List<Integer>> combinations = findCombinations(arr, k);

	        
	        System.out.println("Distinct Combinations for k=" + k + ":");
	        for (List<Integer> combination : combinations) {
	            System.out.println(combination);
	        }
	    }

	    private static List<List<Integer>> findCombinations(int[] arr, int k) {
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> current = new ArrayList<>();
	        backtrack(arr, k, 0, current, result);
	        return result;
	    }

	    private static void backtrack(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
	        if (k == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < arr.length; i++) {
	            current.add(arr[i]);
	            backtrack(arr, k - 1, i + 1, current, result);
	            current.remove(current.size() - 1);
	        }
	    }
}
