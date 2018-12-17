class Date 
{ 
	private int date, month, year; // data members to store the day, month and year of a date.
	public Date(int date, int month, int year) //constructor to initialize Date objects
	{
		this.date = date;
		this.month = month;
		this.year = year;//initialize d, m, y of the current object using the d, m, y parameters. 
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
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

	public String toString()// method to get the value of a Date object printed
	{
		return date+"/"+month+"/"+year;//return the value of a Date object as a String in d/m/y format.
	}
	
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		Date givenDate = new Date(18,12,2019);
		if(d.date<givenDate.date)
		{//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
			return true;
		}
		return false;
	}
	
	public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
	{
		Date givenDate = new Date(18,12,2019);
		//The difference of days, months and years in the invoking and parameter Date objects 
		int newDate = givenDate.date - d.date;
		int newMonth = givenDate.month - d.month;
		int newyear = givenDate.year - d.year;				//is obtained and returned in an int array. The first element of the array should represent
		int differences[] =	{newDate,newMonth,newyear};
		return differences;						//difference of days; second one, the difference of months and the third one, the difference of years.
	}
}