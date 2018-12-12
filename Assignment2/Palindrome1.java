
public class Palindrome1 
{
	public int palindromeNumber(int number)
	{
		String reverse;
		int remainder,sum = 0;
		int test = number,a=0,value = 0;
		while(test>0)
		{
			remainder = test % 10;
			sum = (sum * 10) + remainder;
			test = test/10;
		}
		if(sum == test)
		{
			String totalnumbers = Integer.toString(test);
			char ch[] = totalnumbers.toCharArray();
			int length = ch.length;
			for(int count=length-1;count>=0;count--)
			{
					ch[a] = ch[length-1];
					a++;
			}
			reverse = new String(ch);
			value= Integer.parseInt(reverse);
			
		}
		return value;
	}
}

