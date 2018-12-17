public class Complex
{
	  private float real,imaginary;
	
	public void setValues(float real, float imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
		
		
	}
	public void display()
	{
		System.out.println("Complex Number  = " +real+ " + (" +imaginary+ "i"); //It displays the Given Complex number
	

	}
	public Complex sumation(Complex numberOne,Complex  numberTwo) 
	{

		Complex complex = new Complex();
		complex.real = numberOne.real + numberTwo.real;
		complex.imaginary = numberOne.imaginary + numberTwo.imaginary;    //It adds two complex numbers		
		return complex;
	}
	
	public float getReal()
	{
		return real;
	}
	
	public void setReal(float real) 
	{
		this.real = real;
	}
	
	public float getImaginary() 
	{
		return imaginary;
	}
	
	public void setImaginary(float imaginary)
	{
		this.imaginary = imaginary;
	}

}

