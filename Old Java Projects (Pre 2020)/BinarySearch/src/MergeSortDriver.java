import java.security.SecureRandom;
import java.util.Arrays;
//Ian Selby 4/25/2019
//This program will display a Merge sort and it will display the total moves needed.
public class MergeSortDriver extends MergeSortTest{
	
	public static void main(String[] args)
	{
		SecureRandom generator = new SecureRandom();
		int[] data = new int[20]; // create array
		
		for(int i = 0; i < data.length; i++) // populate array
			data[i] = 10 + generator.nextInt(90);
		
		System.out.printf("Unsorted array:%n%s%n%n",
				Arrays.toString(data)); //display array
			mergeSort(data); // sort array
		
		System.out.printf("Sorted array:%n%s%n%n",
				Arrays.toString(data)); // display array
		
		System.out.print("Total moves : " + counterCombined ); 
	}
}
