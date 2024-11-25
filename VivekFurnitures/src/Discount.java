
public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		if(bObj instanceof SteelBero)
		{
		    return bObj.getPrice()*0.10;
		}
		else if(bObj instanceof WoodenBero)
		{
		    return bObj.getPrice()*0.15;
		}
		else
		{
		    return 0.00;
		}
	}
}
