import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{

		private JTextField textField;
		private JCheckBox boldBox;
		private JCheckBox italicBox;
		
		//JFrame constructor adds JCheckBoxes to JFrame
		public CheckBoxFrame()
		{
			super("JCheckBox Test");
			setLayout (new FlowLayout());
			
			textField = new JTextField ("Illuminati Confirmed Bois");
			textField.setFont(new Font("TimesRoman", Font.PLAIN, 140));
			add(textField);
			
			boldBox = new JCheckBox("Bold");
			italicBox = new JCheckBox("Italic");
			add (italicBox);
			add (boldBox);
			
			CheckBoxHandler handler =  new CheckBoxHandler();
			
		    boldBox.addItemListener(handler);
		    italicBox.addItemListener(handler);
		    
		}
		private class CheckBoxHandler implements ItemListener
		{
			@Override
			public void itemStateChanged(ItemEvent event)
			{
				Font font = null;
				
				if( boldBox.isSelected() && italicBox.isSelected())
					font = new Font ("TimesRoman", Font.BOLD + Font.ITALIC , 140);
				else if(boldBox.isSelected())
					font = new Font ("TimesRoman", Font.BOLD , 140);
				else if (italicBox.isSelected())
					font = new Font ("TimesRoman", Font.ITALIC , 140);
				else 
					font = new Font ("TimesRoman", Font.PLAIN , 140);

				
				textField.setFont(font); // sets or resets the font to the user selection
			}
		}
}

