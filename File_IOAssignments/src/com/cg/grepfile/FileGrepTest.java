package com.cg.grepfile;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileGrepTest 
{
	Grep grep = new Grep();
	
	@Test
	public void test() 
	{
		assertEquals("1hithisis3hihellohow4howthathiisw5howhowhowhi11ayhi",grep.display());
	
	}

}
