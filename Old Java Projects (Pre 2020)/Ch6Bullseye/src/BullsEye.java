/*
 * Description: This program will display shapes in a pattern for fun
 * Author Ian Selby
 * Date 3/7/2019
 */
import java.awt.Color;
import javax.swing.JFrame;

public class BullsEye {
	
	public static void main(String[] args) {
		
		JFrame frame =
			new JFrame("Drawing shapes and stuff for fun.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LinesRectsOvalsJPanel linesRectsOvalsJPanel = 
			new LinesRectsOvalsJPanel();
		linesRectsOvalsJPanel.setBackground(Color.BLACK);
		frame.add(linesRectsOvalsJPanel);
		frame.setSize(600,600);
		frame.setVisible(true); // sets window to visible
	}

}
