public abstract class Employee 
{
private final String firstName;
private final String lastName;
private final String socSecNbr;


public Employee(String firstName, String lastName, String socSecNbr )
{
	this.firstName = firstName;
	this.lastName = lastName;
	this.socSecNbr = socSecNbr;
}

//getters for first, last name and social sec number
public String getfirstName() {
	return firstName;
	
}
public String getlastName() {
	return lastName;
	
}
public String getsocSecNbr() {
	return socSecNbr;
}
@Override
public String toString() // returns social, name
{
	return String.format("%s %s%nSocial Security Number: %s",
			getfirstName(), getlastName(), getsocSecNbr());
	
}
	public abstract double earnings();

}