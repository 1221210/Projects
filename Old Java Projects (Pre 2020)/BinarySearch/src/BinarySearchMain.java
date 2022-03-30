//Ian Selby 4/25/2019
// This program will display a binary search with a gui prompt and it will display the total moves needed.
import java.security.SecureRandom; 
import java.util.Arrays;
import javax.swing.JOptionPane;

public class BinarySearchMain extends BinarySearchTest{
	
	public static void main(String[] args)
	{
		//Scanner input = new Scanner(System.in);
		int[] data = new int[20]; // creates array 
		
		SecureRandom generator = new SecureRandom();
		
		for(int i = 0; i < data.length; i++) // populate array
			data[i] = 10 + generator.nextInt(90);
		
		Arrays.sort(data); // binarySearch requires sorted array
		System.out.printf("%s%n%n", Arrays.toString(data)); // display array 
		
		// get input from user
	String userInput = JOptionPane.showInputDialog("Enter an integer please");
		
		int input =	Integer.parseInt(userInput);
		
		//repeatedly input an integer; -1 terminates the program
		while (input != 1)
		{
			//Perform search
			int location = binarySearch(data, input);
			
			if (location == -1) // not found
				System.out.printf("%d was not found %d%n%n",
					input, location);
			
			else // found
				System.out.printf("%d was found in position %d%n%n",
						input, location);
			System.out.println("Total amount of moves is: " + countBinary);
			System.exit(1);
		}

	}// end main
}
