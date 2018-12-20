package com.factorial;

public class Factorial 	//Factorial class 
{
	private int result =2;		// instance variable initialized
	
	// this method defines factorial of given number
	int factorial(int number) throws InvalidInputException, FactorialException
	{
		if(number > 2 && number <= 16)		// if condition satisfies it will executes the code and returns value
		{
			while(number>2)
			{
				result = result * number;
				number--;
			}
			return result;
		}
		else if(number>16)				//if this condition satisfies it will throws an Factorial exception
		{
			throw new FactorialException();
		}
		else							// this throws an invalid input exception
		{
			throw new InvalidInputException();
		}
	}
}
