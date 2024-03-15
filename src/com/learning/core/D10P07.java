package com.learning.core.day10;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P07 {
	
	
	public class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int sub(int a, int b) {
	        return a - b;
	    }
	}




	public class CalculatorTest {

	    @Test
	    public void testAdd() {
	        Calculator calculator = new Calculator();
	        int result = calculator.add(5, 3);
	        assertEquals(8, result);  // Expected result: 5 + 3 = 8
	    }

	    @Test
	    public void testSub() {
	        Calculator calculator = new Calculator();
	        int result = calculator.sub(10, 5);
	        assertEquals(5, result);  // Expected result: 10 - 5 = 5
	    }
	}

	
}
