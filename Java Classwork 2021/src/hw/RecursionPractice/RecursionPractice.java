package hw.RecursionPractice;
/*
cs2300
name: Ian J. Selby
700720666
Assignment / Exercise: Homework Recursion
 */



public class RecursionPractice {
	public static void printAlphabetsHelper(char ch) // - Working Helper
	{
		if(ch != 'Z'){ // as long as not z
			System.out.print(ch); // print respective character
			printAlphabetsHelper((char)(ch + 1)); // ch = ch+1
		}
	}
	public static void printAlphabets() // - Working
	{
		// This is complete. Nothing to do in this function.
		// this is a wrapper function that simply rely on recursive function printAlphabetHelper(ch)
		// This prints "ABCDEFGHIJKLMNOPQRSTUVWXYZ" one character after another.
		printAlphabetsHelper('A');
	}

	public static boolean isLarger(int a, int b) // - Working
	{
		// Assume both a and b are non-negative integers.
		// NOT ALLOWED TO USE '<' or '>' operators, only '==' is allowed. Use recursion
		// if a is larger, then returns true
		// Or (including equal), returns false

		if(a != 0 && b != 0){
		isLarger(a - 1, b - 1);
		}
		if(a != 0 && b == 0) { // if a is >0 and b is 0
			System.out.println("The statement Value A is larger than Value B is: ");
			return true;
			}
		if(a == 0 && b != 0) { // if b is larger
			System.out.print("The statement Value B is larger than Value A is: ");
			return false;


		}
		return true;	// change this as needed
	}

	public static void printPrimeFactorsHelper(int n, int divisor) // Working, remove garbage code
	{
		// if n is divided by divisor, then print divisor
		//		and recursive call with (n/divisor, divisor)
		// if n is not divided by divisor, recursive call with (n, divisor+1)
		// stop when n is too small

		if(divisor <= n){ // if the divisor is less or equal to the number being factored

			if(n % divisor == 0){ // checks if divides cleanly (no decimal)
				System.out.print("{" + divisor + "}"); // prints divisor
				n /= divisor; // applies divisor to it
			}
			else{
				divisor++; // if it does not divide clean it increases the divisor till it can
			}
			printPrimeFactorsHelper(n, divisor); // recursive call

		}
	}
	public static void printPrimeFactors(int n) // Working
	{
		// This is complete. Nothing to do in this function.
		// This prints prime factors of n.
		// eg) printPrimeFactors(60) will print 2 2 3 5
		printPrimeFactorsHelper(n, 2);
		System.out.println();
	}

	public static int sumAll(SLLNode<Integer> node) // - Working
	{
		// sum all values in the list
		// eg) List 10,-5,10,20 --> sumAll() returns 35.

		if(node == null){
			return 0;
		}

		return (node.info + sumAll(node.next));

	}

	public static int findMax(SLLNode<Integer> node) // - Working but might be able to be simplified?
	{
		// returns the maximum value in the linked list
		int tempVal = node.info; // makes var to store node info
		if(node.next == null) // returns node info is next node is empty
			return tempVal;
		else {
			// This works?
			return Math.max(tempVal, findMax(node.next));
		}
	}

	public static void printLinkedListReverse(SLLNode<Integer> node) // Works?
	{
		// print the linked list contents in reverse order.
		// For example of a list A-->B-->C
		// this prints "C B A"
		if(node == null) // if empty return
			return;

		printLinkedListReverse(node.next); //makes list of node.next
		System.out.print(node.info + " "); // prints nodes
	}

	public static boolean subsetSum(SLLNode<Integer> node, int target) // how do I approach this?  - Not Close to working
	{
		// returns true if any of subset of numbers[] sum to target
		// For example, The list is {2,3,5,7,11}, target=12
		// a subset {5,7} sums to 12.
		// Another subset {2,3,7} sums to 12 too.
		// If no such subset exist, it returns false.

		if (node == null) // if empty
		return false;

		if (target == node.info){ // if the target is node info it returns true
			System.out.print(node.info + " ");
			return true;
		}
		if(subsetSum(node.next, target - node.info)){ // subtracts node info from target if it works cleanly
			System.out.print(node.info + " ");
			return true;
		}
		// all combos with current node have been tried so move on to next
		return subsetSum(node.next, target);// target not feasible

	}

