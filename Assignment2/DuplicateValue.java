
public class DuplicateValue 
{
	public String findDuplicate(String name)
	{
		char names[] = name.toCharArray();
		String result= "";
		for(int i=0;i<names.length;i++)
		{
			char names1 = name.charAt(i);
			if(names1!=' ')
				result = result + names1;
			name = name.replace(names1,' ');
		}
		return result;
	}

}
