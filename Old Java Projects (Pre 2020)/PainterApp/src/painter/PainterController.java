//Description: This project will display a gui using fxml allowing the user to paint.
// Ian Selby 2019
package painter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;


public class PainterController 
{
    private enum PenSize // These are the pen sizes
    {
        SMALL(2), // small pen 
        MEDIUM(4), // medium pen 
        LARGE(6),  // large  size pen
        XS(1); // extraSmall size
        
        
        private final int radius; //  sets int to the radius
        
        PenSize(int radius) {this.radius = radius;} // Constructor.
        
        public int getRadius() {return radius;}
    };
    
    // gets documents from the Painter file
    @FXML private RadioButton blackRadioButton;  // blackradiobutton
    @FXML private ToggleGroup colorToggleGroup; // togglegroup for color
    @FXML private RadioButton redRadioButton; // redradiobutton
    @FXML private RadioButton greenRadioButton; // greenradiobutton
    @FXML private RadioButton blueRadioButton; // blueradiobutton
    @FXML private RadioButton blueVioletRadioButton; // blueVioletradiobutton
    @FXML private RadioButton blanchedAlmondRadioButton; // blanchedAlmond radio button
    @FXML private RadioButton chocolateRadioButton; // chocolate radio button
    @FXML private RadioButton smallRadioButton; //  small radio button
    @FXML private ToggleGroup sizeToggleGroup; //  size toggle radio button
    @FXML private RadioButton mediumRadioButton; //  medium radio button
    @FXML private RadioButton largeRadioButton; //   large radio button
    @FXML private RadioButton XSRadioButton; // XS radio button
    @FXML private Pane drawingAreaPane; //  drawing pane
    
    //  variables for painter brush
    private PenSize radius = PenSize.SMALL; // Radius of Circle.
    private Paint brushColor = Color.BLACK; // Drawing Color.
    
    //  initailizes colors and sizes for radiobuttons
    public void initialize()
    {
        
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        greenRadioButton.setUserData(Color.GREEN);
        blueRadioButton.setUserData(Color.BLUE);
        blueVioletRadioButton.setUserData(Color.BLUEVIOLET);
        blanchedAlmondRadioButton.setUserData(Color.BLANCHEDALMOND);
        chocolateRadioButton.setUserData(Color.CHOCOLATE);
        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);
        XSRadioButton.setUserData(PenSize.XS); // extra small button
    }
    
    // Handles Clear Button
    @FXML void clearButtonPressed(ActionEvent event) 
    {
        drawingAreaPane.getChildren().clear(); // Clear 
    }
    
    //This handles ActionEvents for  the colorRadioButtons.
    @FXML void colorRadioButtonSelected(ActionEvent event) 
    {
        // User data for each color RadioButton is the corresponding color.
        brushColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();
    }
    
    //This handles MouseEvent onMouseDragged for  the drawingArea.
    @FXML void drawingAreaMouseDragged(MouseEvent event) 
    {
        Circle newCircle = new Circle(event.getX(), event.getY(),
           radius.getRadius(), brushColor);
        drawingAreaPane.getChildren().add(newCircle);
    }
    
    // Handles  RadioButton's size ActionEvents.
    @FXML void sizeRadioButtonSelected(ActionEvent event) 
    {
        // User data for each size RadioButton is the corresponding PenSize.
        radius = 
           (PenSize) sizeToggleGroup.getSelectedToggle().getUserData();
    }
    
    // Handles Undo Button
    @FXML void undoButtonPressed(ActionEvent event) 
    {
        int count = drawingAreaPane.getChildren().size();
        
        // removes most recent addition 
        if(count > 0)
        {
            drawingAreaPane.getChildren().remove(count - 1);
        }
    }
}