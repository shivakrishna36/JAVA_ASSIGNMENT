
public class Distinct 
{
	public int misssing(int i,int j,int k)
	{
		int numbers[] = {i,j,k};
		int length = numbers.length;
		int addition = i + j + k;
		
		int expected_addition = (length * (length+1))/2;
		int result = expected_addition - addition;
		return result;
	}
}
