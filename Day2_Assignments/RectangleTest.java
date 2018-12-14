import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// RectangleTest class
public class RectangleTest 
{
	private Rectangle rectangle;
	private Rectangle rectangle1;
	
	@Before		//executes before every test method
	public void setUp()
	{
		rectangle = new Rectangle(4,5);
		rectangle1 = new Rectangle(8,5);
	}
	
	@Test		//testing for Area of rectangle
	public void testAreaOfRectangle() {
		double result = rectangle.getAreaOfRectangle();
		assertEquals(20,result,0.1);
	}
	

	@Test		//testing for Area of rectangle
	public void testAreaOfRectangle1() {
		double result = rectangle1.getAreaOfRectangle1();
		assertEquals(40,result,0.1);
	}

	@Test		//testing for perimeter of rectangle
	public void testPerimeterOfRectangle() {
		double result = rectangle.getPerimeterOfRectangle();
		assertEquals(18,result,0.1);
	}

	@Test		//testing for diagonal of rectangle
	public void testDiagonalOfRectangle() {
		double result = rectangle.getDiagonalOfRectangle();
		assertEquals(6.4,result,0.1);
	}

	
	@Test		//testing two areas of rectangles
	public void testcompareAreasOfRectangle()
	{
		boolean result = rectangle.compareAreasOfRectangle();
		assertTrue(result);
	}
	
	@Test		//testing two perimeters of rectangle
	public void testcomparePerimetersOfRectangle()
	{
		boolean result = rectangle.comparePerimetersOfRectangle();
		assertTrue(result);
	}
}
