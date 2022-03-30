import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class Shapes2JPanel  extends JPanel
{

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		SecureRandom random = new SecureRandom();
		
		int[] xPoints = { 55 ,109, 83,78, 1}; // positon of points for shape
		int[] yPoints = { 45, 20, 72, 72, 36};
		
		
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath star = new GeneralPath();
		
		star.moveTo(xPoints[0], yPoints[0]);
		
		for (int count = 1; count < xPoints.length; count++)
			star.lineTo(xPoints[count], yPoints[count]);
		
		star.closePath();
		
		g2d.translate(150, 150);
		
		int controller = 3;

		for (int count = 1; count <= 20; count++)
		{
			g2d.rotate(Math.PI / 10.0);
			
		
			switch (controller%3) // hex value for colors
			{
				case 0:
				{
				    g2d.setColor( Color.decode("#BF0A30"));//red
				}   break;
				case 1:
				{
					g2d.setColor( Color.decode("#002868"));//blue
				}   break;
				case 2:
				{
					g2d.setColor( Color.decode("#FFFFFF"));//white
				}
			}
			
			controller++;

		g2d.fill(star);
		}
		
	}
}
