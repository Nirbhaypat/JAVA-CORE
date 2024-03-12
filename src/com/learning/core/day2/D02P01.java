package com.learning.core.day2;

import java.util.Scanner;

public class D02P01 {

	public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number between 1 and 12: ");


        int monthNumber = scanner.nextInt();

        scanner.close();

      
        if (monthNumber >= 1 && monthNumber <= 12) {
           
            String monthName = getMonthName(monthNumber);

    
            System.out.println("The month corresponding to the number " + monthNumber + " is: " + monthName);
        } else {
           
            System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }
    }
    private static String getMonthName(int monthNumber) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

              return monthNames[monthNumber - 1];
    }
}
