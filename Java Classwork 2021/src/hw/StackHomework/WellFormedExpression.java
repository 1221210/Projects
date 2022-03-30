package hw.StackHomework;

public class WellFormedExpression {
	static boolean isWellFormed(String s) {
		/**** Create a stack for Characters ****/
		MyStack<Character> chStack = new MyStack<Character>(); // should make a new stack based on MyStack implementation?
		char ch;


		for(int i=0; i<s.length();i++) {
			ch = s.charAt(i);
		//	System.out.println(ch);
			/************************************************
			 if ch is a opening bracket, then push it to the stack (met?)

			 else if ch is a closing bracket
					if stack is empty, return false
					if stack.pop() does not match the closing bracket, return false (met?)
			 else ignore (do nothing)
			 
			 Assume that only three kinds of brackets are used - (), {}, []
			************************************************/
			char top = ' ';
			if ((ch == '(') || (ch == '{') || (ch == '[')){ // if statement for opening brackets
				chStack.push(ch);	// should push whatever ch is into the stack
			}
			else if (ch == ')'){
				if(chStack.isEmpty()) // if the stack is empty it returns false
					return false;
				if(chStack.pop() != '(') // if bracket does not match
					return false;
			}
			else if (ch == '}'){
				if(chStack.isEmpty()) // if the stack is empty it returns false
					return false;
				if(chStack.pop() != '{') // if bracket does not match
					return false;
			}
			else if (ch == ']'){
				if(chStack.isEmpty()) // if the stack is empty it returns false
					return false;
				if(chStack.pop() != '[') // if bracket does not match
					return false;
			}
//
		}

		if(chStack.isEmpty()) return true; // change this to your need.
		return false;
	}
	public static void main(String[] args) {
		// ------------------------------------------------------------------------------------------------------------
		// statements check if stack is functional
		// ------------------------------------------------------------------------------------------------------------

//		// Example of using MyStack for Character
//		MyStack<Character> st = new MyStack<Character>();
//		st.push('a'); // adds a to stack
//		st.push('b'); // adds b to stack
//		System.out.println(st.pop()); //
//		System.out.print("Checking if empty: ");
//		System.out.println(st.isEmpty());
//		System.out.println(st.pop() == 'a');

		// ------------------------------------------------------------------------------------------------------------

		System.out.println(isWellFormed("(ab)")); // good  ==  true
		System.out.println(isWellFormed("(1+2)[]{3* 4}")); // good
		System.out.println(isWellFormed("([]){}")); // good
		System.out.println(isWellFormed("(((())))")); // good
		System.out.println(isWellFormed("]")); // bad == false
		System.out.println(isWellFormed("( xx [xxx) xx]")); // bad
		System.out.println(isWellFormed("(()")); // bad  ------------ outputting as true
		System.out.println(isWellFormed("())")); // bad
	}
}
