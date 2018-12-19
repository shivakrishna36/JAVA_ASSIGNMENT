package com.training;
public class PublicTraining extends Training
{
	private int participants; // instance variable
	public PublicTraining(int participants, String subject, int fees) //constructor initialization
	{
		super(subject, fees);
		this.participants = participants;
	}

	public int getParticipants() //gets number of  participants value
	{
		return participants;
	}
	public void setParticipants(int participants) //sets the participants value
	{
		this.participants = participants;
	}
	
	@Override
	public double getOrderValue()	//returns final amount
	{
		return fees * participants;
	}
}
