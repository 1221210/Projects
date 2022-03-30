package hw.MyLinkedList;
/*
 cs2300
 name: Ian J. Selby
 700720666
 Assignment / Exercise: MyLinkedList
 */
public class MyLinkedListDemo implements Cloneable{
	static void printArray(Object[] objs){		
		for(int i=0; i<objs.length;i++)		
			System.out.print(objs[i]+" ");	
		System.out.println();					
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MyLinkedList<Integer> mynums1 = new MyLinkedList<Integer>(new Integer[] {1, 2, 3, 4, 5});
		mynums1.printLinkedList();
		
		System.out.println("\ntesting get() - Working!"); // seems to work
		System.out.println(mynums1.get(0));
		System.out.println(mynums1.get(1));
		System.out.println(mynums1.get(4));
		System.out.println();



		System.out.println("testing set(idx,val) - Working!");
		mynums1.set(1,10); mynums1.printLinkedList();
		mynums1.set(4,20); mynums1.printLinkedList();
		mynums1.set(0,50); mynums1.printLinkedList();
		System.out.println();



		System.out.println("testing addAt(idx,val) - Working!");
		mynums1.addAt(3,300); mynums1.printLinkedList();
		mynums1.addAt(1,100); mynums1.printLinkedList();
		mynums1.addAt(0,200); mynums1.printLinkedList();
		System.out.println();

		System.out.println("testing MyLinkedList<E> clone() - Not Seperate Copies, therefore not working@@@!");
		MyLinkedList cloned = mynums1.clone();
		cloned.printLinkedList();
		System.out.println("Testing if actual copy by removing 100: ");
		cloned.remove(100);
		cloned.printLinkedList();
		System.out.println("Testing by adding random values: ");
		cloned.add(24); cloned.add(39);
		cloned.printLinkedList();
		System.out.println("Printing mynums1 (orignal linkedList) to make sure they are seperate copies: ");
		mynums1.printLinkedList();
		System.out.println();



		System.out.println("testing toArray() - Working!");
		printArray(mynums1.toArray());
		System.out.println();


		System.out.println("testing removeAll() - Note: This is optional for 5 points.");
		MyLinkedList<Integer> mynums2 = new MyLinkedList<Integer>(new Integer[] {1, 1, 2, 2, 2, 3, 1, 2, 3, 2, 2});
		System.out.print("The following is the original linkedList: ");
		mynums2.printLinkedList(); System.out.println();
		System.out.println("The following is the linkedList with all (2) removed: ");
		mynums2.removeAll(2); mynums2.printLinkedList();
		System.out.println("The following is the linkedList with (1) removed: ");
		mynums2.removeAll(1); mynums2.printLinkedList();
		System.out.println("The following is the linkedList with (3) removed: ");
		mynums2.removeAll(3); mynums2.printLinkedList();
		System.out.println();



	}
}
