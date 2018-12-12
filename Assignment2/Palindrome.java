
public class Palindrome {
	public int palindromeNumber(int number)
	{
		int remainder,sum = 0;
		int test = number;
		while(test>0)
		{
			remainder = test % 10;
			sum = (sum * 10) + remainder;
			test = test/10;
		}
		return sum;
	}
}
