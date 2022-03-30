

public class BasePlusComm extends CommOnly
{
	
	
	private double baseSalary;

	public BasePlusComm (String firstName, String lastName, String socSecNbr, double grossSales, double commRate, double baseSalary) 
	{ 
		super (firstName,  lastName,  socSecNbr,  grossSales,  commRate);
		if (baseSalary > 0)
		{
		this.baseSalary = baseSalary;
		}
		else
		this.baseSalary = 0;
			

	} // end of constructor CommONly
	public double earningscommission()
	{
		return super.earnings() + baseSalary;
	}
	@Override
	public String toString()
	{
	
		return String.format("%s %n%s%s%s%n%n", 
			"Base Plus Commission Employee", 
			super.toString(),
			"Base Salary: ", baseSalary);
	}
	
	
} // end of class CommOnly
