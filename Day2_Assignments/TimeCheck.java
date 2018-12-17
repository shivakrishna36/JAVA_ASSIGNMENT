import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class TimeCheck 
{
	private Time time1;
	private Time time2;
	private Time time3;
	
	@Before
	public void setUp()
	{
		time1 = new Time();
		time2 = new Time();
		time3 = new Time();
	}
	
	@Test
	public void testTimeForHours() 
	{
		time1.setTime(10,50);
		time1.showTime();
		time2.setTime(9, 50);
		time2.showTime();
		time3 = time3.sum(time1,time2);
		time3.showTime();
		assertEquals(20,time3.getHours());
	}

	@Test
	public void testTimeForMinutes() 
	{
		time1.setTime(9, 50);
		time1.showTime();
		time2.setTime(10, 50);
		time2.showTime();
		time3 = time3.sum(time1,time2);
		time3.showTime();
		assertEquals(40,time3.getMinutes());
	}
}
