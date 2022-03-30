
public class ValidateInput {
	
	public static boolean validateFirstName(String firstName)
	{
		return firstName.matches("[A-Z][a-z]+");
	}
	public static boolean validateLastName(String lastName)
	{
		return lastName.matches("[A-Z][a-zA-Z]*");
	}
	public static boolean validateAge(String age) 
	{	
		return age.matches("[1-9][0-9]*");
	}
	public static boolean validateIncome(String income) 
	{	
		return income.matches("[0-9]+");
	}
	public static boolean validateCity(String city) 
	{	
		return city.matches("[A-Z][a-z]+");
	}
	public static boolean validateState(String state) 
	{	
		return state.matches("[A-Z][A-Z]");
	}
	public static boolean validateZip(String zipName) 
	{	
		return zipName.matches("\\d{5}");
	}
	public static boolean validatePhoneNumber(String PhoneNumber) 
	{	
		return PhoneNumber.matches("[1-9]\\d{2}-\\d{3}-\\d{4}");
	}
	public static boolean validateAddress(String address) 
	{	
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"); // \\\\d[3]\\\\s[A-Z][a-z]+
	}
}