	public static SLLNode<Integer> remove(SLLNode<Integer> node, int val) {
		// remove the first instance of 'val'
		// eg) List 10,-5,10,20,10,4 --> -5,10,20,10,4 after remove()

		// return if the given list is null (requirement met)
		// if node has info equal to val, skip this node and return whatever is returned from its recursive call
		// if node has info NOT equal to val, return this node with its connection to whatever is returned from its recursive call

		if (node == null) // if list is empty
				return null;

//		if (node != null) { // if list values exist, do
			if (node.info == val) {
				node = node.next; // sets node equal to
			}
			else
				node.next = remove(node.next, val);


//		}

		return node;
	}

	public static SLLNode<Integer> removeAll(SLLNode<Integer> node, int val)
	{ // requirement: worst-case time complexity O(N) while N is the number elements in the list

		// similar to remove() above.
		// remove all instances of 'val'
		// eg) List 10,-5,10,20,10,4 --> -5,20,4 after removeAll()

		if (node == null) // if list is empty
			return null;

//		if (node != null) { // if list values exist, do
			if (node.info == val) {
				node = removeAll(node.next, val); // sets node equal to
			}
			else
				node.next = removeAll(node.next, val);


//		}

		return node;
	}


	//-------------------------------------------------------------	//-------------------------------------------------------------
	// Following functions are here just to help testing
	//-------------------------------------------------------------	//-------------------------------------------------------------



	static SLLNode<Integer> buildLinkedList(int[] nums) { // O(nums.length)
		SLLNode<Integer> head = null;
		for(int i=nums.length-1;i>=0;i--) {
			SLLNode<Integer> newNode = new SLLNode<>(nums[i]);
			newNode.next = head;
			head = newNode;
		}
		return head;
	}
	static void printLinkedList(SLLNode<Integer> node) { // O(numElements)
		System.out.print("printLinkedList(): ");
		while( node != null) {
			System.out.print(node.info + " ");
			node = node.next;
		}
		System.out.println();
	}


	//-------------------------------------------------------------	//-------------------------------------------------------------
	// Main Function - Completion 9 / 9 Functioning as Intended I Think?
	//-------------------------------------------------------------	//-------------------------------------------------------------

	public static void main(String[] args) {
		System.out.println("Printing Alphabet: ");
		printAlphabets(); System.out.println("\n"); 																// Working
		System.out.println("Determining if 10 or 11 is larger: ");
		System.out.println(isLarger(10,11)); 																	// Working

		System.out.println("\nThe divisors are: ");
		printPrimeFactors(2*2*3*11*13*17); 																		// Working
		
		SLLNode<Integer> ls = buildLinkedList(new int[] {10,-5,10,20,10}); // 45 (sum)

		System.out.println();
		System.out.print("The list to be summed is: "); printLinkedList(ls);
		System.out.println("The total sum is " +sumAll(ls) + "\n");													// Working

		System.out.print("List to find max number: "); printLinkedList(ls);
		System.out.println("The Max number is "+findMax(ls)); 														// Working
		System.out.println();

		System.out.print("The list to be reversed is: "); printLinkedList(ls);
		printLinkedListReverse(ls); 																				// Working
		System.out.println("\n");

		SLLNode temp = buildLinkedList(new int[]{2,3,5,7,11}); // temp var to display whatever is being acted on
		System.out.print("The list for subSet sum is: "); printLinkedList(temp);
		System.out.print("Are there subsets that equal the target 12? : ");
		System.out.println(subsetSum(buildLinkedList(new int[]{2,3,5,7,11}), 13)); 								//


		System.out.print("\nThe list to have -5 removed is: "); printLinkedList(ls);
		ls = remove(ls, -5); System.out.print("List is ..."); printLinkedList(ls);								// Working


	 	ls = buildLinkedList(new int[] {10,40,-50,10,20,10,10,3,2,4,6,10}); // additional list for ls just to check it works

		System.out.print("\nThe list to have every number 10 removed is: "); printLinkedList(ls);
		ls = removeAll(ls, 10);	System.out.print("List is ..."); printLinkedList(ls); 							// Working
	}
}
