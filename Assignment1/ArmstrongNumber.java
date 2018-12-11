/*To check whether the given number is Armstrong*/
import java.util.*;
public class ArmstrongNumber 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = input.nextInt();
		int r=0, i,temp;
		temp=n;
		while(n!=0)
		{
			i = n%10;
			r = r + i*i*i;
			n = n/10;
		}
		if(r==temp)
		{
			System.out.println("It is Armstrong  number");
			
		}
		else
		{
			System.out.println("Not a armstrong");
		}
		
	}
}
