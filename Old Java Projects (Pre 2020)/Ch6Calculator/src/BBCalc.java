/*
 * Description: This program will create a special basketball calculator to add up the nbr of 3 point shots,
 * 2 point shots and free throws
 * Author Ian Selby
 * Date 2/3/2019
 */
import javax.swing.JFrame;
import static java.lang.Math.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

public class BBCalc extends JFrame
{
	
	private JLabel headerL, header2L, oneL, twoL, threeL, finalL;
	private JTextField oneTF, twoTF, threeTF, finalTF;
	private JButton exitB, addB;
	

	private AddButtonHandler abHandler;
	private ExitButtonHandler exHandler;
 
	private static final int WIDTH = 400;
 	private static final int HEIGHT =300;
 
 	public BBCalc()
 	{
	
 	headerL = new JLabel("BB Score Calc", SwingConstants.CENTER); 
 	header2L = new JLabel("     ", SwingConstants.CENTER); 
	oneL = new JLabel("Enter # of free throws: " , SwingConstants.CENTER);
	twoL = new JLabel("Enter # of 2 point shots: " ,SwingConstants.CENTER);
	threeL = new JLabel("Enter # of 3 point shots: " ,SwingConstants.CENTER);
	finalL = new JLabel("Final Score", SwingConstants.RIGHT);
	
	//create new text fields
	oneTF = new JTextField(3);
	twoTF = new JTextField(3);
	threeTF = new JTextField(3);
	finalTF = new JTextField(4);
	
	//create buttons
	addB = new JButton("+");
	abHandler = new AddButtonHandler();
	addB.addActionListener(abHandler);
	
	exitB = new JButton("Exit");
	exHandler = new ExitButtonHandler();
    exitB.addActionListener(exHandler);
    
    setTitle("BasketBall Score Calc");
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(6,2));
    
    pane.add(headerL);
    pane.add(header2L);
    pane.add(oneL); 
    pane.add(oneTF); 
    pane.add(twoL);
    pane.add(twoTF);
    pane.add(threeL);   
    pane.add(threeTF);
    pane.add(finalL);   
    pane.add(finalTF);
    pane.add(addB);
    pane.add(exitB);
    
    setSize(WIDTH,HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
 	}
 	
 	private class AddButtonHandler implements ActionListener
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, two, three, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			two = Integer.parseInt(oneTF.getText());
 			three = Integer.parseInt(oneTF.getText());
 			
 			finalScore = (one * 1) + (two * 2) + (three * 3);
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class ExitButtonHandler implements ActionListener
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			System.exit(0);
 		}
 	}
 	public static void main(String[] args)
 	{
 		BBCalc bbcalc = new BBCalc();
 	}
 	
}
