package com.capgemini.bankingApplication;

public abstract class SavingsAccount extends BankAccount
{
	private boolean isSalaried;
	private static final float minBalance = 100;
	public SavingsAccount(int accountNumber, String accountHolderName,float accountBalance,boolean isSalaried) 
	{
		super(accountNumber, accountHolderName, accountBalance);
		this.setSalaried(isSalaried);
	}

	
	@Override
	public abstract void withdraw(float amount);


	public boolean isSalaried() {
		return isSalaried;
	}


	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	
	
}
