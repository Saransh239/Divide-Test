package com.example.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import com.example.java.Divide;

import org.junit.Test;

public class DivideTest {

	/**
	 * 
	 */
	@Test
	public void testDivide() {
		double expectedResult= 5.0;
		Divide divide= new Divide();
        double actualResult= divide.div(10,2);
		Assert.assertEquals(expectedResult,actualResult,5.5);
	}
	
	@Test
	public void testZero() {
		Divide divide= new Divide();
		try {
	    divide.div(4,0); 
	    fail("Expected ArithmeticException");
		}catch(ArithmeticException e) {
	}
	}		
}