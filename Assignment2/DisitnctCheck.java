import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DisitnctCheck 
{
	private Distinct distinct;
	
	@Before
	public void setUp()
	{
		distinct = new Distinct();
	}
	@Test
	public void test() {
		int answer =  distinct.misssing(1, 2, 0);
		assertEquals(3,answer);
	}

}
