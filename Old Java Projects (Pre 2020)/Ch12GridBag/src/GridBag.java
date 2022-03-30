
/*
 * GridBagLayoutDemo.java requires no other files except java.awt.
 * Description : The GridBagLayout class is a flexible layout manager that aligns components vertically and horizontally,
 * without requiring that the components be of the same size. Each GridBagLayout object maintains a dynamic,
 * rectangular grid of cells, with each component occupying one or more cells, called its display area.
 */
 
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class GridBag {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = true;
 
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
        JButton button;
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    if (shouldFill) {
    //natural height, maximum width
    c.fill = GridBagConstraints.HORIZONTAL;
    }
 
    button = new JButton("Button 1");  
    if (shouldWeightX) {
    c.weightx = 0.5; // enables button 1 scaling
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 4; // effects button position
    c.gridy = 0; // effects button position
    pane.add(button, c);
 
    button = new JButton("Button 2");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5; // effects button scale rate
    c.gridx = 1;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Button 3");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 2;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Long-Named Button 4");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 0;      //make this component tall
    c.weightx = 0.0;
    c.gridwidth = 2; // makes bottom 3 columns wide
    c.gridx = 0;
    c.gridy = 1;
    pane.add(button, c);
    
    button = new JButton("Slightly Taller Button 4 Right");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 40;      //make this component tall
    c.weightx = 0.0;
    c.gridwidth = 1; // makes bottom 3 columns wide
    c.gridx = 2; //makes position right side
    c.gridy = 1;
    pane.add(button, c);
 
    button = new JButton("5");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 0;       //reset to default
    c.weighty = 1.0;   //request any extra vertical space
    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
    c.insets = new Insets(10,0,0,0);  //top padding
    c.gridx = 1;       //aligned with button 2
    c.gridwidth = 2;   //2 columns wide
    c.gridy = 2;       //third row
    pane.add(button, c);
    
    
    }
 
    /**
     * Creates the GUI and show it. 
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}