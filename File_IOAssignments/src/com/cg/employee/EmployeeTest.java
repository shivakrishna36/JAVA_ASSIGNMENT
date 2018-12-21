package com.cg.employee;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest 
{
	private Employee employee = new Employee(1236,"shiva",1000);
	
	
	@Test
	public void test() 
	{
		assertEquals(1236,employee.getId());
	}

}
