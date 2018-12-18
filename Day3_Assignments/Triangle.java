
public class Triangle 
{

	public boolean scaleneTriangle(int side1, int side2, int side3)
	{
		if(side1!=side2 && side1!=side3 && side2!=side3)
			return true;
		return false;
	}

	public boolean isoscelesTriangle(int side1, int side2, int side3) 
	{
		if(side1==side2 || side1==side3 || side2==side3)
			return true;
		return false;
	}

	public boolean equilateralTriangle(int side1, int side2, int side3) 
	{
	if(side1==side2 && side2==side3)
		return true;
		return false;
	}

	public boolean rightAngledTriangle(int side1, int side2, int side3) 
	{
		int hypotenuse = side1 * side1;
		int sumOfSides = (side2 * side2) + (side3 * side3);
		if(hypotenuse == sumOfSides)
			return true;
		return false;
	}
 
}
