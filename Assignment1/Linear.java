import java.util.Scanner;
public class Linear 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be searched");
		int find = scan.nextInt();
		int numbers[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int length = numbers.length,i;
		for(i=0;i<length;i++)
		{
			if(numbers[i]==find)
			{
				System.out.println("The number is present at :"+ (i+1) + " position");
				break;
			}
		}
		if(i==len)
		{
			System.out.println("Number is not found");
		}
	}
}