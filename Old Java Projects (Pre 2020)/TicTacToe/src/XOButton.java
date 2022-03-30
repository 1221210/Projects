/*
 * Author: Ian Selby
 * Description: This part of the program will setup the buttons for the tic-tac-toe.
 * Date: 1/31/2019
 * Version: 1
 */

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener{
	ImageIcon X,O;
	byte value=0;
	/*
	 * 0:nothing
	 * 1:X
	 * 2:O
	 */
	
	public XOButton() {
		X=new ImageIcon(this.getClass().getResource("head.png")); // sets the image for x to be whatever is in the parenthesis 
		O=new ImageIcon(this.getClass().getResource("orang.jpg")); // same as above except it is for o instead
		this.addActionListener(this); // ensures it triggers on button press
	}
	
	public void actionPerformed(ActionEvent e) {
		value++;
		value%=3;
		switch(value) {
		case 0: // initially it displays nothing
			setIcon(null);
			break;
		case 1: // if button press = 1 times it makes X icon or whatever the user's image is for x
			setIcon(X);
			break;
		case 2: // if button press = 2 times it makes circle or whatever user's image is set to
			setIcon(O); 
			break;
		}
	}
}
