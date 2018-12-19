package com.training;
public abstract class Training 
{
	private int id;
	private String subject;
	protected int fees;
	
	public Training(String subject,int fees)		//constructor initialization 
	{
		this.subject = subject;
		this.fees = fees;
	}


	public Training() //constructor with no argument
	{
		// TODO Auto-generated constructor stub
	}


	public int getFees() //gets the fees value
	{
		return fees;
	}


	public String getSubject() // gets the subject name
	{
		return subject;
	}

	public void setId(int id) // sets the id value
	{
		this.id = id;
	}
	
	abstract double getOrderValue();
	
	
}
