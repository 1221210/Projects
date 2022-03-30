package hw.MyLinkedList;

/*
 cs2300
 name: Ian J. Selby
 700720666
 Assignment / Exercise: myLinkedList
 */

public class MyLinkedList<E> {
	SLLNode<E> head = null;
	public MyLinkedList() {} // O(1)
	public MyLinkedList(E[] elements) { // O(elements.length)
		for(int i=elements.length-1;i>=0;i--)
			add(elements[i]);
	}
	public void printLinkedList() { // T(N) = O(N)
		System.out.print("printLinkedList(): ");
		SLLNode<E> node = head;
		while(node != null) {
			System.out.print(node.info + " ");
			node = node.next; // move to the next node
		}	
		System.out.println();
	}
	public void add(E e) { // T(N) = O(1)
		SLLNode<E> newNode = new SLLNode<E>(e);
		newNode.next = head;
		head = newNode;
	}
	public SLLNode<E> search(E e){// best-case: O(1)	worst-case: O(N)
		SLLNode<E> node = head;
		while(node != null) {
			if(node.info.equals(e)) // check if node.info is equal to 'e'
				return node;
			node = node.next;
		}
		return null;	
	}
	public int remove(E e) { // best-case: O(1), worst-case: O(N)
		// if e is found, remove the node and return 1
		// if e is not found, return 0
		SLLNode<E> node = head;
		SLLNode<E> prev = null;
		while(node != null) {
			if(node.info.equals(e)) {
				if(prev == null) 
					head = node.next;
				else	
					prev.next = node.next;
				return 1;
			}
			prev = node;
			node = node.next;
		}
		return 0;
	}
	public int size() { // O(N)
		// return the number of elements in the linked list
		SLLNode<E> node = head;
		int count=0;
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;			
	}
	public void repeatEach() { // O(N)
		// duplicate each element in the list
		// eg) this list has [10, 20, 30] and this method change it to [10, 10, 20, 20, 30, 30];
		SLLNode<E> node = head;
		SLLNode<E> newNode;
		
		while(node != null) {
			newNode = new SLLNode<E>(node.info);
			newNode.next = node.next;
			node.next = newNode;
			node = newNode.next; //node.next.next;
		}
	}
	public void clear() { // O(1)
		head = null;
	}
	public boolean isEmpty() { return head == null;}; // O(1)
	public boolean isFull() { return false; }	// O(1)


	// ---------------------------------------------------------------------------------------------------------------

	// Start of Assignment																       // Status:

	// ---------------------------------------------------------------------------------------------------------------


	public E get(int idx) { // O(idx) 															// works
		// return the value at the given index
		// eg) For a list {10,20,30,40}, get(2) will return 30
		// Assume that idx is valid, i.e. 0<= idx < size()
		int count = 0;
		SLLNode<E> headCopy = head;

		while(headCopy != null) { // cycles thru the list
			if (count == idx)
				return headCopy.info; // returns info of item found
			count++;
			headCopy = headCopy.next;
		}

		return null;
	}
	public void set(int idx, E val) { // O(idx)                                                 //working
		// set the node's value at the given index with given value
		// eg) For a list {10,20,30,40}, set(2,100) will change it into {10,20,100,40}
		// Assume that idx is valid, i.e. 0<= idx < size()
		int count = 0;
		SLLNode<E> headCopy = head;
		while(headCopy != null) { // cycles thru the list
			if (count == idx)
				//headCopy.info = (E) new SLLNode<E>(val);
				headCopy.info = val;

			count++;
			headCopy = headCopy.next;
		}
	}
	public void addAt(int idx, E val) { // O(idx) 												// Works
		// insert a node of given value at the given index while pushing some nodes to the right
		// eg) For a list {10,20,30,40}, addAt(2,100) will change it into {10,20,100,30,40}
		// Hint: You may want to stop at idx-1 position to make connections.
		// Assume that idx is valid, i.e. 0<= idx <= size()
		SLLNode node = new SLLNode(null);
		node.info = val; // sets node's stored value to the one that will be inserted
		node.next = null; // makes the node.next null

		SLLNode headNode = head; // makes a head copy
		int i = 0;
		while(i<idx-1){ // loops thru index
			i++;
			headNode = headNode.next; //
		}
		node.next = headNode.next;
		headNode.next = node;
	}



	public E[] toArray() { // O(numElements)
		// return an array that contains all the elements(numbers) in the list				// Working

		SLLNode headCopy = head;
		Integer count = size(); // makes a counter equal to the size function's returned length of the list
		int i = 0;
		Integer[]arrayCopy = new Integer[count];
		while(headCopy.next != null){ // while the list isnt empty it fulls a array with the information from the node
			arrayCopy[i] = (int) headCopy.info;
			headCopy = headCopy.next;
			i++;
		if(headCopy.next == null) // fills last value of given array since the last value of the array points to null in headCopy
			arrayCopy[i] = (int) headCopy.info;
		}

		return (E[]) arrayCopy;
	}
	//@Override
	public MyLinkedList<E> clone() throws CloneNotSupportedException{ // O(numElements)                                   // Working
		// return a copy of 'this' object. 
		// Any change made to the copy should be independent of this object.
		// MyLinkedList<E> headCopy = (MyLinkedList<E>) super.clone();


		SLLNode headCopy = head; // make a copy of head;
		SLLNode temp = new SLLNode(headCopy.info);
		MyLinkedList<E> cloneLL = new MyLinkedList<E>();
		cloneLL.head = temp;
		headCopy = headCopy.next;

		SLLNode temp2;

		while(headCopy != null){
			 temp2 = new SLLNode(headCopy.info);
			 temp.next = temp2;
			 temp = temp.next;
			 headCopy = headCopy.next;
		}
		return cloneLL;
	}
	public void removeAll(E val) { // O(numElements)                                       //Optional
		// remove all the nodes with given value
		// This is a bonus problem (+5 points). 
		// It is hard. Don't spend too much time on this. You don't lose points if you don't do this.
		// if e is found, remove the node and return 1
		// if e is not found, return 0
		SLLNode<E> tempHead = head;
		SLLNode<E> prev = null;

		while(tempHead != null && tempHead.info == val) { // checks if head is val to be deleted
			head = tempHead.next;
			tempHead = head;
		}

		while(tempHead != null) {

			while(tempHead != null && tempHead.info != val) { // checks for value to delete when not the head value
				prev = tempHead;
				tempHead = tempHead.next;
			}
			if(tempHead == null) // case for if the value is not found
				return;

			prev.next = tempHead.next; // disconnect node from list

			tempHead = prev.next;

		}
	}
}
