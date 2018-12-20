package com.student;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest 	//this is the test class
{
	private Student student, student1;
	
	@Before		// this gets executed every time before test method
	public void setUp()
	{
		student = new Student(1236,"Shiva",21,"Java");
		student1 = new Student(1236,"Shiva@36",22,"Java");
	}
	
	@Test		//test for checking age of student
	public void testForAge() throws AgeNotWithinRangeException 
	{
		int result = student.checkAge();
		assertEquals(21,result);
	}
	
	@Test(expected = AgeNotWithinRangeException.class)	//here exception occurs due to invalid age
	public void testForAgeCreatesException() throws AgeNotWithinRangeException 
	{
		student1.checkAge();
		
	}
	
	@Test		//here the name of the student will be checked
	public void testForName() throws AgeNotWithinRangeException, NameNotValidException 
	{
		String result = student.checkName();
		assertEquals("Shiva",result);
	}
	
	@Test(expected = NameNotValidException.class)	//here the exception occurs for mismatching the name
	public void testForNameCausesException() throws AgeNotWithinRangeException, NameNotValidException 
	{
		String result = student1.checkName();
		assertEquals("Shiva",result);
	}
}
