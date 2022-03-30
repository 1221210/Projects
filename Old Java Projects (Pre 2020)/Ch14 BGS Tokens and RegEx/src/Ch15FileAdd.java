
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Ch15FileAdd {

	
	public static Formatter output;
	
	public static void main(String[] args) {
		
		openFile();
		addRecords();
		closeFile();
		
	}
	
	public static void openFile()
	{
		try
		{
			output = new Formatter("People.txt");
		}
		catch (SecurityException se)
		{
			System.err.println("Write permission denied. Terminating. ");
			System.exit(1);
		}
		catch (FileNotFoundException fnf)
		{
			System.err.println("File not found. Terminating. ");
			System.exit(1);
		}
		
		
	}
	public static void closeFile()
	{
		if (output != null)
			output.close();
		
		
	}
	public static void addRecords()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your first name or exit here: ");
		String firstName = input.nextLine();
		
		
		while (!firstName.equals("exit")) //while (!input.hasNext("exit"))
		{
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
		
		try 
			{  
				output.format("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n" , firstName, lastName, age, income, PhoneNumber, address, city, state, zipName );
			}
			catch (FormatterClosedException fce)
			{
				System.err.println ("Error writing to file. Terminating");
				break;
			}
			catch (NoSuchElementException nsee)
			{
				System.err.println ("Invalid Input. Try Again...");
				input.nextLine();		
			}
		System.out.print("Please enter your first name or exit here: ");
		firstName = input.nextLine();
		}
	}
}

