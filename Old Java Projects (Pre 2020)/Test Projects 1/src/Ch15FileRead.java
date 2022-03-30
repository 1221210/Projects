import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ch15FileRead {

	public static Scanner input;

	public static void main(String[] args) {

		openFile();
		readRecords();
		closeFile();

	}

	public static void openFile() {
		try {
			input = new Scanner(Paths.get("People.txt"));
		} catch (IOException io) {
			System.err.println("Error opening file. Terminating. ");
			System.exit(1);
		}

	}

	public static void closeFile() {
		if (input != null)
			input.close();

	}

	public static void readRecords() {
		System.out.printf("%-13s%-12s%3s%9s   %-11s%10s%10s%11s%10s", "First Name", "Last Name", "Age", "Income",
				"PhoneNumber", "Address", "City", "State", "ZipCode");

		String firstName;
		String lastName;
		String age;
		String income;
		String PhoneNumber;
		String address;
		String city;
		String state;
		String zipName;

		try {
			while (input.hasNext()) // while (input.hasNext("exit"))
			{

				firstName = input.next();
				lastName = input.next();
				age = input.next();
				income = input.next();
				PhoneNumber = input.next();
				address = input.next();
				city = input.next();
				state = input.next();
				zipName = input.next();

				System.out.printf("%n%-13s%-12s%3s%9s   %-11s%10s%12s%8s%10s%n", firstName, lastName, age, income,
						PhoneNumber, address, city, state, zipName);

				if (!ValidateInput.validateFirstName(firstName))
					System.out.println("The first name is not a valid format.  ");

				if (!ValidateInput.validateLastName(lastName))
					System.out.println("The first name is not a valid format.  ");

				if (!ValidateInput.validateZip(zipName))
					System.out.println("The zipcode is not in a valid format.  ");

				if (!ValidateInput.validateAge(age))
					System.out.println("The age is not in a valid format.  ");

				if (!ValidateInput.validateIncome(income))
					System.out.println("The income is not in a valid format.  ");

				if (!ValidateInput.validateCity(city))
					System.out.println("The city is not in a valid format.  ");

				if (!ValidateInput.validateState(state))
					System.out.println("The state is not in a valid format.  ");

				if (!ValidateInput.validatePhoneNumber(PhoneNumber))
					System.out.println("This address is not in a valid format.  ");

				if (!ValidateInput.validateAddress(address))
					System.out.println("This address is not in a valid format.  ");

			}
		} catch (NoSuchElementException nsee) {
			System.err.println("File improperly formatted. Terminating...");
		} catch (IllegalStateException iee) {
			System.err.println("Error reading file. Terminating...");
		}

	}
}
