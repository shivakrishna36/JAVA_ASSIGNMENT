package BankApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest 
{
	private static int accountId;
	private int accountNumber;
	BankAccount savingsAccount,currentAccount;
	
	static
	{
		accountId = 101;
	}
	
	{
		accountNumber = accountId++;
	}
	
	@Before		// Executes before every method
	public void setup()
	{
		savingsAccount = new SavingsAccount("Shiva",10000,true);
		currentAccount = new CurrentAccount("Krishna",50000,500);
	}
	
	
	@Test	//test for deposit of money
	public void testDeposit()
	{
		 savingsAccount.deposit(1000);
		 assertEquals(11000,savingsAccount.getAccountBalance(),0);
	}
	
	@Test	// test for withdraw for savings account
	public void testWithdrawForSavingsAccount()
	{
		savingsAccount.withdraw(1000);
		assertEquals(9000,savingsAccount.getAccountBalance(),0);
	}
	
	@Test(expected = InvalidAmountException.class) //test for expected exception in savings account
	public void testWithdrawForSavingsAccountForZero() throws InvalidAmountException
	{
		savingsAccount.withdraw(20000);
		
	}
	
	@Test	//test for withdraw of current account
	public void testWithdrawForCurrentAccount()
	{
		currentAccount.withdraw(1000);
		assertEquals(49000,currentAccount.getAccountBalance(),0);
	}
	
	@Test(expected = InvalidAmountException.class)	//test for exception of current account
	public void testWithdrawForCurrentAccountNegativeInput() throws InvalidAmountException
	{
		currentAccount.withdraw(-1000);
		
	}

}
