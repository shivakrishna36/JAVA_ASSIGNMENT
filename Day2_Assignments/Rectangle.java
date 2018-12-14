public class Rectangle {
	private double length;
	private double width;
	
	//initialize the values
	public Rectangle(double length,double width)
	{
		this.length = length;
		this.width  = width;
	}
	
	//calculates the area of rectangle for object 1
	public double getAreaOfRectangle() {
		double area = length * width;
		return area;
	}
	
	//calculates the area of rectangle for object 2
	public double getAreaOfRectangle1() {
		double area = length * width;
		return area;
	}

	//calculates perimeter and returns of object 1
	public double getPerimeterOfRectangle() {
	double perimeter = 2*(length+width);
		return perimeter;
	}
	
	//calculates the perimeter of rectangle for object 2
	public double getPerimeterOfRectangle1() {
		double perimeter = 2*(length+width);
			return perimeter;
		}
	
	//Calculates diagonal and returns
	public double getDiagonalOfRectangle()
	{
		double squares = (length*length) +(width*width);
		double diagonal = Math.pow(squares, 0.5);
		return diagonal;
	}

	//compares two areas of rectangle
	public boolean compareAreasOfRectangle()
	{
		if(getAreaOfRectangle()==getAreaOfRectangle1())
		return true;
		
		return false;
	}
	
	//compares two perimeters of rectangle
	public boolean comparePerimetersOfRectangle()
	{
		if(getPerimeterOfRectangle()==getPerimeterOfRectangle1())
		return true;
		
		return false;
	}
	
}
