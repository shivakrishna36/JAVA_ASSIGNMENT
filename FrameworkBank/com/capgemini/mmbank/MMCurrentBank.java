package com.capgemini.mmbank;

import com.capgemini.bankingApplication.CurrentAccount;

public class MMCurrentBank extends CurrentAccount
{

	public MMCurrentBank(int accountNumber, String accountHolderName, float accountBalance, float creditlimit) 
	{
		super(accountNumber, accountHolderName, accountBalance, creditlimit);
	}
	
	@Override
	public void withdraw(float amount)
	{
		if(amount > 0 && amount <= getAccountBalance() + getCreditlimit())
		{
			super.deposit(-amount);
		}
	}

	@Override
	public String toString() {
		return "CurrentAccount [getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountBalance()="
				+ getAccountBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
