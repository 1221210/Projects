
/**
 * 
 * @author Ian Selby
 * @2/28/2019 version 1
 *
 */
import java.util.Scanner;

public class DivideByZeroErrorHandling 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will prompt for numerator and denominator and do stuff");
		System.out.println("Please enter a numerator here: ");
		int numerator = scanner.nextInt();
		System.out.println("Please enter a denominator here: ");
		int denominator = scanner.nextInt();
			try 
			{
				int result = quotient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
			}
			
			catch(ArithmeticException ae)
			{
				System.err.printf("%nException: $s%n", ae);
				System.out.printf("Zero is a invalid value for denominator");
	}		}
		public static int quotient (int numerator, int denominator) throws ArithmeticException
		{
			return numerator/denominator;
		}
	
}
