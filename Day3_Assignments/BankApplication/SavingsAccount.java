package BankApplication;

public class SavingsAccount extends BankAccount	//SavingsAccount that inherits BankAccount
{
	private boolean salary;

	public SavingsAccount(String accountHolderName, double accountBalance,boolean salary) //initializes the values
	{
		super(accountHolderName, accountBalance);
		this.salary = salary;
	}

	@Override		//overrides the withdraw method
	public void withdraw(int amount) throws InvalidAmountException, InvalidAccountSelection
	{
		if(salary && amount >0 && amount < getAccountBalance())
		{
			super.deposit(-amount);
		}
		else if(amount <= 0 || amount > getAccountBalance())
		{
			throw new InvalidAmountException();
			
		}
		else
		{
			throw new InvalidAccountSelection();
		}
	}
	

}
