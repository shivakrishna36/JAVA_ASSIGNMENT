class Duplicate
{
	public static void main(String args[])
	{
		int a[] = {12,15,6,4,12,15,24,36,12,15,45,4,78,54};
		int length = a.length;
		int temp;
		for(int k=0;k<length;k++)
		{
			for(int b=0;b<length-1;b++)
			{
				if(a[b]>a[b+1])
				{
					temp = a[b];
					a[b] = a[b+1];
					a[b+1] = temp;
				}
			}
		}
		int len = duplicate(a,length);
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
	}
	static int duplicate(int a[],int l)
	{
		int t=0;
		for(int j=0;j<l-1;j++)
		{
			if(a[j]!=a[j+1])
			{
				a[t++] = a[j];
			}
		}
		a[t++] = a[l-1];
		return t;
	}
}
			 