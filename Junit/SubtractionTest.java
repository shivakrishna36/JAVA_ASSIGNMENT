import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SubtractionTest 
{
	private Calculator calculator;
	
	@Before
	public void setUp()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void subtractingTwoPositiveNumbers() 
	{
		//fail("Not yet implemented");
		int answer = calculator.subtraction(20,10);
		assertEquals(10,answer);
	}
	
	@Test
	public void subtractingTwoNegativeNumbers() 
	{
		//fail("Not yet implemented");
		int answer = calculator.subtraction(-20,-10);
		assertEquals(-10,answer);
	}
	
	@Test
	public void subtractingOnePositiveNumber() 
	{
		//fail("Not yet implemented");
		int answer = calculator.subtraction(20,-10);
		assertEquals(30,answer);
	}
	
	@Test
	public void subtractingOneNegativeAndOneZero() 
	{
		//fail("Not yet implemented");
		int answer = calculator.subtraction(0,-10);
		assertEquals(10,answer);
	}
	
	@Test
	public void subtractingTwoZeros() 
	{
		//fail("Not yet implemented");
		int answer = calculator.subtraction(0,0);
		assertEquals(0,answer);
	}
}
