import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DuplicateCheck 
{
	private DuplicateValue duplicate;
	
	@Before
	public void setUp()
	{
		duplicate = new DuplicateValue();
	}
	
	@Test
	public void test() 
	{
		String result = duplicate.findDuplicate("abcabcabcabc");
		assertEquals("abc",result);
	}

}
