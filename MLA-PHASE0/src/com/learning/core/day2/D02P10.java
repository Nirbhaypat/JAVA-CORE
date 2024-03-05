package com.learning.core.day2;

public class D02P10 {

	public static void main(String[] args) {

	    int num = 1234, reversed = 0;
	    
	    System.out.println("Org Number: " + num);

	   
	    while(num != 0) {
	   
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	     
	      num /= 10;
	    }

	    System.out.println("Reversed " + reversed);
	  }
	
}
