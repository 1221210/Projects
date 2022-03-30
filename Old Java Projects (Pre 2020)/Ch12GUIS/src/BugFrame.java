/**
* Ian Selby 
* This program will utilize GUI and use icons.
*/
import java.awt.FlowLayout; // specifies how the objects are arranged
import javax.swing.JFrame; // provides basic window management features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class BugFrame extends JFrame
{

	private final JLabel label1;
	
	public BugFrame() // constructor
	{
		super("Bug Window");
		
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label with text");
		label1.setToolTipText("Tool tip for label 1");
		add(label1);
		
		Icon head = new ImageIcon(getClass().getResource("head.png"));
		
		JLabel label2 = new JLabel("Label2 with text", head, SwingConstants.LEFT);
		label2.setToolTipText("Another tool tip with text");
		add(label2);
	}
	
	
	
	
	
	
}
