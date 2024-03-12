package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {

	
	public static void main(String []args)
    {
       
       Scanner sc=new Scanner(System.in);
       //Declare and Initialize the variable
       System.out.println("Enter the number: ");
       int num=sc.nextInt();
       int i=1,fact=1;
       while(i<=num)
       {
           fact=fact*i;
           i++;
       }
       System.out.println("Factorial of the number: "+fact);  
    }   
}
