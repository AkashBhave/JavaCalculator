package calculator;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by Akash Bhave on 1/21/2016.
 */
public class GUI extends Application {
    String TYPE = "";
    String VAL1 = "";
    String VAL2 = "";
    String currLabelVal = "";
    TextField mainField = new TextField();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        basFun basic = new basFun();

        Label cmplt = new Label("");
        cmplt.setPadding(new Insets(-5, 0, 5, 0));
        cmplt.setFont(Font.font("Open Sans", 10));

        VBox topField = new VBox();
        topField.setPadding(new Insets(10, 10, 0, 10)); //Insets: top/rigsdfasdfht/bottom/left
        topField.setAlignment(Pos.TOP_RIGHT);

        mainField.setPrefHeight(50);
        mainField.setFont(Font.font("Roboto", 25));
        mainField.setAlignment(Pos.CENTER_RIGHT);
        mainField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String[] allChars = mainField.getText().split("");
                //Ensures only numbers and
                for(String i : allChars) {
                    if ("1234567890.,".contains(i)) {
                        cmplt.setText("");
                        String lclCmpltText = currLabelVal;
                        cmplt.setText(lclCmpltText + newValue);
                    } else {
                        cmplt.setText(oldValue);
                        mainField.setText(oldValue);
                    }
                }
            }
        });

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(0,0,0,10));
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setAlignment(Pos.TOP_RIGHT);

        // ***** MAIN BUTTON DECLARATIONS *****
        Button bAdd = new Button();
        bAdd.setText("+");
        bAdd.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bAdd.setPrefSize(50,50);
        GridPane.setConstraints(bAdd, 4, 1);
        bAdd.setOnAction(e -> {
            setup("bAdd");
            String cmpltText = cmplt.getText() + " + ";
            mainField.clear();
            cmplt.setText(cmpltText);
            currLabelVal = cmpltText;
        });

        Button bSubt = new Button();
        bSubt.setText("-");
        bSubt.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bSubt.setPrefSize(50,50);
        GridPane.setConstraints(bSubt, 4, 2);
        bSubt.setOnAction(e -> {
            setup("bSubt");
            String cmpltText = cmplt.getText() + " - ";
            mainField.clear();
            cmplt.setText(cmpltText);
            currLabelVal = cmpltText;
        });

        Button bMult = new Button();
        char multiplicationSign = '\u00D7';
        bMult.setText(Character.toString(multiplicationSign));
        bMult.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bMult.setPrefSize(50,50);
        GridPane.setConstraints(bMult, 4, 3);
        bMult.setOnAction(e -> {
            setup("bMult");
            String cmpltText = cmplt.getText() + " " + Character.toString(multiplicationSign) + " ";
            mainField.clear();
            cmplt.setText(cmpltText);
            currLabelVal = cmpltText;
        });

        Button bDivd = new Button();
        char divisionSign = '\u00F7';
        bDivd.setText(Character.toString(divisionSign));
        bDivd.setFont(Font.font("Open Sans", FontWeight.BOLD, 20));
        bDivd.setPrefSize(50,50);
        GridPane.setConstraints(bDivd, 4, 4);
        bDivd.setOnAction(e -> {
            setup("bDivd");
            String cmpltText = cmplt.getText() + " " + Character.toString(divisionSign) + " ";
            mainField.clear();
            cmplt.setText(cmpltText);
            currLabelVal = cmpltText;
        });

        Button bMod = new Button();
        bMod.setText("MOD");
        bMod.setFont(Font.font("Open Sans", 10));
        bMod.setPrefSize(50,30);
        GridPane.setConstraints(bMod, 4, 5);
        bMod.setOnAction(e -> {
            setup("bMod");
            String cmpltText = cmplt.getText() + " % ";
            mainField.clear();
            cmplt.setText(cmpltText);
            currLabelVal = cmpltText;
        });


        Button bEQUALS = new Button();
        bEQUALS.setStyle("-fx-base: #009d00");
        bEQUALS.setText("=");
        bEQUALS.setFont(Font.font(("Open Sans"), FontWeight.BOLD, 20));
        bEQUALS.setPrefSize(50, 140);
        GridPane.setConstraints(bEQUALS, 4, 6);
        bEQUALS.setOnAction(e -> {
            currLabelVal = "";

            VAL2 = mainField.getText();
            double val1 = Double.parseDouble(VAL1);
            double val2 = Double.parseDouble(VAL2);
            if (TYPE.equals("bAdd")) {
                String result = Double.toString(basFun.add(val1, val2));
                mainField.setText(result);
            }
            else if(TYPE.equals("bSubt")) {
                String result = Double.toString(basFun.subt(val1, val2));
                mainField.setText(result);
            }
            else if(TYPE.equals("bMult")) {
                String result = Double.toString(basFun.mult(val1, val2));
                mainField.setText(result);
            }
            else if(TYPE.equals("bDivd")) {
                String result = Double.toString(basFun.divd(val1, val2));
                mainField.setText(result);
            }
            else if(TYPE.equals("bMod")) {
                String result = Double.toString(basFun.mod(val1, val2));
                mainField.setText(result);
            }
        });

        layout.getChildren().addAll(mainField, bAdd, bSubt, bMult, bDivd, bMod, bEQUALS);
        topField.getChildren().addAll(cmplt, mainField, layout);

        Scene scene = new Scene(topField, 500, 505);
        scene.getStylesheets().clear();
        scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean isGood(String input) {
        try {
            double val = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setup(String caller) {
        String val = mainField.getText();
        VAL1 = val;
        TYPE = caller;
        mainField.requestFocus();
    }

}
