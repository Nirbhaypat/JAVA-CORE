package com.learning.core.day9;

import java.util.Scanner;

public class D09P02 {
	    
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;
	           
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);
	          
	            merge(arr, left, mid, right);
	        }
	    }

	   
	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	       
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	       
	        System.arraycopy(arr, left, leftArray, 0, n1);
	        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

	        int i = 0, j = 0, k = left;
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
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

	        
	        mergeSort(arr, 0, size - 1);

	       
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}



