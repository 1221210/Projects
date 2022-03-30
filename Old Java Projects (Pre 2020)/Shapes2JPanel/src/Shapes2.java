//This program will display a pentagon that has red white and blue colors, and 3 other shapes.
import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("Drawing Shapes in 2D"); // jframe for RWB 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
		frame.add(shapes2JPanel);
		frame.setBackground(Color.BLACK);
		frame.setSize(312, 330);
		frame.setVisible(true);
		
		JFrame frame1 = new JFrame("Drawing Shapes in 2D"); // jframe for RWB star
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StarsRWB starsRWB = new StarsRWB();
		frame1.add(starsRWB);
		frame1.setBackground(Color.BLACK);
		frame1.setSize(312, 330);
		frame1.setVisible(true);
		
		JFrame frame2 = new JFrame("Drawing Shapes in 2D"); // jframe for default example
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultBook defaultbook = new DefaultBook();
		frame2.add(defaultbook);
		frame2.setBackground(Color.BLACK);
		frame2.setSize(312, 330);
		frame2.setVisible(true);
		
		JFrame frame3 = new JFrame("Drawing Shapes in 2D"); // jframe for free shape
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Sandbox sandbox = new Sandbox();
		frame3.add(sandbox);
		frame3.setBackground(Color.BLACK);
		frame3.setSize(312, 330);
		frame3.setVisible(true);
		
		
	}
}
