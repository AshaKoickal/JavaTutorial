package employee;

public class Hra extends BasicDetails {
	
	public int CalculateHra()
	{
		BasicDetails obj = new BasicDetails();
		int hra= (obj.basicPay*5)/100;
		return hra;		
	}
	public int CalculatePf()
	{
		BasicDetails obj = new BasicDetails();		
		int pf=(obj.basicPay*20)/100;
		return pf;
				
	}
	}


