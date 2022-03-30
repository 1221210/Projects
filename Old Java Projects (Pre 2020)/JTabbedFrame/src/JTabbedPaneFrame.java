import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame  extends JFrame
{
	public JTabbedPaneFrame()
	{
		super("This is not");
		JTabbedPane jtp =  new JTabbedPane();
		
		// code for tab1
		JLabel label1 = new JLabel("panel one", SwingConstants.CENTER);
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		jtp.addTab("Tab One", null, panel1, "FirstPanel");
		panel1.setBackground(Color.BLACK);

		//code for tab2
		JLabel label2 = new JLabel("panel two", SwingConstants.CENTER);
		JPanel panel2 = new JPanel();
		panel2.add(label2);
		jtp.addTab("Tab Two", null, panel2, "SecondPanel");
		panel2.setBackground(Color.RED);
		
		//code for tab3
		JLabel label3 = new JLabel("panel three", SwingConstants.CENTER);
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add (new JButton ("Top"), BorderLayout.NORTH);
		panel3.add (new JButton ("Righty"), BorderLayout.EAST);
		panel3.add (new JButton ("Lefty"), BorderLayout.WEST);
		panel3.add (new JButton ("Bottom"), BorderLayout.SOUTH);
		panel3.add (label3, BorderLayout.CENTER);
		
		jtp.addTab("Tab Three", null, panel3, "THirdPanel");
		
		add(jtp);
	}
}
