class Calculator 	//creating a class
{
	//creating  a main
	public static void main(String args[])
	{		
		System.out.println("Hello World");
		System.out.println("Addition is:" + add(20.4,10.2));
		System.out.println("Subtraction is:" + sub(20.8,10.2));
		System.out.println("Multiplication is:" + mul(20,10.4));
		System.out.println("Division is:" + div(20,12));
		
	}
	static double add(double one,double two)
	{
		double addition = one + two;
		return addition;
	}
	static double sub(double one, double two)
	{
		double subtraction = one-two;
		return subtraction;
	}
	static double mul(double one,double two)
	{
		double multiplication = one*two;
		return multiplication;
	}
	static double div(double one,double two)
	{
		double division = one/two;
		return division;
	}	

}