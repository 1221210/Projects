package application;
	// main app class that loads and displays the tip calc interface.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class TipCalculator extends Application {
	@Override
	public void start(Stage stage) throws Exception 
	{
	Parent root =
			FXMLLoader.load(getClass().getResource("Test.fxml"));
	
	
	Scene scene = new Scene(root); //attach scene graph to scene
	stage.setTitle("Tip Calculator"); // displayed in window's title bar
	stage.setScene(scene);// attach scene to stage
	stage.show();//displays the stage
	
	}
	
	public static void main(String[] args) {
		// create a tipcalculator obj and call start method
		launch(args);
	}
}
