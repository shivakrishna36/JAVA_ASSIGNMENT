import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalindromeCheck 
{
	private Palindrome palindrome;

	@Before
	public void setUp()
	{
		palindrome = new Palindrome();
	}
	
	@Test
	public void test() 
	{
		 int answer = palindrome.palindromeNumber(15451);
		 assertEquals(15451,answer);
	}
}
