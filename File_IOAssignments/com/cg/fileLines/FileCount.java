package com.cg.fileLines;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCount 
{
	int count =1;
	public int display() throws IOException
	{
		File file = new File("C:/ShivaKrishna/JAVA_PROGRAMS/git_commands.txt");
		
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			int number;
			while((number=br.read())!= -1)
			{
				if(number=='\n')
					count = count+1;
			}
		
		
		reader.close();
		br.close();
		return count;
	}
}
