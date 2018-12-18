import java.util.Scanner;
class Students
{
	public static void main(String args[])
	{
		int totalMarks = 0, averageMarks = 0, subject1 = 0, subject2 = 0, subject3 = 0;
		for(int i=1;i<4;i++)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Marks of Student"+ i);
			System.out.println("Enter the marks for JAVA:");
			int one = scan.nextInt();
			System.out.println("Enter the marks for JAVASCRIPT:");
			int two = scan.nextInt();
			System.out.println("Enter the marks for Spring:");
			int three = scan.nextInt();
			int average = (one + two + three)/3;
			System.out.println("The average marks for Student "+i+" is "+ average);
			System.out.println(" ");
			int total = one + two + three;
			System.out.println("The total marks for Student "+i+" is " + total);
			System.out.println(" ");
			subject1 = subject1 + one;
			subject2 = subject2 + two;
			subject3 = subject3 + three;
			averageMarks = averageMarks + average;
			totalMarks = totalMarks + total;
		}
		System.out.println("Average for JAVA of all students is:" + subject1/3);
		System.out.println(" ");
		System.out.println("Average for JAVASCRIPT of all students is:" + subject2/3);
		System.out.println(" ");
		System.out.println("Average for Spring of all students is:" + subject3/3);
		System.out.println(" ");
		System.out.println("The average marks scored by all the Students is: " + averageMarks);
		System.out.println(" ");
		System.out.println("The total marks scored by all the Students is: " + totalMarks);
	}		
}
				