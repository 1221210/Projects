/*
 * Description: This program will create a  calculator to add ,mult, subtract, and divide as well as 3 custom functions,
 * Author Ian Selby
 * Date 2/3/2019
 */
import javax.swing.JFrame;
import static java.lang.Math.*;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class calc extends JFrame
{
	
	private JLabel oneL, twoL, finalL;
	private JTextField oneTF, twoTF, finalTF;
	private JButton exitB, addB, divideB, subB ,multB ,clear,squareB, rootB, rick, image;
	

	private AddButtonHandler abHandler; 
	private SubButtonHandler sBHandler;
	private MultButtonHandler mBHandler;
	private DivideButtonHandler dBHandler;
	private ExitButtonHandler exHandler;
	private ClearButtonHandler cBHandler;
	private SquareButtonHandler sqBHandler;
	private RootButtonHandler rootHandler;
	private RickRollButtonHandler rollHandler;
	private ImageButtonHandler iBHandler;
 
	private static final int WIDTH = 400;
 	private static final int HEIGHT =300;
 
 	public calc()
 	{
	
	oneL = new JLabel("Enter number one: " , SwingConstants.CENTER);
	twoL = new JLabel("Enter number two: " ,SwingConstants.CENTER);
	finalL = new JLabel("Final Score", SwingConstants.CENTER);
	
	//create new text fields
	oneTF = new JTextField(3);
	twoTF = new JTextField(3);
	finalTF = new JTextField(4);
	
	//create buttons
	addB = new JButton("+");
	abHandler = new AddButtonHandler();
	addB.addActionListener(abHandler);
	
	subB = new JButton("-");
	sBHandler = new SubButtonHandler();
	subB.addActionListener(sBHandler);
	
	multB = new JButton("*");
	mBHandler = new MultButtonHandler();
	multB.addActionListener(mBHandler);
	
	divideB = new JButton("/");
	dBHandler = new DivideButtonHandler();
	divideB.addActionListener(dBHandler);
	
	squareB = new JButton("^2");
	sqBHandler = new SquareButtonHandler();
	squareB.addActionListener(sqBHandler);
	
	rootB = new JButton("Root");
	rootHandler = new RootButtonHandler();
	rootB.addActionListener(rootHandler);
	
	exitB = new JButton("Exit");
	exHandler = new ExitButtonHandler();
    exitB.addActionListener(exHandler);
    
    clear = new JButton("Clear");
	cBHandler = new ClearButtonHandler();
	clear.addActionListener(cBHandler);
	
	rick = new JButton("No Press Plz");
	rollHandler = new RickRollButtonHandler();
	rick.addActionListener(rollHandler);
	
	image = new JButton("Image");
	iBHandler = new ImageButtonHandler();
	clear.addActionListener(iBHandler);
    
    setTitle("Calculator"); // sets title
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(6,3)); // makes calc demensions
    // makes buttons display
    pane.add(oneL); 
    pane.add(oneTF); 
    pane.add(addB);
    pane.add(twoL);
    pane.add(twoTF);
    pane.add(divideB);
    pane.add(finalL);  
    pane.add(finalTF);
    pane.add(subB);
    pane.add(exitB);
    pane.add(clear);
    pane.add(multB);
    pane.add(squareB);
    pane.add(rootB);
    pane.add(rick);
    pane.add(image);
    
    
    setSize(WIDTH,HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
 	}
 	
 	private class AddButtonHandler implements ActionListener // setup for adding 
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, two, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			two = Integer.parseInt(twoTF.getText());
 			
 			finalScore = (one + two);
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class SubButtonHandler implements ActionListener // setup for subtracting
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, two, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			two = Integer.parseInt(twoTF.getText());
 			
 			finalScore = (one - two);
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class MultButtonHandler implements ActionListener // setup for multiplying
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, two, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			two = Integer.parseInt(twoTF.getText());
 			
 			finalScore = (one * two);
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class ClearButtonHandler implements ActionListener // clear button setup
 	{
 		public void actionPerformed(ActionEvent e) 
 		{ 			
 			oneTF.setText("");
 			twoTF.setText("");
 			finalTF.setText("");
 		}
 	}
 	private class DivideButtonHandler implements ActionListener // divide button setup
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, two, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			two = Integer.parseInt(twoTF.getText());
 			
 			finalScore = (one / two);
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class RootButtonHandler implements ActionListener // square root setup
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			
 			finalScore = (int) sqrt(one);
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class SquareButtonHandler implements ActionListener // square function setup
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			int one, finalScore; 	
 			
 			one = Integer.parseInt(oneTF.getText());
 			
 			finalScore = (one * one );
 			finalTF.setText(""+String.format("%d", finalScore));

 		}
 	}
 	private class RickRollButtonHandler implements ActionListener // rick roll setup
 	{
 		public void actionPerformed(ActionEvent e)  // button rick rolls / plays music
 		{
 			 try {
 		         // Open an audio input stream.
 		         URL url = this.getClass().getClassLoader().getResource("RickRoll.wav");
 		         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
 		         // Gets sound clip.
 		         Clip clip = AudioSystem.getClip();
 		         // Opens audio clip and plays
 		         clip.open(audioIn);
 		         clip.start();
 			 } catch (Exception e1) {
                 System.out.println("Error Playing File: " + e1.getMessage() + " for " + "RickRoll.wav");
             }
 		 }
       }
 			   
 			
 	private class ImageButtonHandler implements ActionListener // CRAB RAVE setup
 	{
 		public void actionPerformed(ActionEvent e)  // button plays music
 		{
 			File file = new File( "thPRSAAJUF.jpg" );
 			try {
				Desktop.getDesktop().open( file );
			} catch (IOException e2) {
				System.out.println("Error " + file + " could not be found.");
			}

 		 }
       }
 			   

 	private class ExitButtonHandler implements ActionListener // exit button setup
 	{
 		public void actionPerformed(ActionEvent e) 
 		{
 			System.exit(0);
 		}
 	}
 	public static void main(String[] args)
 	{
 	calc bbcalc = new calc();
 	}
 	
}
