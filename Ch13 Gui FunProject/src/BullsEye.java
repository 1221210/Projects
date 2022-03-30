/*
 * Description: This program will display a bullseye that has changing random colors.
 * Author Ian Selby
 * Date 2/3/2019
 */

import javax.swing.JFrame;

public class BullsEye {
	
	public static void main(String[] args) {
		
		DrawBull panel = new DrawBull();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230,250);
		application.setVisible(true); // sets window to visible
	}

}
