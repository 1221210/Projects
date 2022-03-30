/*
 * Description: This program will display a bullseye that has changing random colors.
 * Author Ian Selby
 * Date 2/3/2019
 */

import java.awt.Color; 
import java.awt.Graphics;
import javax.swing.JPanel; 
import java.util.Random;

public class DrawBull extends JPanel
{ 
	
	
	public void paintComponent(Graphics g)
	{
		//draws face
		
		// variables for random color on band 1
		Random rand = new Random();
		float red = rand.nextFloat();
		float green = rand.nextFloat();
		float blue = rand.nextFloat();
		
		// variables for random color on band 2
		float red1 = rand.nextFloat();
		float green1 = rand.nextFloat();
		float blue1 = rand.nextFloat();
		
		g.setColor(new Color(red,green,blue)); // sets band color to rgb
		g.fillOval(20,20,160,160);
		g.setColor(new Color(red1,green1,blue1)); // rgb band set
		g.fillOval(40,40,120,120);
		g.setColor(new Color(red,green,blue)); //rgb set
		g.fillOval(60,60,80,80);
		g.setColor(new Color(red1,green1,blue1)); // rgb set
		g.fillOval(80,80,40,40);
		
		
		//g.fillOval(x, y, width, height);		
		
		
		
		
			
	
	}

}
