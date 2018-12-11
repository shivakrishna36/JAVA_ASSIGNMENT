import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringReverseTest 
{
private Reverse reverse;
	
	@Before
	public void setup()
	{
		reverse = new Reverse();
	}
	
	@Test
	public void CheckReversedSentece()
	{
		String reversedSentence = reverse.stringReverse("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",reversedSentence);
	}


}
