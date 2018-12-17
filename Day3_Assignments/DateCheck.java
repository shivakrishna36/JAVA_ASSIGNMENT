import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateCheck 
{
	private Date date;
	
	@Before
	public void setUp()
	{
		
		date = new Date(17,12,2018);
	}
	
	@Test
	public void testForDate()
	{
		assertEquals("17/12/2018",date.toString());
	}
	
	@Test
	public void testForOnlyDate()
	{
		boolean result = date.isSmaller(date);
		assertTrue(result);
	}
	
	@Test
	public void testForDifferenceDate()
	{
		int expected[] = {1,0,1};
		
		assertArrayEquals(expected,date.diff(date));
	}
}
