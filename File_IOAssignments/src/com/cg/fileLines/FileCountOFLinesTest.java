package com.cg.fileLines;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class FileCountOFLinesTest 
{
	FileCount count = new FileCount();
	
	@Test
	public void testForLinesInFile() throws IOException
	{
		assertEquals(7,count.display());
	}

}
