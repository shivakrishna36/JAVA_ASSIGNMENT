import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FindingName
{
	private Findingnames findingname;
	private String names[] ={"Dave", "Ann", "George", "Sam", 
			"Ted", "Gag", "Saj", "Agati", "Mary", 
			"Sam", "Sam", "Dev", "Kity", "Meery", 
			"Smith", "Johnson", "Bill", "Williams", 
			"Jones", "Brown", "Davis", "Miller", 
			"Wilson", "Sam", "Taylor", 
			"Anderson","Thomas", "Jackson"};

	@Before
	public void setUp()
	{
		findingname = new Findingnames();
	}
	
	@Test
	public void testFindingName() 
		{
			
			boolean result = findingname.findName("Brown",names);
			assertEquals(true,result);
		}
	
	@Test
	public void findOccurence()
	{
		int result1 = findingname.occurence("Brown",names);
		assertEquals(1,result1);
	}
	
	@Test
	public void testFindingWhenNameNotAvailable() 
		{
			String names[] ={"Dave", "Ann", "George", "Sam", 
					"Ted", "Gag", "Saj", "Agati", "Mary", 
					"Sam", "Sam", "Dev", "Kity", "Meery", 
					"Smith", "Johnson", "Bill", "Williams", 
					"Jones", "Brown", "Davis", "Miller", 
					"Wilson", "Sam", "Taylor", 
					"Anderson","Thomas", "Jackson"};
			boolean result = findingname.findName("Jhon",names);
			assertEquals(false,result);
			
		}
	
	@Test
	public void findOccurence1()
	{
		int result1 = findingname.occurence("George",names);
		assertEquals(1,result1);
	}
	
	@Test
	public void testFindingNameOccurenceTwo() 
		{
			String names[] ={"Dave", "Ann", "George", "Sam", 
					"Ted", "Gag", "Saj", "Agati", "Mary", 
					"Sam", "Sam", "Dev", "Kity", "Meery", 
					"Smith", "Johnson", "Bill", "Williams", 
					"Jones", "Brown", "Davis", "Miller", 
					"Wilson", "Sam", "Taylor", 
					"Anderson","Thomas", "Jackson"};
			boolean result = findingname.findName("Sam",names);
			assertEquals(true,result);
			
		}
	
		@Test
		public void testOccurence2()
		{
			int result1 = findingname.occurence("Sam",names);
			assertEquals(4,result1);
		}
}
