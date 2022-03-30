public class PerHour extends Employee
	{
	
	private double wage; // hourly rate 
	private double hours; // number of hrs 
	
	public PerHour (String firstName, String lastName, String socSecNbr, double wage, double hours)
	{
		super(firstName, lastName, socSecNbr);
		
		// logic to set wage to equal wage or to equal zero
		if (wage >= 0)
			this.wage = wage;
		else
			this.wage = 0;

		if (hours >0 && hours <= 40)
			this.hours = hours;
		else
			this.hours = 0; 
		

	} // end of constructor hourly
	
	@Override
	public String toString()
	{
		return String.format("Hourly Employee %n%s%nRate %.2f%nHours %.2f%nEarnings: %.2f%n",  // prints wage hours, 
				//name , position and social sec # of employee
				
				super.toString(), wage, hours,earnings());
	}
		@Override public double earnings ()
		{
		return wage * hours;
		}
		
		
		
	}