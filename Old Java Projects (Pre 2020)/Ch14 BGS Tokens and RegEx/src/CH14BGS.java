


import java.util.Scanner;

public class CH14BGS 
{
	public static void main (String [] args) {
		
	
	/*Scanner input = new Scanner(System.in);
	System.out.print("Please input a sentence and I'll break it into tokens for you : ");
	String sentence = input.nextLine();
	
	String[] tokens = sentence.split(" ");
	
	for (String token : tokens)
		System.out.print(token);
	
	} */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first name here: ");
		String firstName = input.nextLine();
		System.out.print("Please enter your last name here: ");
		String lastName = input.nextLine();
		System.out.print("Please enter your ZipCode here: (Format as 5 digit #) ");
		String zipName = input.nextLine();
		System.out.print("Please enter your AGE here: ");
		String age = input.nextLine();
		System.out.print("Please enter your income here (whole decimal only) : ");
		String income = input.nextLine();
		System.out.print("Please enter your city here : ");
		String city = input.nextLine();
		System.out.print("Please enter your state here : ");
		String state = input.nextLine();
		System.out.print("Please enter your phone number here (format = xxx-xxx-xxxx) : ");
		String PhoneNumber = input.nextLine();
		System.out.print("Please enter your address here (format = 2342 East Potato Street) : ");
		String address = input.nextLine();
		
		
		// Check to validate integrity of the input. return t/f
		
		if(!ValidateInput.validateFirstName(firstName))
			System.out.println("The first name is not a valid format. Please re-enter: ");
			input.nextLine();
			
		if(!ValidateInput.validateLastName(lastName))
			System.out.println("The first name is not a valid format. Please re-enter: ");
			input.nextLine();
			
		if(!ValidateInput.validateZip(zipName))
			System.out.println("The zipcode is not in a valid format. Please re-enter: ");
			input.nextLine();
			
		if(!ValidateInput.validateAge(age))
			System.out.println("The age is not in a valid format. Please re-enter: ");
			input.nextLine();
			
		if(!ValidateInput.validateIncome(income))
			System.out.println("The income is not in a valid format. Please re-enter: ");			
			input.nextLine();

		if(!ValidateInput.validateCity(city))
			System.out.println("The city is not in a valid format. Please re-enter: ");
			input.nextLine();
		
		if(!ValidateInput.validateState(state))
			System.out.println("The state is not in a valid format. Please re-enter: ");
			input.nextLine();
		
		if(!ValidateInput.validatePhoneNumber(PhoneNumber))
			System.out.println("This address is not in a valid format. Please re-enter: ");
			input.nextLine();		

		
		if(!ValidateInput.validateAddress(address))
			System.out.println("This address is not in a valid format. Please re-enter: ");
			input.nextLine();		

		
		
		
	}
}
