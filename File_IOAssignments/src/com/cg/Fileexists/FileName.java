package com.cg.Fileexists;
import java.io.File;


public class FileName
{

	public boolean display()
	{
		File file = new File("C:/ShivaKrishna/JAVA_PROGRAMS/git_commands.txt");
		if(file.exists())
			return true;
		else
		return false;
		
	}
}
