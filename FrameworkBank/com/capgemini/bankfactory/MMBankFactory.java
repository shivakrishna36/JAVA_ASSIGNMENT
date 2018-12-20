package com.capgemini.bankfactory;

import com.capgemini.bankingApplication.CurrentAccount;
import com.capgemini.bankingApplication.SavingsAccount;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingsAccount getSavingsAccount(int accountNumber,String accountHolderName, float accountBalance, boolean isSalaried)
	{
		
		return null;
	}

	@Override
	public CurrentAccount getCurrentAccount(int accountNumber,String accountHolderName, float accountBalance, float creditlimit) 
	{
	
		return null;
	}

}
