package com.cg.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class EmployeeDeserialize implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void display() 
	{
		try 
		{
			File file = new File("C:/ShivaKrishna/JAVA_PROGRAMS/test.txt");
			FileInputStream writes = new FileInputStream(file);
			ObjectInputStream object1 = new ObjectInputStream(writes);
			object1.read();
			System.out.println(object1.read());
		
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
