public class Removingspace 
{
	String result = "";
	int count=0;
	public String removeSpaces(String name) 
	{
		String names = name.replace("  "," ");	
		String names1 = names.replace("  "," ");
		//System.out.println(names1);
		return names1;
	}
	
	public String removeWord(String name,String remove,int position)
	{
	
		
		String values[] = name.split(" +");

		System.out.println(values[4]);
		for(count=0;count<values.length;count++)
		{
			if(values[count]!= remove && count!=position)
			{

				result = result + values[count];
				
				if(count<values.length-1)
				result = result + " ";
			}
			else
			{
				System.out.println(" ");
			}
		}
		System.out.println(result);
		
		return result;
	}
}
