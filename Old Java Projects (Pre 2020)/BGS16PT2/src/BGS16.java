import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class BGS16 {

	public static void main(String[] args) {
		String[] colors = { "GREEN", "BLUE", "RED", "PURPLE", "ORANGE", "GREY" };
		List<String> list = new LinkedList<String>();

		for (String color : colors)
			list.add(color); // adds all of the color elements in the array in to this list

		String[] colors2 = { "YELLOW", "RED", "CYAN" };
		List<String> list2 = new LinkedList<String>();

		for (String color : list2)
			list2.add(color); // removes all of the color elements in the array in to this list

		list.addAll(list2);
		list2 = null;
		printList(list);

		convertToLower(list);
		printList(list);
		reversePrint(list);

		
		System.out.println("Caleb does not like purple, so we are removing it.");
		removeItems(list,3,4);
		printList(list);
		reversePrint(list);


	}


	private static void printList(List<String> list) {
		System.out.printf("%n list %n");

		for (String color : list)
			System.out.printf("%s ", color);
		System.out.println();
		convertToLower(list);

	}

	private static void convertToLower(List<String> list) {
		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext())
		{
			String color = iterator.next();
			iterator.set(color.toLowerCase());
		}

	}
	
	private static void reversePrint(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.printf("%nlist in reverse: ");
		
		
		while (iterator.hasPrevious())
		System.out.printf("%s ", iterator.previous());	
		

	}
	
	private static void removeItems(List<String> list, int start, int end) 
	{
		list.subList(start, end).clear(); // remove items

	}
	
	
}
// --------------------------------------------------------------------
/*
 * System.out.println("LinkedList:");
 * 
 * for (int count = 0; count < list.size(); count++) System.out.printf("%s ",
 * list.get(count));
 * 
 * System.out.printf("%ncolors2:");
 * 
 * for (int count = 0; count < list2.size(); count++) System.out.printf("%s ",
 * list2.get(count));
 * 
 * colors2(list, list2);
 * 
 * System.out.printf("%n%nLinkedList after calling the remove color method: %n"
 * );
 * 
 * for (String color: list) System.out.printf("%s ", color); }
 * 
 * private static void colors2(Collection<String> collection1,
 * Collection<String> collection2) { Iterator<String> iterator =
 * collection1.iterator();
 * 
 * while (iterator.hasNext()) { if (collection2.contains(iterator.next()))
 * iterator.remove(); } }
 * 
 * }
 */
