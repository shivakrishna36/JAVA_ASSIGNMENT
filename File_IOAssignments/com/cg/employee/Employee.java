package com.cg.employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public  void display(Employee filename) throws IOException
	{
		File file = new File("C:/ShivaKrishna/JAVA_PROGRAMS/test.txt");
		
		try 
		{	
			FileOutputStream writes = new FileOutputStream(file);
			ObjectOutputStream object = new ObjectOutputStream(writes);
			object.writeObject(filename);
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	} 
		
		
}

