package com.learning.core.day2;

import java.util.Scanner;

public class D02P05 {
	public static void main  (String []args) {
		Scanner sc = new Scanner (System.in);
		int n = 178;
		if(n % 5 ==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no ");
		}
		sc.close();
	}

}