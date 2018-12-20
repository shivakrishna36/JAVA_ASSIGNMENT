public class Finally 
{
	public static void main(String args[])
	{
		/**
		 * finally block gets always executed whether the exception occurs or not
		 * 
		 *If there is a finally block there must be a try block
		 *
		 *the statements that we want to execute compulsory those statements are to be written in finally block
		 */
	
		//Example for finally block where exception occurs
	
		try
		{
			int answer = 12/0;
		}
	
		catch(ArithmeticException e)		//here the exception caught by catch and then finally block gets executed
		{
			//e.printStackTrace();
		}
	
		finally
		{
			System.out.println("This is finally block");
		}
		
		/**The circumstances that prevent execution of the code in a finally block are:
		 * 
		*The death of a Thread
		*
		*Using of the System. exit() method.
		*
		*Due to an exception arising in the finally block.
		*
		*/
	}
}