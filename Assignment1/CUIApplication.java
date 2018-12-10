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
			String user_name = input.nextLine();
			System.out.println("Enter the password:");
			int password = input.nextInt();
			if(user_name.equals(name) && password == value)
			{
				System.out.println("Welcome" + user_name);
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