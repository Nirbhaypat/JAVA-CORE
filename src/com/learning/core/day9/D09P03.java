package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {

	
	    public static boolean linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return true; 
	            }
	        }
	        return false; 
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	      
	        System.out.print("Enter the elements of the array separated by spaces: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int key = scanner.nextInt();

	        boolean found = linearSearch(arr, key);
	      
	        if (found) {
	            System.out.println("Element is Present");
	        } else {
	            System.out.println("Element is not Present");
	        }

	        scanner.close();
	    }
	}
