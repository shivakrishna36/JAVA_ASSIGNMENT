import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistinctIndices 
{
	private DistinctArray values;
	
	@Before
	public void setUp()
	{
		values = new DistinctArray();
	}
	@Test
	public void testIndices() 
	{
		int numbers[] = {4,2,5,9,8,7,1,3,5};
		boolean answer = values.distinctCheck(numbers, 4);
		assertTrue(answer);
	}

}
