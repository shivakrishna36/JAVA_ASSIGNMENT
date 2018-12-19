import java.time.LocalDate;

public class Person 
{
	private String name; 
	private Date dob; 
	private int day,month,year;
	private int days,months,years;
	private int dayDifference,monthDifference,yearDifference;
	public Person(String name, int day, int month, int year) 
	{
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Person display(Person result)
	{
		LocalDate object = LocalDate.of(2018,12,19);
		result.name = name;
		result.day = day;
		result.month = month;
		result.year = year;
		result.days = object.getDayOfMonth() - result.day;
		result.months = object.getMonthValue() - result.month;
		result.years= object.getYear() - result.year;
		System.out.println("Age is:" + days +"days  "+ months +" months "+years+"years");
		return result;
	}
	
	public Person olderOne(Person p) 
	{
		//LocalDate object = LocalDate.of(p.year, p.month, p.day);
		Person givenPerson = new Person("jhon",1,1,1985);
		givenPerson.day = p.day - givenPerson.day;
		givenPerson.month = p.month - givenPerson.month;
		givenPerson.year = p.year - givenPerson.year;

		if(givenPerson.year<p.year)
		{
			if(givenPerson.month<p.month)
			{
				if(givenPerson.day<p.day)
				{
					System.out.println(givenPerson.name+"is older than"+p.name+"by"+givenPerson.yearDifference+"Years"
				+givenPerson.monthDifference+"months"+givenPerson.dayDifference+"days");
				}
			}
		}
		return givenPerson;
	}
}
