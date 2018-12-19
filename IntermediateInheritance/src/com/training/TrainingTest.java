package com.training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

		
public class TrainingTest 
{
	private Training publicTraining,corporateTraining; //instances creation
	
	@Before	//executes before every test method
	public void setUP()
	{
		publicTraining = new PublicTraining(50,"java",1000);
		corporateTraining = new CorporateTraining(10,"Bigdata",35000);
	}
	
	@Test	// test for public training fees
	public void testForPublicTraining() 
	{
		double result = publicTraining.getOrderValue();
		assertEquals(50000,result,0);
	}
	
	@Test	//test for corporate training fees
	public void testCorporateTraining() 
	{
		double result = corporateTraining.getOrderValue();
		assertEquals(350000,result,0);
	}

}
