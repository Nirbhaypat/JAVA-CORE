package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P08 {
	public class Calculator {
	 public int mul(int a, int b) {
	        return a * b;
	    }

	    public int div(int a, int b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero");
	        }
	        return a / b;
	    }
}


class CalculatorTest2 {
@Test
public void testMul() {
    Calculator calculator = new Calculator();
    int result = calculator.mul(4, 5);
    assertEquals(20, result);  // Expected result: 4 * 5 = 20
}

@Test
public void testDiv() {
    Calculator calculator = new Calculator();
    int result = calculator.div(10, 2);
    assertEquals(5, result);  // Expected result: 10 / 2 = 5
	}
}
}
