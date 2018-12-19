package com.training;

public class CorporateTraining extends Training
{
	private int days;
	
	public CorporateTraining(int days, String subject, int fees) //constructor initializes
	{
		super(subject, fees);
		this.days =days;
	}
	
	@Override	//overriding method
	public double getOrderValue()
	{
		return fees * days;		//returns total amount
	}
		
}

