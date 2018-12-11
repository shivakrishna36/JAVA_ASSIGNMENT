import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MultiplicationTest 
{
	private Calculator calculator;
	@Before
	public void setup(){
		calculator = new Calculator();
	}
	
	@Test
	public void multiplingTwoPositiveNumbers()
	{
		
		int answer = calculator.multiplication(10,15);
		assertEquals(150,answer);
	}
	
	@Test
	public void  multiplyingTwoNegativeNumbers()
	{
		int answer = calculator.multiplication(-10, -20);
		assertEquals(200,answer);
	}
	
	@Test
	public void multiplyingOneNegativeNumber()
	{
		int answer = calculator.multiplication(-10, 20);
		assertEquals(-200,answer);
	}


	@Test
	public void multiplyingOneNegativeAndOneZero()
	{
		int answer = calculator.multiplication(-10, 0);
		assertEquals(0,answer);
	}
	

	@Test
	public void multiplyingOnePositiveNumberAndZero()
	{
		int answer = calculator.multiplication(0, 20);
		assertEquals(0,answer);
	}
	

	@Test
	public void multiplyingTwoZeros()
	{
		
		int answer = calculator.multiplication(0,0);
		assertEquals(0,answer);
	}
}
