package BankApplication;

public class PaymentGateway 
{
		//method to transfer the given amount from the src to target account.
		public static boolean transfer(BankAccount person, BankAccount person1, double amount) 
		{
			if(person.getAccountBalance() >= amount)
				return true;//If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is returned
			//otherwise false is returned.
			return false;
		}
}
