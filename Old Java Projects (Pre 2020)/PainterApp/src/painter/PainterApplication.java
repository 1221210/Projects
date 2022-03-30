//Description: This project will display a gui using fxml allowing the user to paint. 
//Ian Selby 4/6/2019 
package painter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PainterApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Painter2.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Painter"); // title to be displayed.
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
