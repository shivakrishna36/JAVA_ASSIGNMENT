package com.capgemini.bankingApplication;

public abstract class CurrentAccount extends BankAccount
{
	private  static final float creditlimit = 500;
	public CurrentAccount(int accountNumber, String accountHolderName,float accountBalance,float creditlimit)
	{
		super(accountNumber, accountHolderName, accountBalance);
		
	}

	@Override
	public abstract void withdraw(float amount);

	public static float getCreditlimit() {
		return creditlimit;
	}

	
	
	
	
}
