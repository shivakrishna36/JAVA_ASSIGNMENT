package BankApplication;

public abstract class BankAccount //BankAccount is a abstract class because it has one abstract method
{
	// instances variables
	private String accountholderName;
	private double accountBalance;
	private static int accountId;
	private int accountNumber;
	
	
	public BankAccount(String accountHolderName,double accountBalance)	//constructor initializes the values
	{
		this.accountBalance =accountBalance;
		this.accountholderName =accountHolderName;
	}

	public int getAccountNumber() 	//gets account number
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) 	// sets account number
	{
		this.accountNumber = accountNumber;
	}

	public String getAccountholderName() 	// gets account holder name
	{
		return accountholderName;
	}

	public void setAccountholderName(String accountholderName) // sets Account holder name
	{
		this.accountholderName = accountholderName;
	}

	public double getAccountBalance() // gets account balance
	{
		return accountBalance;
	}

	public int getAccountId() // gets accountId
	{
		return accountId;
	}

	public void deposit(int amount) //Deposits the amount
	{
		accountBalance+= amount;
	}

	public abstract void withdraw(int amount) throws InvalidAccountSelection; //abstract method
}
