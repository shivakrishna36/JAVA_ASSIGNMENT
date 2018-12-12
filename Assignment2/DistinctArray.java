public class DistinctArray 
{

	public boolean distinctCheck(int[] number, int k) 
	{
			int count,count1,answer =0;
			for(count=0;count<number.length;count++)
			{
				for(count1=1;count1<number.length;count1++)
				{
					if(count== count1)
					{ 
						
					}
					else if(number[count]==number[count1])
					{
						
						answer = count1-count;
						System.out.println(answer);
						if(k >= (count1-count))
							return true;
					}
				}
			}
		return false;
	}
	
}
