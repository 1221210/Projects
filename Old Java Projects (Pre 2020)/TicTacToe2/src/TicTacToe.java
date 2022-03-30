import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 * a program for playing tic-tac-toe using a mix of common output and swing
 * 
 * @author s. and jedii
 * @version 021319
 */

public class TicTacToe  extends JFrame{
	JPanel p=new JPanel(); 
	XOButton buttons[]=new XOButton[9];
  // our tic-tac-toe grid
  private static char[][] grid = {
    {' ', ' ', ' '},
    {' ', ' ', ' '},
    {' ', ' ', ' '}
  };
  private static final char player1 = 'X';
  private static final char player2 = 'O';
  private static boolean player1turn = true;
  
  public static void main(String[] args) {
		new TicTacToe();
		
    // welcome the players to the game
    JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe! Choose someone "
            + "to go first! Player 1 will be X's, while Player 2 will be O's!");
    JOptionPane.showMessageDialog(null, "You will make your move by selecting"
            + " which row, then column you'd like to put your mark in.");
    
    while (!isWinner()) { // keep going through the loop if there's no winner
      grid(); // display the grid
      turn(); // let the player take their turn
      
      // if there's no winner and there's a tie, show the grid and tell them
      if (!isWinner() && isTie()) {
        grid();
        JOptionPane.showMessageDialog(null, "It looks to be a tie!");
        break;
      }
    }
  }
  public TicTacToe() { // tictactoeGUI
		super("TicTacToe"); // names window
		setSize(400,400); // sets size of window
		setResizable(false); // makes windows size unchangeable
		setDefaultCloseOperation(EXIT_ON_CLOSE); //exits program when windows is closed
		p.setLayout(new GridLayout(3,3)); // sets grid to be a 3x3
		for(int i=0; i<9;i++) { //as long as grid square is less than it will add a button to it
			buttons[i]=new XOButton();
			p.add(buttons[i]);
		}
		add(p);
		
		setVisible(true); // makes window visible
	}
  public static void grid() {
    System.out.println("\n   1   2   3"); // print column headings
    System.out.println("-------------"); // print separator
    for (int i = 0; i < 3; i++) { // for each row...
      System.out.print(i + 1); // print row headings
      for (int x = 0; x < 3; x++) { // for each column...
        System.out.printf("  %s|", grid[i][x]); // print value stored
      }
      System.out.println(); // print a new line
    }
  }
  
  public static void turn() {
    while (true) { // put this in a while loop so that if the player messes up picking a square, they can retry
      int turnRow, turnCol; // declare variables for storing the player's choice
      if (player1turn) { // if it's player 1's turn, use player 1 prompts...
        turnRow = Integer.parseInt(JOptionPane.showInputDialog("Player 1, it's"
                + " your turn. What row do you want to go in? (Input a number between 1 and 3)"));
        turnCol = Integer.parseInt(JOptionPane.showInputDialog("Player 1, it's"
                + " your turn. What column do you want to go in? (Input a number between 1 and 3)"));
      }
      else { // otherwise use player 2 prompts...
        turnRow = Integer.parseInt(JOptionPane.showInputDialog("Player 2, it's"
                + " your turn. What row do you want to go in? (Input a number between 1 and 3)"));
        turnCol = Integer.parseInt(JOptionPane.showInputDialog("Player 2, it's"
                + " your turn. What column do you want to go in? (Input a number between 1 and 3)"));
      }
      
      if (!checkSquare(turnRow, turnCol)) continue; // if the square wasn't available, let the player try again
      else break; // otherwise the turn is over
    }
    
    player1turn = !player1turn; // change who's turn it is
  }
  
  public static boolean checkSquare(int row, int column) {
    row -= 1; column -= 1; // subtract one from these values because players will enter 1-3
    // use a try-catch to make sure that the square isn't taken
    try {
      // if the square is taken, throw an error
      if (grid[row][column] == player1 || grid[row][column] == player2)
        throw new Exception();
      markSquare(row, column); // if not, mark the square
    }
    catch (Exception e) {
      JOptionPane.showMessageDialog(null, "You can't take a space that's already"
              + " filled or non-existent!");
      return false; // return that the square wasn't available
    }
    
    return true; // return that the square was available
  }
  
  public static void markSquare(int row, int column) {
    if (player1turn) { // if it's player 1's turn, mark the square with X
      grid[row][column] = player1;
      if (isWinner()) { // check to see if they won
        grid();
        JOptionPane.showMessageDialog(null, "Congratulations, Player 1! You won!");
      }
    }
    else { // otherwise, mark the square with O
      grid[row][column] = player2;
      if (isWinner()) { // check to see if they won
        grid();
        JOptionPane.showMessageDialog(null, "Congratulations, Player 2! You won!");
      }
    }
  }
  
  public static boolean isWinner() {
    int noOfMarks = 0; // use this to keep track of how many of that player's mark is in that arrangement
    char playersMark = player1turn ? 'X' : 'O'; // determine what mark to check depending on who's turn it is
    // check to see if anyone has won horizontally
    // check the first row
    for (int i = 0; i < 3; i++) // for each cell...
      if (grid[0][i] == playersMark)
        noOfMarks += 1; // ...if the player's mark is there, note it
    if (noOfMarks == 3) return true; // if there are 3, we have a winner
    // check the second row
    noOfMarks = 0; // reset the number of marks for accurate counting
    for (int i = 0; i < 3; i++)
      if (grid[1][i] == playersMark)
        noOfMarks += 1;
    if (noOfMarks == 3) return true;
    // check the third row
    noOfMarks = 0;
    for (int i = 0; i < 3; i++)
      if (grid[2][i] == playersMark)
        noOfMarks += 1;
    if (noOfMarks == 3) return true;
    
    // check to see if anyone has won vertically
    // check the first column
    noOfMarks = 0;
    for (int i = 0; i < 3; i++)
      if (grid[i][0] == playersMark)
        noOfMarks += 1;
    if (noOfMarks == 3) return true;
    // check the second column
    noOfMarks = 0;
    for (int i = 0; i < 3; i++)
      if (grid[i][1] == playersMark)
        noOfMarks += 1;
    if (noOfMarks == 3) return true;
    // check the third column
    noOfMarks = 0;
    for (int i = 0; i < 3; i++)
      if (grid[i][2] == playersMark)
        noOfMarks += 1;
    if (noOfMarks == 3) return true;
    
    // check to see if anyone has won horizontally
    // check top left to bottom right
    noOfMarks = 0;
    for (int i = 0; i < 3; i++)
      if (grid[i][i] == playersMark)
        noOfMarks += 1;
    if (noOfMarks == 3) return true;
    // check top right to bottom left
    noOfMarks = 0;
    if (grid[0][2] == playersMark) {
      noOfMarks++;
      if (grid[1][1] == playersMark) {
        noOfMarks++;
        if (grid[2][0] == playersMark)
          noOfMarks++;
      }
    }
    if (noOfMarks == 3) return true;
    
    return false;
  }
  
  public static boolean isTie() {
    int noOfMarks = 0; // use this to keep track of the amount of successful moves
    
    for (int i = 0; i < 3; i++) // for each cell in the grid...
      for (int x = 0; x < 3; x++)
        if (grid[i][x] == 'X' || grid[i][x] == 'O') // ...check if a move's there
          noOfMarks++;
    if (noOfMarks == 9) return true; // if 9 moves were made, return true
    
    return false;
  }
}


