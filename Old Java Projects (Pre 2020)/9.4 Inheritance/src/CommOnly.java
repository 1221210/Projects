

public class CommOnly  extends Employee{
	
	private String firstName;
	private String lastName;
	private String socSecNbr;
	private double grossSales; // gross sales
	private double commRate; // commission rate

	public CommOnly (String firstName, String lastName, String socSecNbr, double grossSales, double commRate)
	{
		super(firstName, lastName, socSecNbr);
		
		if (grossSales >= 0)
			this.grossSales = grossSales;
		else
			this.grossSales = 0;
		//check to ensure the CommRate is between 0 and 100%
		if (commRate >0 && commRate <= 1)
			this.commRate = commRate;
		else
			this.commRate = 0.5; //sets rate to 50% if a bad value is entered

	} // end of constructor CommONly
	public String getfirstName() {
		return firstName;
		
	}
	public String getlastName() {
		return lastName;
		
	}
	public String getsocSecNbr() {
		return socSecNbr;
		
	}
	public double getcommRate() {
		return commRate;
		
	}
	public double getgrossSales() {
		return grossSales;
	}
	@Override
	public double earnings()
	{
		return (grossSales * commRate) ;
	}
	public String toString()
	{
		return String.format("%s %n%s%n%s%.2f        %s%.2f   %s%.2f%n%n", 
				"Commission Only Employee", 
				super.toString(),
				"Gross Sales: ", grossSales, "Comm Rate: ", commRate,
				"Earnings", earnings());
	}
	
	
} // end of class CommOnly
