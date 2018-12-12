import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PalindromeCheck 
{
	private int expected;
	private int number;
	private Palindrome1 palindrome;
	
	@Before
	public void setUp()
	{
		palindrome = new Palindrome1();
	}
	
	public PalindromeCheck(int expected,int number) 
	{
		this.expected = expected;
		this.number = number;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		 return Arrays.asList(new Object[][] {
				{111,111},{121,121},{150,154},{123,153},{145,562},
				{525,525},{342,345},{534,345},{325,123},{123,123}
				
		});
	}
	
	@Test
	public void testPalindrome()
	{
		assertEquals(expected,palindrome.palindromeNumber(number));
		assertEquals(expected,palindrome.palindromeNumber(number));
	}

}
