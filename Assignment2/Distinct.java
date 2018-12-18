
public class Distinct 
{
	public int misssing(int i,int j,int k)
	{
		int numbers[] = {i,j,k};
		int length = numbers.length;
		int addition = i + j + k;
		
		int expectedAddition = (length * (length+1))/2;
		int result = expectedAddition - addition;
		return result;
	}
}
