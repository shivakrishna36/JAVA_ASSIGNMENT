public class DiscountRate 
{

	public double calculateDiscount(int newItem) 
	{
		double discount = 0.35;
		double newItemPrice = newItem -(discount * newItem);
		System.out.print(newItemPrice);
		return newItemPrice;
	}

}
