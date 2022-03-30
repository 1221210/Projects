import java.util.Collection;
import java.util.List;	
import java.util.ArrayList;
import java.util.Iterator;

public class BGS16 {

	public static void main(String[] args) 
	{
		String[] colors = {"GREEN", "BLUE", "RED", "PURPLE", "ORANGE", "GREY"};
		List<String> list = new ArrayList<String>();
		
		for (String color : colors)
			list.add(color); //adds all of the color elements in the array in to this list
		
		String[] removeColors = { "BLUE", "GREY", "PURPLE"};
		List<String> removeList = new ArrayList<String>();
		
		for (String color : removeColors)
			removeList.add(color); //removes all of the color elements in the array in to this list
		
		System.out.println("ArrayList:");
		
		for (int count = 0; count < list.size(); count++)
			System.out.printf("%s ", list.get(count));
		
		System.out.printf("%nRemoveList:");
		
		for (int count = 0; count < removeList.size(); count++)
			System.out.printf("%s ", removeList.get(count));
		
		removeColors(list, removeList);
		
		System.out.printf("%n%nArrayList after calling the remove color method: %n");
		
		for (String color: list)
		System.out.printf("%s ", color);
	}
	
	private static void removeColors(Collection<String> collection1, Collection<String> collection2)
	{
		Iterator<String> iterator = collection1.iterator();
		
		while (iterator.hasNext())
		{
		if (collection2.contains(iterator.next()))
			iterator.remove();
		}
	}

}
