/* A user to enter his Login name and password, after entering the valid user-id 
	and password it will print the message �Welcome� along with user name.
	As per the validation is concerned, the program should keep a track of 
	login attempts. After three
	attempts a message should be flashed saying �Contact Admin� 
	and the program should terminate. */
import java.util.Scanner;
class CUIApplication
{
	public static void main(String args[])
	{
		String name = "KRISHNA";
		int value = 123654;
		int count = 0;
		for(int i=1;i<=3;i++)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the user name:");
			String userName = input.nextLine();
			System.out.println("Enter the password:");
			int password = input.nextInt();
			if(userName.equals(name) && password == value)
			{
				System.out.println("Welcome" + userName);
				break;
			}
			else
			{
				System.out.println("Try again");
				count = count+1;
			}
		}
		if(count==3)
		{
			System.out.println("Contact Admin:");
		}
	}
}