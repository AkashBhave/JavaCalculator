package Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Akash Bhave on 1/21/2016.
 */
public class javafx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator");
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void startProg() {
        System.out.println("Hello, this is JavaFX.");
    }
}
 
