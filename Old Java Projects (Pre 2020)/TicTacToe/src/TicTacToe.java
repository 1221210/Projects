/*
 * Author: Ian Selby 
 * Description: This program will utilize JFrame using javax.swing and GridLayout in order to make a tic-tac-toe game.
 * Date: 1/31/2019
 * Version: 1
 */

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class TicTacToe extends JFrame{
	JPanel p=new JPanel(); 
	XOButton buttons[]=new XOButton[9]; // sets max grid squares
	
	public static void main(String args[]) {
		new TicTacToe();
	}
	
	public TicTacToe() {
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

}

