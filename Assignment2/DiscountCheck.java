import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiscountCheck
{
	private DiscountRate discountrate;
	
	@Before
	public void setUp()
	{
		discountrate = new DiscountRate();
	}
	
	@Test
	public void testDiscount()
	{
		int newItem = 123;
		double extravalue = 0.3;
		double newItemPrice = discountrate.calculateDiscount(newItem);
		assertEquals(79.68,newItemPrice,extravalue);
	}
}
