import static org.junit.Assert.*;

import org.junit.Test;


public class NumberTest 
{

	@Test
	public void testFactorial() 
	{
		//fail("Not yet implemented");
		Factorial factorial = new Factorial();
		int answer = factorial.fact(4);
		assertEquals("The Factorial is not equal",24,answer);
	}
	
	@Test
	public void testPalindrome()
	{
		Palindrome palindrome = new Palindrome();
		int answer = palindrome.palindromeNumber(121);
		assertEquals(121,answer);
	}
	
	
}

	
