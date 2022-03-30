
public class OverloadMethod {

	
	public static void main (String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.printf("%nThe intArray contains %n");
		printArray(intArray);
		
		System.out.printf("%nThe doubleArray contains %n");
		printArray(doubleArray);
		
		System.out.printf("%nThe charArray contains %n");
		printArray(charArray);
	}
	
	public static <T> void printArray(T[] intArray)
	{
		for (T element : intArray)
			System.out.printf("%s ", element);
	}
	
	
}
