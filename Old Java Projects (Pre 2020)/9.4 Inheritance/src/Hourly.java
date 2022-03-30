public class Hourly extends Employee
	{
	
	private double hourlyRate; // hourly rate 
	private double nbrHours; // number of hrs 
	
	public Hourly (String firstName, String lastName, String socSecNbr, double hourlyRate, double nbrHours)
	{
		super(firstName, lastName, socSecNbr);
		
		if (hourlyRate >= 0)
			this.hourlyRate = hourlyRate;
		else
			this.hourlyRate = 0;

		if (hourlyRate >0 && nbrHours <= 40)
			this.nbrHours = nbrHours;
		else
			this.nbrHours = 0; 
		

	} // end of constructor hourly
	
	@Override
	public String toString()
	{
		return String.format("%n%s%n%s%s %s%n%s%s%n%s%s%n%s%s%n%s%s%n", 
				"Hourly Employee", 
				super.toString(),
				"Rate: ", hourlyRate,
				"Hours: ", nbrHours,
				"Earnings: ", earnings());
	}
		public double earnings ()
		{
		return hourlyRate * nbrHours;
		}
		
		
	}