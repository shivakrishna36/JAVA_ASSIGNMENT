import static org.junit.Assert.*;

import org.junit.Test;


public class WordCountTest
{
	private WordCount count = new WordCount();
	
	@Test
	public void test() throws Exception 
	{
		assertEquals(4,count.display());
	}
}
