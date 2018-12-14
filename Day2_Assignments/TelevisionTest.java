import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest 
{
	Television television =new Television();
	
	@Before
	public void setUp()
	{
		television.setState(true);
		
		television.setCurrent_volume(11);
		
	}
	
	@Test
	public void testTurntheOfTelevision() 
	{
		television.setTurn_on(true);
		boolean result = television.isTurn_on();
		assertTrue(result);
	}
	
	@Test
	public void testStateOfTelevision() 
	{
		boolean result = television.isState();
		assertTrue(result);
	}
	
	@Test
	public void testStateOfTelevisionoff() 
	{
		television.setState(false);
		boolean result = television.isState();
		assertFalse(result);
	}
	
	@Test
	public void testCurrentVolumeOfTelevision() 
	{
		int result = television.getCurrent_volume();
		assertEquals(11,result);
	}
	
	@Test
	public void testCurrentVolumeIncreaseOfTelevision() 
	{
		television.setVolume(television.getCurrent_volume()+1);
		int result = television.getVolume();
		assertEquals(12,result);
	}
	
	@Test
	public void testCurrentVolumeDecreaseOfTelevision() 
	{
		television.setVolume(television.getCurrent_volume()-1);
		int result = television.getVolume();
		assertEquals(10,result);
	}
	
	@Test
	public void testChangeChannelOfTelevision() 
	{
		television.setChange_channel("TEN1");
	
		String result = television.getChange_channel();
		assertSame("TEN1",result);
	}
	
	@Test
	public void testCurrentChannelOfTelevision() 
	{	
		television.setCurrent_channel("ETV");
		String result = television.getCurrent_channel();
		assertSame("ETV",result);
	}
	
	@Test
	public void testTurnOfftheTelevision() 
	{
		television.setTurn_on(false);
		boolean result = television.isTurn_on();
		assertFalse(result);
	}

}
