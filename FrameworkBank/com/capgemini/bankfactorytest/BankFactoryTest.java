package com.capgemini.bankfactorytest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankfactory.BankFactory;
import com.capgemini.bankingApplication.SavingsAccount;

public class BankFactoryTest 
{
	private BankFactory bankFactory;
	
	@Before
	public void setUP()
	{
		bankFactory = new BankFactory();
	}
	
	@Test
	public void test() 
	{
		bankFactory.getSavingsAccount(1236,"Shiva",5000,true);
		bankFactory.getCurrentAccount(132413, "Krishna", 5500, 500);
		
	}

}
