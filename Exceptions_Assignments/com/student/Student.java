package com.student;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student //student class
{
	// instance variables are declared
	private int rollNumber;		
	private String name;		
	private int age;
	private String course;
	
	// constructor that initializes the values 
	public Student(int rollNumber,String name,int age,String course)
	{
		this.rollNumber = rollNumber;
		this.age = age;
		this.course = course;
		this.name = name;
	}
	
	public int getRollNumber()		//gets the rollNumber of student
	{
		return rollNumber;
	}

	public String getName()			//gets the name of student
	{
		return name;
	}

	public int getAge() 			// gets the age of student
	{
		return age;
	}

	public String getCourse()		//gets the course of student
	{
		return course;
	}

	//this method will check the age of student if it is invalid throws an exception
	public int checkAge() throws AgeNotWithinRangeException 
	{
		if(age >= 15 && age <= 21)
		{
			return age;
		}
		else
		{
			throw new AgeNotWithinRangeException();
		}
		
	}

	//this method will check the name of student if it is invalid throws an exception
	public String checkName() throws NameNotValidException
	{
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(name);
		if(!matcher.matches())
		{
			throw new NameNotValidException();
		}
		return name;
	}
	
	
}
