import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Multidimension 
{
	private Dimension dimension;
	
	@Before
	public void setUp()
	{
		dimension = new Dimension();
	}
	
	@Test
	public void testFindNumber() 
	{
		int numbers[][] ={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		boolean result = dimension.findNumber(1,numbers);
		assertEquals(true,result);
	}
	
	@Test
	public void testFindNumber1() 
	{
		int numbers[][] ={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		boolean result = dimension.findNumber(10,numbers);
		assertEquals(false,result);
	}

}
