public class Country 
{
	private String country;
	long population;
	private double area;
	int count;
	
	public Country(String country,long population,double area)
	{
		this.country = country;
		this.population = population;
		this.area = area;
	}
	 public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public Country largestPopulation(Country[] one)
	 {
		Country largestPopulation = one[0];
		for(count=0;count<country.length();count++)
		{
			if(one[count].population>largestPopulation.population)
			{
				largestPopulation = one[count];
			}
		}
		return largestPopulation;
	 }
	
	public Country largestAREA(Country[] one)
	 {
		Country largestArea = one[0];
		for(count=0;count<country.length();count++)
		{
			if(one[count].area>largestArea.area)
			{
				largestArea = one[count];
				
			}
		}
		return largestArea;
	 }
	
	public Country largestPeoplePerSquareMile(Country[] one)
	 {
		Country largestPeoplePerMile = one[0];
		for(count=0;count<country.length();count++)
		{
			if(one[count].population/one[count].area>largestPeoplePerMile.population/largestPeoplePerMile.area)
			{
				largestPeoplePerMile = one[count];
			}
		}
		return largestPeoplePerMile;
	 }
	
}
