import java.util.*;
import java.text.*;
import java.time.LocalDate;
class Month
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date:");
		String date = input.next();
		String day=date.substring(0,2);
		
		String month=date.substring(3,5);
		
		String year=date.substring(6,10);
		
		switch(month)
		{
			case "01":
				month = "Janurary";
				break;
			case "02":
				month = "February";
				break;
			case "03":
				month = "March";
				break;
			case "04":
				month = "April";
				break;
			case "05":
				month = "May";
				break;
			case "06":
				month = "June";
				break;
			case "07":
				month = "July";
				break;
			case "08":
				month = "August";
				break;
			case "09":
				month = "September";
				break;
			case "10":
				month = "October";
				break;
			case "11":
				month = "November";
				break;
			case "12":
				month = "December";
				break;
		}	
		System.out.println(day + "/" + month + "/" +year);
	}
		
}