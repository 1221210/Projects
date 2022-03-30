/*
 * Description: This program will display a bullseye that has changing random colors.
 * Author Ian Selby
 * Date 2/3/2019
 */

import java.awt.Color; 
import java.awt.Graphics;
import javax.swing.JPanel; 
import java.util.Random;

public class LinesRectsOvalsJPanel extends JPanel
{ 
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.RED);
		g.drawLine(5, 30, 380, 30);
		
		g.setColor(Color.BLUE);
		g.drawRect(5, 40, 90, 55);
		g.fillRect(100, 40, 90, 55);
		
		g.setColor(Color.CYAN);
		g.fillRoundRect(195,40,90,55,50,50);
		g.drawRoundRect(290, 40, 90, 55, 20, 20);
		
		g.setColor(Color.GREEN);
		g.draw3DRect(5, 100, 90, 55, true);
		g.fill3DRect(100, 100, 90, 55, false);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
		
		g.setColor(Color.MAGENTA);
	//	g.drawOval(x, y, width, height);
		g.drawOval(295, 100, 90, 100);
		g.fillOval(290, 100, 90, 100);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(250, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
			
	}

}
