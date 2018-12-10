class Sequence
{
	public static void main(String args[])
	{
		int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp;
		for(int k=0;k<array.length;k++)
		{
			for(int i = 0;i<array.length-1;i++)
			{
				if(array[i] > array[i+1])
				{
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				}
			}
		}
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[j]);
		}
	}
}