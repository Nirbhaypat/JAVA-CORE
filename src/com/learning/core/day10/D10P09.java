package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P09 {
	public class Calculator {
	 public int findMax(int[] arr) {
	        if (arr.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty");
	        }

	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
}


class CalculatorTest3 {
@Test
public void testFindMaxPositive() {
    Calculator calculator = new Calculator();
    int[] arr = {1, 2, 3, 4, 5, 6};
    int result = calculator.findMax(arr);
    assertEquals(6, result);  // Expected result: 6
}

@Test
public void testFindMaxNegative() {
    Calculator calculator = new Calculator();
    int[] arr = {-1, -2, -3, -4, -5, -6};
    int result = calculator.findMax(arr);
    assertEquals(-1, result);  // Expected result: -1
}
}
}

