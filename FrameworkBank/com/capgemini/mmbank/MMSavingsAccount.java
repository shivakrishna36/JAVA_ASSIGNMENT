package com.capgemini.mmbank;

import com.capgemini.bankingApplication.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount
{
	
	private static final float minBalance = 100;
	
	public MMSavingsAccount(int accountNumber, String accountHolderName,float accountBalance, boolean isSalaried) 
	{
		super(accountNumber, accountHolderName, accountBalance, isSalaried);
		
	}
	
	@Override
	public void withdraw(float amount)
	{
		if(amount > 0 && amount <= getAccountBalance()-100)
		{
			super.deposit(-amount);
		}
	}

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
