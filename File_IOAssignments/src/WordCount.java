import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class WordCount 
{
	public int display() throws Exception
	{
		int wordcount = 0;
		File file = new File("C:/ShivaKrishna/JAVA_PROGRAMS/git_commands.txt");
		Scanner scan = new Scanner(new FileReader(file));
		while (scan.hasNext()) 
		{           
			scan.next();
			
			wordcount = wordcount + 1;
			
        }
		return wordcount;
	}
}
