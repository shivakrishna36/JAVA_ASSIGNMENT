package com.capgemini.bankfactory;

import com.capgemini.bankingApplication.CurrentAccount;
import com.capgemini.bankingApplication.SavingsAccount;

public abstract class BankFactory 
{
	
	public abstract SavingsAccount getSavingsAccount(int accountNumber, String accountHolderName,float accountBalance,boolean isSalaried);
	
	
	public abstract CurrentAccount getCurrentAccount(int accountNumber, String accountHolderName,float accountBalance,float creditlimit);
	
	
}
