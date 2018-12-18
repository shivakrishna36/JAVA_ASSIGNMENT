import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest 
{
	private Triangle triangle;
	
	@Before
	public void setUp()
	{
		triangle = new Triangle();
	}
	
	@Test
	public void testForScaleneTriangleForCorrectinput() 
	{
		int side1 = 10,side2 = 12,side3 = 8;
		boolean result = triangle.scaleneTriangle(side1,side2,side3);
		assertTrue(result);
		
	}
	
	@Test
	public void testForScaleneTriangleForIncorrectInput() 
	{
		int side1 = 10,side2 = 10,side3 = 8;
		boolean result = triangle.scaleneTriangle(side1,side2,side3);
		assertFalse(result);
		
	}
	
	@Test
	public void testForIsoscelesTriangle() 
	{
		int side1 = 10,side2 = 8,side3 = 8;
		boolean result = triangle.isoscelesTriangle(side1,side2,side3);
		assertTrue(result);
		
	}

	@Test
	public void testForIsoscelesTriangleIncorrectInput() 
	{
		int side1 = 4,side2 = 18,side3 = 8;
		boolean result = triangle.isoscelesTriangle(side1,side2,side3);
		assertFalse(result);
		
	}
	
	@Test
	public void testForEquilatralTriangle() 
	{
		int side1 = 8,side2 = 8,side3 = 8;
		boolean result = triangle.equilateralTriangle(side1,side2,side3);
		assertTrue(result);
		
	}
	
	@Test
	public void testForEquilatralTriangleIncorrectInput() 
	{
		int side1 = 8,side2 = 12,side3 = 8;
		boolean result = triangle.equilateralTriangle(side1,side2,side3);
		assertFalse(result);
		
	}
	
	@Test
	public void testForRightAngleTriangle() 
	{
		int side1 = 5,side2 = 3,side3 = 4;
		boolean result = triangle.rightAngledTriangle(side1,side2,side3);
		assertTrue(result);
		
	}
	
	@Test
	public void testForRightAngleTriangleIncorrectInput() 
	{
		int side1 = 5,side2 = 6,side3 = 4;
		boolean result = triangle.rightAngledTriangle(side1,side2,side3);
		assertFalse(result);
		
	}
}
