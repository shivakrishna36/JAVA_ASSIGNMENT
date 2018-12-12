import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemovingSpaces 
{
	private Removingspace removespace;
	
	@Before
	public void setUP()
	{
		removespace = new Removingspace();
	}

	@Test
	public void testRemoveSpace() 
	{
		String name = "This   is   a name    spaces   here";
		String result = removespace.removeSpaces(name);
		assertEquals("This is a name spaces here",result);
	}
	
	@Test
	public void testToDelete()
	{
		String name ="a";
		String result = removespace.removeSpaces(name);
		assertEquals("This is name spaces here",result);
	}
}
