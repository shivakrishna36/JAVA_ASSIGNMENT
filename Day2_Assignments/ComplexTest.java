import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ComplexTest {

	private Complex complexNumberOne = new Complex();
	private Complex complexNumberTwo = new Complex();
	private Complex complexNumberThree = new Complex();
	
	@Test
	public void testForSummationOfPositiveInputCheckingRealPart()
	{
		complexNumberOne.setValues(10,20);
		complexNumberOne.display();
		complexNumberTwo.setValues(25,25);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();
			
		assertEquals(35.0,complexNumberThree.getReal(),0.02);
	}
	
	@Test
	public void testForSummationOfPositiveInputCheckingImaginaryPart()
	{
		complexNumberOne.setValues(10,20);
		complexNumberOne.display();
		complexNumberTwo.setValues(25,25);			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		assertEquals(45.0,complexNumberThree.getImaginary(),0.02);
		
	}

}
