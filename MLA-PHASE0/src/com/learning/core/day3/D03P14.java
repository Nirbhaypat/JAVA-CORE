package com.learning.core.day3;

public class D03P14 {
	  public static void main(String[] args) {
	        int[] arr1 = {1, 3, 4, 5, 7};
	        int[] arr2 = {2, 3, 5, 6};

	        findUnionAndIntersection(arr1, arr2);
	    }

	    private static void findUnionAndIntersection(int[] arr1, int[] arr2) {
	        int m = arr1.length;
	        int n = arr2.length;

	        int i = 0, j = 0;

	        System.out.print("Union: ");
	        while (i < m && j < n) {
	            if (arr1[i] < arr2[j]) {
	                System.out.print(arr1[i] + " ");
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                System.out.print(arr2[j] + " ");
	                j++;
	            } else {
	                System.out.print(arr1[i] + " ");
	                i++;
	                j++;
	            }
	        }

	        while (i < m) {
	            System.out.print(arr1[i] + " ");
	            i++;
	        }

	        while (j < n) {
	            System.out.print(arr2[j] + " ");
	            j++;
	        }

	        i = 0;
	        j = 0;

	        System.out.println();
	        System.out.print("Intersection: ");
	        while (i < m && j < n) {
	            if (arr1[i] < arr2[j]) {
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                j++;
	            } else {
	                System.out.print(arr1[i] + " ");
	                i++;
	                j++;
	            }
	        }
	    }

}
