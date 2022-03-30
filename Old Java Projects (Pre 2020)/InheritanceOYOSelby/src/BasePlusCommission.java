

public class BasePlusCommission extends CommissionOnly 
{
	
	
	private double baseSalary; // var for salary
//constructor
	public BasePlusCommission (String firstName, String lastName, String socSecNbr, double grossSales, double commRate, double baseSalary) 
	{ 
		super (firstName,  lastName,  socSecNbr,  grossSales,  commRate);
		if (baseSalary > 0)
		{
		this.baseSalary = baseSalary;
		}
		else
		this.baseSalary = 0;
			

	} 
	public double getbaseSalary() //getter for base salary
	{
		return baseSalary;
	}
	
	@Override // calcs earnings for base+commission
	public double earnings() // 
	{
		return super.earnings() + getbaseSalary();
	}
	@Override
	public String toString() // returns employee info
	{
	
		return String.format("%s%s%s%.2f%n%n", 
			"Base Plus ", 
			super.toString(),
			"Base Salary: ", baseSalary);
	}
	
	
} // end of class 
