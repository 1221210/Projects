// This project will do hangman using string methods.
// By Ian Selby  3/36/2019
// Original Source: https://codereview.stackexchange.com/questions/171369/text-based-hangman-game-in-java 

import java.util.HashSet; 
import java.util.Scanner;
import java.util.Set;

public class HangmanGameV3 {

	public static void main(String[] args) {

		int attempts = 0; // variable for counting attempts

		Set<String> previousGuesses = new HashSet<>(); // sets previous guesses to new hashset ?

		Scanner input = new Scanner(System.in); // new scanner system input
		System.out.println("Enter your word to guess: "); // print statement 
		String wordToGuess = input.nextLine().toUpperCase();
		int length = wordToGuess.length(); // variable for word length

		char[] wordToGuessChars = wordToGuess.toCharArray(); // creates char array of string

		// creates and prints an array of chars with the same length as string
		char[] censor = wordToGuess.toCharArray();
		System.out.println("Your secret word is: ");

		for (int index = 0; index < length; index++) {
			censor[index] = '*'; // censors remaining letters
		}

		// Main loop to take guesses (is this while loop the ideal loop here?
		while (!String.valueOf(censor).equals(wordToGuess)) {

			// Initialize all variables in loop
			boolean correct = false; // required for if loops below/lets the user know if the letter is in the word
			// or not
			boolean repeated = false; // check if user guessed the same letter twice

			// prints the censored secret word
			for (int a = 0; a < length; a++) {
				System.out.print(censor[a]);
			}
			System.out.println();

			// asks user for guess, then stores guess in Char charguess and String
			// tempstring
			System.out.println("Type your guess: ");
			String currentGuess = input.next().toUpperCase().substring(0, 1);
			char currentGuessChar = currentGuess.charAt(0); // gets char data from scanner

			// checks if user already guessed the letter previously
			if (previousGuesses.contains(currentGuess)) {
				System.out.println("You already guessed this letter! Guess again. Your previous guesses were: "); // prints that you have already guessed
				System.out.println(previousGuesses.stream().reduce("", String::concat));  // concat string
				repeated = true;
			}

			previousGuesses.add(currentGuess); // adds current guess

			// if the guess is not a duplicated guess, checks if the guessed letter is in
			// the word
			if (!repeated) { 
				int times = 0; // number of times a letter is in the word
				for (int index = 0; index < length; index++) {
					if (wordToGuessChars[index] == currentGuessChar) {
						censor[index] = currentGuessChar; // replaces * with guessed letter in caps
						correct = true;
						times++;
					}
				}
				if (correct) { // as long as the letter selected is correct the following will occur.
					System.out.println("The letter " + currentGuessChar + " is in the secret word! There are " + times
							+ " " + currentGuessChar + " 's in the word. Revealing the letter(s): "); // prints stating the letter you have chosen is in the word
				} else {
					System.out.println("Sorry, the letter is not in the word. Your secret word:  "); // statement if you did not guess a letter
				}
				System.out.println(); // new line
			}
			attempts++; // increments attempts
		}
		System.out.println("You guessed the entire word " + wordToGuess.toUpperCase() + " correctly! It took you "
				+ attempts + " attempts!"); // prints winning statement for correctly guessing the word and it tells you how many attempts you have.
	}
}