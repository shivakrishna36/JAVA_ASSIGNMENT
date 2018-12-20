package com.factorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest 	// test for factorial class
{
	Factorial factorial;
	
	@Before		//this executes before the every test method
	public void setUP()
	{
		factorial = new Factorial();
	}
	
	@Test		//test to check the factorial of given number
	public void testForFactorial() throws InvalidInputException, FactorialException 
	{
		int result = factorial.factorial(4);
		assertEquals(24,result);
	}
	
	@Test(expected = InvalidInputException.class)	//test to check the invalidInputException occurs
	public void testForException() throws InvalidInputException, FactorialException
	{
		InvalidInputException exception = new InvalidInputException();
		factorial.factorial(1);
		assertEquals("InvalidInput",exception.getMessage());
		
	}
	
	
	@Test(expected = FactorialException.class)		//test to check the FactorialExceptio occurs
	public void testForInvalidFactorialException() throws InvalidInputException, FactorialException
	{
		factorial.factorial(18);
	}

}
