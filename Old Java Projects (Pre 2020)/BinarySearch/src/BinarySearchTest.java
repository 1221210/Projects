

public class BinarySearchTest {

	public static int countBinary;

	public static int binarySearch(int[] data, int key) {
		// perform a binary search on the data

		int low = 0; // low end search of the area
		int high = data.length - 1; // high end search of the area
		int middle = (low + high + 1) / 2; // middle element
		int location = -1; // return value; -1 if not found
		countBinary = 0;
		do // loop to search for element
		{
			countBinary++;
			// print remaining elements of array
			System.out.println(remainingElements(data, low, high));

			// output spaces for alignment
			for (int i = 0; i < middle; i++)
				System.out.print("   ");
			System.out.println(" * "); // indicate current middle
			// if the element is found at the middle
			if (key == data[middle])
				location = middle; // location is the current middle
			else if (key < data[middle])// middle element is too high
				high = middle - 1; // eliminate the higher half
			else // middle element is too low
				low = middle + 1; // eliminate the lower half

			middle = (low + high + 1) / 2; // recalculate the middle
		} while ((low <= high) && (location == -1));

		return location; // return location of search key

	}// end method binarySearch

	// method to output certain values in array
	
	private static String remainingElements(int[] data, int low, int high) {
		StringBuilder temporary = new StringBuilder();

		// append spaces for alignment
		for (int i = 0; i < low; i++)
			temporary.append("    ");

		// append elements in the left array
		for (int i = low; i <= high; i++)
			temporary.append(data[i] + " ");

		return String.format("%s%n", temporary);
	} // end method remainingElements

} // end class BinarySearchTest
