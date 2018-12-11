/* To determine the Armstrong number with in a given range*/
public class ArmstrongRange 
{
	public static void main(String[] args) 
    	{
       		int n, b, sum = 0;
        	System.out.print("Armstrong numbers from 1 to 1000:");
        	for(int i = 100; i <= 999; i++)
        	{
            		n = i;
            		while(n != 0)
            		{
               			b = n % 10;
                		sum = sum + (b * b * b);
                		n = n / 10;
            		}
            		if(sum == i)
            		{
                		System.out.print(i+" ");
            		}
            		sum = 0;
        	}
	}
}