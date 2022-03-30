

public class CommissionOnly  extends Employee{
	
	
	private double grossSales; // gross sales
	private double commRate; // commission rate
//constructor
	public CommissionOnly (String firstName, String lastName, String socSecNbr, double grossSales, double commRate)
	{
		super(firstName, lastName, socSecNbr);
		
		if (grossSales > 0)
			this.grossSales = grossSales;
		else
			this.grossSales = 0;
		//check to ensure the CommRate is between 0 and 100%
		if (commRate > 0)
			this.commRate = commRate;
		else
			this.commRate = 0; //sets rate to 8%

	} // end of constructor CommONly
	
	public double getcommRate() { // getter for comm rate
		return commRate;
		
	}
	public double getgrossSales() { // getter for gross sales
		return grossSales;
	}
	@Override
	public double earnings() // calcs earnings
	{
		return (grossSales * commRate) ;
	}
	@Override
	public String toString() //  returns employee info
	{
		return String.format("%s %n%s%n%s%.2f   %s%.2f   %s%.2f%n", 
				"Commission Employee", 
				super.toString(),
				"Gross Sales: ", grossSales, "Comm Rate: ", commRate,
				"Earnings: ", earnings());
	}
	
	
} // end of class CommOnly


