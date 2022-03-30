/*
       cs2300
       name: Ian J. Selby
       700720666
       Assignment / Exercise: Homework 1
       */

package hw;


public class ListDemoHw {

	public static void printLinkedList(SLLNode<Integer> node) {
		// display all elements in the linked list
		while(node != null) {
			System.out.print(node.info + " ");
			node = node.next; // move to the next node
		}
		System.out.println();
	}
	static SLLNode<Integer> generateLL1() { // Working
		// Create/return a linked list that has {3, 4, 1, 2}
		// Note that this is not quite a useful function. Just for practice purpose
        SLLNode<Integer> node1 = new SLLNode<Integer>(3);
        SLLNode<Integer> node2 = new SLLNode<Integer>(4);
        SLLNode<Integer> node3 = new SLLNode<Integer>(1);
        SLLNode<Integer> node4 = new SLLNode<Integer>(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }
	static SLLNode<Integer> generateLL2(int a, int b) { // Working
		// Create/return a linked list that has {a, b, a, b}
		// eg) generateLL2(10,20) returns a list {10,20,10,20} // 20 30 20 30
		SLLNode<Integer> node1 = new SLLNode<Integer>(a); // 20
		SLLNode<Integer> node2 = new SLLNode<Integer>(b); // 30
		SLLNode<Integer> node3 = new SLLNode<Integer>(a); // 20
		SLLNode<Integer> node4 = new SLLNode<Integer>(b); // 30
		node1.next = node2; // [10] [x] (x is 20) |
		node3.next = node4; //
		node2.next = node3;
        return node1;
    }
	static SLLNode<Integer> generateLL_with_array(int[] nums) {
		// Create/return a linked list using the given int array
		// Return null if the array is empty (size is zero).
		// eg) generateLL3(new int[]{2,3,4}) returns a list {2,3,4}

		if (nums.length == 0) // if the array is empty it returns null
			return null;

		SLLNode<Integer> front  = null; // var to store array values at end (head)
		int i = nums.length -1;

		while(i>=0){
			SLLNode<Integer> array = new SLLNode<Integer>(nums[i]); // make it so array = each value of array when it runs
			array.next = front; // set a var to store the array value
			front = array;
			i--;
		}

//		for(int i = 0; i<nums.length; i++){ // while less than the length of the array // this does work but the array prints backwards.
//			SLLNode<Integer> array = new SLLNode<Integer>(nums[i]);
//			array.next = front; // set a var to store the array value
//			front = array;


        return front;
    }
	public static void attach(SLLNode<Integer> ls1, SLLNode<Integer> ls2) { // Working - remove unneeded code
		// Given two linked lists, attach the second list at the end of the first list
		// eg) Suppose ls1={1,2,3}, ls2={50,60} as lists, attach(ls1, ls2) makes ls1 = {1,2,3,50,60}
		// Assume ls1 is not empty.
		// Hint: You need to go to the last node of ls1 and make a connection from it to the ls2

		// SLLNode head = ls1; // variable to store ls1's value - delete me
		while(ls1.next != null) // loops while the next value in ls1 isnt null
			ls1 = ls1.next; // makes head equal the next value in ls1
		ls1.next = ls2; // makes ls1 equal to ls2 after the whole length of ls1 has been accounted for.
	}

	public static void main(String[] args) {
		System.out.print("Output for generateLL1: " );
		printLinkedList(generateLL1()); // 3 4 1 2

		System.out.print("Output for generateLL2: ");
		printLinkedList(generateLL2(20,30)); // 20 30 20 30

		System.out.print("Output for generateLLw/Array: \n");
		System.out.println("expected output: 2 7 6 4 3 ");
		printLinkedList(generateLL_with_array(new int[] {2,7,6,4,3})); // 2 7 6 4 3

		System.out.println("expected output: 6 3 4 5");
		printLinkedList(generateLL_with_array(new int[] {6,3,4,5})); // 2 3 4 5

		System.out.print("Output for attaching LL: ");
		SLLNode<Integer> ls1 = generateLL1();
		attach(ls1,generateLL2(30,20));
		printLinkedList(ls1); // 3 4 1 2 20 30 20 30
	}
}
