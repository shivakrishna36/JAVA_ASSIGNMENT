import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemovingSpaces 
{
	private Removingspace removespace;
	private String name = "This   is   a name    spaces   here";
	
	@Before
	public void setUP()
	{
		removespace = new Removingspace();
	}

	@Test
	public void testRemoveSpace() 
	{
		
		String result = removespace.removeSpaces(name);
		assertEquals("This is a name spaces here",result);
	}
	
	@Test
	public void testToDelete()
	{
		String remove ="a";
		int position = 2;
		String result = removespace.removeWord(name,remove,position);
		assertEquals("This is name spaces here",result);
	}
}
