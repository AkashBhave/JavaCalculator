package Calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Created by Akash Bhave on 1/21/2016.
 */
public class javafx2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox topField = new VBox();
        topField.setPadding(new Insets(10, 10, 0, 10)); //Insets: top/rigsdfasdfht/bottom/left
        TextField mainField = new TextField();
        mainField.setPrefHeight(50);
        mainField.setFont(Font.font("Roboto", 25));
        mainField.setAlignment(Pos.CENTER_RIGHT);

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(0,0,0,10));
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setAlignment(Pos.TOP_RIGHT);

        // BUTTON DECLARATIONS
        Button bAdd = new Button();
        bAdd.setText("+");
        bAdd.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bAdd.setPrefSize(50,50);
        GridPane.setConstraints(bAdd, 0, 1);

        Button bSubt = new Button();
        bSubt.setText("-");
        bSubt.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bSubt.setPrefSize(50,50);
        GridPane.setConstraints(bSubt, 0, 2);

        Button bMult = new Button();
        char multiplicationSign = '\u00D7';
        bMult.setText(Character.toString(multiplicationSign));
        bMult.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bMult.setPrefSize(50,50);
        GridPane.setConstraints(bMult, 0, 3);

        Button bDivd = new Button();
        char divisionSign = '\u00F7';
        bDivd.setText(Character.toString(divisionSign));
        bDivd.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bDivd.setPrefSize(50,50);
        GridPane.setConstraints(bDivd, 0, 4);

        Button bMod = new Button();
        bMod.setText("MOD");
        bMod.setFont(Font.font("Open Sans", 10));
        bMod.setPrefSize(50,30);
        GridPane.setConstraints(bMod, 0, 5);

        Button bEQUALS = new Button();
        bEQUALS.setStyle("-fx-base: #009d00");
        bEQUALS.setText("=");
        bEQUALS.setFont(Font.font(("Open Sans"), FontWeight.BOLD, 20));
        bEQUALS.setPrefSize(50, 140);
        GridPane.setConstraints(bEQUALS, 0, 6);

        layout.getChildren().addAll(mainField, bAdd, bSubt, bMult, bDivd, bMod, bEQUALS);
        topField.getChildren().addAll(mainField, layout);

        Scene scene = new Scene(topField, 500, 500);
        //scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
