package BankApplication;

public class CurrentAccount extends BankAccount		//currentAccount class that extends BankAccount
{
	private int odLimit;
	public CurrentAccount(String accountHolderName, double accountBalance,int odLimit)	//initializes the values
	{
		super(accountHolderName, accountBalance);
		this.odLimit = odLimit;
	}
	@Override		//overrides withdraw method
	public void withdraw(int amount) throws InvalidAmountException
	{
		if(amount > 0 && amount <= getAccountBalance()+odLimit)
		{
		super.deposit(-amount);
		}
		else if(amount <= 0)
		{
			throw new InvalidAmountException();
		}
	}
	
	
}
