package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 {

	
	 private static void Substrings(String inputString)
	    {   
	        System.out.println("All possible substrings of "+inputString+" are : ");
	         
	        for (int i = 0; i < inputString.length(); i++) 
	        {
	            for (int j = i+1; j <= inputString.length(); j++) 
	            {
	                System.out.println(inputString.substring(i, j));
	            }
	        }
	    }
	     
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter Input String : ");
	         
	        String inputString = sc.next();
	         
	        Substrings(inputString);
	         
	        sc.close();
	    }
}
