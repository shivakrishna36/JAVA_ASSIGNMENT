package com.cg.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee 
{
	private int id;
	public int getId()
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public int getSalary()
	{
		return salary;
	}

	private String name;
	private int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display(Employee filename) throws IOException
	{
		File file = new File("C:/ShivaKrishna/JAVA_PROGRAMS/test.txt");
		
		try 
		{
			if(file.exists())
			{
				System.out.println("Already exists");
			}
			else
			{
				file.createNewFile();
			}		
			FileOutputStream writes = new FileOutputStream(file);
			ObjectOutputStream object = new ObjectOutputStream(writes);
			object.writeObject(filename);
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try 
		{
		Employee name;
		FileInputStream writes = new FileInputStream(file);
		ObjectInputStream object1 = new ObjectInputStream(writes);
		
			name = (Employee)object1.readObject();
			System.out.print(this.id);
			System.out.print(this.name);
			System.out.print(this.salary);
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	} 
		
		
}

