public class Dimension 
{
	public boolean findNumber(int n, int number[][] )
	{
		int i,j;
		boolean result= false;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(number[i][j] == n)
					{
					result = true;
					}
			}
		}
		return result;
	}
}

