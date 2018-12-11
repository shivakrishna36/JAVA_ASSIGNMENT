class Missing
{
	public static void main(String args[])
	{
		int n = 0,result = 1;
		int numbers[] = {0,1,2,3,4,5,8,9,7};
		for(int i=0;i<numbers.length;i++)
		{
			for(int count =0;count<numbers.length;count++)
			{
				if(n == numbers[count])
				{
					break;
					n++;
				}
				else
				{
					result = result + n;
				}
			
			}
			n++;
		}
		System.out.println(result);
	}
}