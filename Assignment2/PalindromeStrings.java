import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PalindromeStrings
{
	private String expected;
	private String name;
	private Palindrome1 palindrome;
	
	@Before
	public void setUp()
	{
		palindrome = new Palindrome1();
	}
	
	public PalindromeStrings(String expected,String name) 
	{
		this.expected = expected;
		this.name = name;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		 return Arrays.asList(new Object[][] {
				 {"MAM","MAM"},{"HELLO","HAI"},{"AMMA","AMMA"},
				 {"MADAM","MADAM"},{"NAVIN","NAVIN"},{"JHON","JHON"},
				 {"SUPER","SUPER"},{"NITIN","NITIN"},{"RADAR","RADAR"},
				 {"REDIVIDER","REDIVIDER"}
		});
	}
	
	@Test
	public void testPalindrome()
	{
		assertEquals(expected,palindrome.palindromeNames(name));
		
	}

}
