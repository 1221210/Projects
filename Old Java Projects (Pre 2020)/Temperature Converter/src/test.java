import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
	public static void main(String[] args)
    {
	
	Scanner scanner = new Scanner(System.in); //establishes a new scanner for the user's temperature

	System.out.println("Hello, this is my attempt at a temperature converter!"); 
	
	System.out.print("Enter the temperature in °F that you want in °C: ");
	
	
	double tempUnit = scanner.nextDouble(); //should set user's input to double temperatureUnit
	
	double tempConvert = conversionFormulaFtoC(tempUnit);
    
    DecimalFormat df = new DecimalFormat("####.#)");
    
    String tempFormatted = df.format(tempConvert);
    
    System.out.println("Your temperature in Celcius is: " + tempFormatted + "°C");
    }

	private static double conversionFormulaFtoC(double tempUnit) {
		// TODO Auto-generated method stub
		double celsius = (tempUnit - 32) * 5/9;
		return celsius;
	}

}






/*	if(temperatureUnit))
{
	System.out.println("Your temperature is: " + temperatureUnit + " °F");
}
else {
	System.out.println("Your temperature is: " + temperatureUnit + " °C" );
 };


double Farenheit = (temperatureUnit − 32) * 5/9; */