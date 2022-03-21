package com.example.hopeworld;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class exoA extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER); //affiche le pane en position centree H et V  dans la scene
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Place nodes in the pane
        pane.add(new Label("Enter your password:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        Button login = new Button("Login");
        Button cancel = new Button("Cancel");
        pane.add(login, 1, 3);
        pane.add(cancel, 1, 3);
        GridPane.setHalignment(login, HPos.RIGHT);
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("More Complex layout GUI Exmeple"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
