import java.util.Scanner;
public class Marks 
{
	public static void main(String[] args) 
	{		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter maths marks");
		int maths = n.nextInt();
		System.out.println("Enter english marks");
		int english = n.nextInt();
		System.out.println("Enter java marks");
		int java = n.nextInt();

		if(maths>=60 && english>=60 && java>=60)
		{
			System.out.println("Passed");
		}	
		else if(maths>60 && english>60 || english>60 && java>60 || maths>60 && java>60)
		{
			System.out.println("promoted");
		}
		else if(maths>=60&&java<60 &&english<60 || english>=60&&maths<60&&java<60 || java>=60&&english<60&&maths<60)
		{
			System.out.println("failed");
		}
		else
		{
		System.out.println("failed");
		}
	}

}
