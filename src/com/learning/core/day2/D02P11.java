package com.learning.core.day2;

import java.util.Scanner;

public class D02P11 {

	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of rows for the right-angled triangle: ");
        int numRows = scanner.nextInt();

      
        displayRightAngleTriangle(numRows);

        scanner.close();
    }

   
    private static void displayRightAngleTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
	
}
