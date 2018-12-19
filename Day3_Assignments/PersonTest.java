import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest 
{
	Person person,person1;
	
	@Before
	public void setUp()
	{
		person = new Person("Shiva",8,3,1997);
		person1 = new Person("Krishna",3,5,1996);
	}
	
	@Test
	public void testForDisplayValuesForFirstPerson() 
	{
		
		//First person details
		Person result = person.display(person);
		assertEquals(person,result);
	}
	
	@Test
	public void testForDisplayValuesForSecondPerson() 
	{
		//First person details
		Person result = person1.display(person1);
		assertEquals(person1,result);
	}
	
	@Test
	public void testForDifferenceOfAge() 
	{
		Person values = new Person("jhon",7,2,12);
		//First person details
		Person result = person.olderOne(person);
		assertEquals(values.getMonth(),result.getMonth());
	}

}
