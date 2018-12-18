import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class CountryCheck 
{
	Country country1,country2,country3,country4,country5;
	Country[] country;
	
	@Before
	public void setUp() 
	{
		country1 = new Country("INDIA",1200,500.2);
		country2 = new Country("JAPAN",1000,410.25);
		country3 = new Country("AMERICA",800,541.65);
		country4 = new Country("ENGLAND",951,524.65);
		country5 = new Country("NEWZEALAND",753,501.65);
		country = new Country[5];
		country[0] = country1;
		country[1] = country2;
		country[2] = country3;
		country[3] = country4;
		country[4] = country5;
 	}

	@Test
	public void testForCountryThatHasHighestpopulation()
	{
		Country result = country1.largestPopulation(country);
		assertEquals(country[0],result);
	}
	

	@Test
	public void testForCountryNameThatHasHighestpopulation()
	{
		Country result = country1.largestPopulation(country);
		assertEquals(1200,result.getPopulation());
	}

	@Test
	public void testForCountryThatHasLargestArea()
	{
		Country result = country1.largestAREA(country);
		assertEquals(country[2],result);
	}
	
	@Test
	public void testForAreaThatHasLargestArea()
	{
		Country result = country1.largestAREA(country);
		assertEquals(541.65,result.getArea(),0.1);
	}
	
	@Test
	public void testForCountryHasDensityPerSquareMile()
	{
		Country result = country1.largestPeoplePerSquareMile(country);
		assertEquals(country[1],result);
	}
	

	@Test
	public void testForDensityPerSquareMile()
	{
		Country result = country1.largestPeoplePerSquareMile(country);
		assertEquals(2.4375,result.getPopulation()/result.getArea(),0.1);
	}
	
}
