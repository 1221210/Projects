
//Description: This program will determine wether or not a palindrome or not.
// Author: Ian Selby, Zach Toland
//Date 4/12/2019

import java.util.Scanner; // scanner import

public class PanendromesPjt {

	public static boolean isPal(String goof) {
		int x = 0;
		int y = goof.length() - 1;

		// all the letters are oopa loompa size
		goof = goof.toLowerCase();

		while (x <= y) {

			char getAtx = goof.charAt(x);
			char getAty = goof.charAt(y);

			// checks for symbols to the left
			if (!(getAtx >= 'a' && getAtx <= 'z'))
				x++;

			// checks for symbols to the right
			else if (!(getAty >= 'a' && getAty <= 'z'))
				y--;

			// counts the letters for passing grade
			else if (getAtx == getAty) {
				x++;
				y--;
				return true;
			}

			// if we didnt count rite
			else
				return false;
		}
		// palindrome.exe not found
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner for user to enter potential palindrome
		System.out.println("Do you have aibohphobia? Enter your potential palindrome :");
		String x = sc.nextLine();
		if (isPal(x))
			System.out.println(x + " Gorsh Maxie, you got yourself a palindrome"); // statements declaring if it is or
																					// is not a palindrome
		else
			System.out.println(x + " is not a palindrome!");
	}
}