import java.util.Scanner;
public class Tax
{
	public static void main(String[] args) 
	{
		Scanner range = new Scanner(System.in);
		System.out.println("Enter the CTC");
		int tax = range.nextInt();
		if(tax<180000)
		{
			System.out.println("The tax for" + tax +"is Nil");
		}
		else if(tax>=181000 && tax<300000)
		{
			System.out.println("The tax for" + tax +"is"+0.1*tax);
		}
		else if(tax<=500000)
		{
			System.out.println("The tax for" + tax +"is" + 0.2*tax);
		}
		else if(tax<=1000000)
		{
			System.out.println("The tax for" + tax +"is" + 0.3*tax);
		}
		else
		{
			System.out.println("Please enter CTC UPTO 10LAKHS");
		}
	}

}
