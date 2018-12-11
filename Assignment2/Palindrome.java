import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		int a,b = 0,c;
		int temp = number;
		while(number>0)
		{
			a = number % 10;
			b = (b * 10) + a;
			number = number / 10;
		}
		if(b==temp)
		{
			System.out.println( temp + " is palindrome ");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}