package com.cg.grepfile;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Grep
{
	public int display()
	{
		int count = 0,number=0,line=0;
		String file = ("C:/ShivaKrishna/JAVA_PROGRAMS/git_commands.txt");
		try	
	 	{
			 Scanner scan = new Scanner( new FileReader( file  ) );
			 
			 while (scan.hasNext() )
			 {
				 line++;
				 String name[] = scan.nextLine().split(" ");
				 for(count=0;count<name.length;count++)
				 {
					 if(name[count].equals("hi"))
					 {
						 
						 System.out.print(line+" ");
						 for(String names: name)
						 {
							 System.out.print(names +" ");
						 }
						System.out.println(" ");
						 
					 }
					 
				 }
					 //System.out.println(scan.nextLine());
				 
			 }
			 scan.close();  
	 	}
	 
	    catch(IOException e)
	    {
		    System.out.println(e.getMessage() ); 
		}	
		return count;
		
		
		 		
	}
}
