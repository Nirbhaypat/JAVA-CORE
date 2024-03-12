package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of elements: ");
        int totalNumbers = scanner.nextInt();

        int num, countP = 0, countN = 0, countZ = 0;

        System.out.println("Enter Numbers: ");

        for (int i = 0; i < totalNumbers; i++) {
            num = scanner.nextInt();
            if (num < 0)
                countN++;
            else if (num > 0)
                countP++;
            else
                countZ++;
        }

        System.out.println("\nTotal Positive Numbers: " + countP);
        System.out.println("Total Negative Numbers: " + countN);
        System.out.println("Total Zero: " + countZ);

        scanner.close();
    }
}
