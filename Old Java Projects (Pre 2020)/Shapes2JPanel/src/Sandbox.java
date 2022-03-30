import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class Sandbox  extends JPanel
{

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		SecureRandom random = new SecureRandom();
		
		int[] xPoints = { 55 ,109, 83, 78, 1}; // shape point values
		int[] yPoints = { 45, 20, 72, -72, 36};
		
		
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath star = new GeneralPath();
		
		star.moveTo(xPoints[0], yPoints[0]);
		
		for (int count = 1; count < xPoints.length; count++)
			star.lineTo(xPoints[count], yPoints[count]);
		
		star.closePath();
		
		g2d.translate(150, 150);
		
		int controller = 3;

		for (int count = 1; count <= 800; count++)
		{
			g2d.rotate(Math.PI / 400.0);
			
		
			switch (controller%3) // diff hex value colors
			{
				case 0:
				{
				    g2d.setColor( Color.decode("#000080"));//green
				}   break;
				case 1:
				{
					g2d.setColor( Color.decode("#8B008B"));
				}   break;
				case 2:
				{
					g2d.setColor( Color.decode("#4B0082"));
				}
			}
			
			controller++;

		g2d.fill(star);
		}
		
	}
}
