
public class WoodenBero extends Bero
{
	
    private String woodType;
    public WoodenBero(String beroType,String beroColour,String woodType)
	{
	    super(beroType,beroColour);
	  
	    this.woodType=woodType;
	    calculatePrice();
	}
		public String getWoodType()
	{
	    return woodType;
	}
	public void setWoodType(String woodType)
	{
	    this.woodType=woodType;
	}
	@Override
	public void calculatePrice() 
	{
		if("Ply wood".equalsIgnoreCase(woodType))
	    {
	        price=15000;
	    }
	    else if("Teak Wood".equalsIgnoreCase(woodType))
	    {
	        price=12000;
	    }
		else if("Engineered Wood".equalsIgnoreCase(woodType))
		{
		    price=10000;
		}
		else
		{
		    System.out.println("Invalid woodType provided");
		    price=0;
		}
	}


}

