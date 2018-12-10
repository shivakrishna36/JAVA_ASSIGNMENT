class Palindrome
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = 122,a,b = 0,c;
		int temp = n;
		while(n>0)
		{
			a = n % 10;
			b = (b * 10) + a;
			n = n / 10;
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