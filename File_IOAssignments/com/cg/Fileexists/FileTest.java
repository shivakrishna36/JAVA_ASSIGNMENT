package com.cg.Fileexists;
import static org.junit.Assert.*;

import org.junit.Test;


public class FileTest 
{
	private FileName file = new FileName();
	
	
	@Test
	public void testForFileExists()
	{
		boolean result = file.display();
		assertTrue(result);
	}

	

}
