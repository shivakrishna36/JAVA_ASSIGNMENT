
public class Palindrome1 
{
	public String palindromeNames(String names)
	{
		int count;
		String after = "";
		for(count = names.length()-1;count>=0;count--)
		{
			after+= names.charAt(count);
		}
		if(names.equals(after))
		{
			System.out.println(after);
			System.out.println(names.length());
		}
		
		return after;
	}
}

