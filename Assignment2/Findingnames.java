
public class Findingnames
{
	int flag = 0;
		public boolean findName(String name,String names[])
		{
			
			boolean result = false;
			for(int count=0;count<names.length;count++)
			{
				if(names[count]==name)
				{
					result = true;
					flag++;
				}
				
			}
			return result;
		}
		public int occurence(String name,String names[])
		{
			for(int count=0;count<names.length;count++)
			{
				if(names[count]==name)
				{
					
					flag++;
				}
				
			}
			return flag;
		}

}
