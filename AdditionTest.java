import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AdditionTest 
{
	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}
	@Test
	public void addingTwoPositiveNumbers()
	{
		
		int answer = calculator.addition(10,15);
		assertEquals(25,answer);
	}
	
	@Test
	public void  addingTwoNegativeNumbers()
	{
		int answer = calculator.addition(-10, -20);
		assertEquals(-30,answer);
	}
	
	@Test
	public void addingOneNegativeNumber()
	{
		int answer = calculator.addition(-10, 20);
		assertEquals(10,answer);
	}


	@Test
	public void addingOneNegativeAndOneZero()
	{
		int answer = calculator.addition(-10, 0);
		assertEquals(-10,answer);
	}
	

	@Test
	public void addingOnePositiveNumberAndZero()
	{
		int answer = calculator.addition(0, 20);
		assertEquals(20,answer);
	}
	

	@Test
	public void addingTwoZeros()
	{
		
		int answer = calculator.addition(0,0);
		assertEquals(0,answer);
	}
}
