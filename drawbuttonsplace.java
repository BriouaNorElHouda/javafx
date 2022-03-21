package com.example.hopeworld;



import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;




/**
  @author NOR
 */
public class exoC extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText(" Accélerer ");
        Button btn2 = new Button();
        btn2.setText(" Ralentir ");
        VBox vbox = new VBox(2);
        HBox hbox1 = new HBox(5);
        VBox vboxa = new VBox(10);
        vboxa.setPadding(new Insets(00));
        TextField txtfield = new TextField();
        txtfield.setPrefSize(120,100);
        Label txt = new Label("Ceci est ma future zone de dessin");
        vboxa.getChildren().addAll(txt,txtfield);


        VBox vboxb = new VBox(20);
        HBox hboxb1 = new HBox(0);
        HBox hboxb2 = new HBox(60);
        HBox hboxb3 = new HBox(0);
        // Short Butto

        Button button1 = new Button("ADroite");

        hboxb2.getChildren().add(button1);


        // Short Button
        Button button2 = new Button("AGauche");
        hboxb2.getChildren().add(button2);

        // Button
        Button Button3 = new Button("ENhaut");

        hboxb1.getChildren().add(Button3);


        Button button4 = new Button("ENbas");

        hboxb3.getChildren().add(button4);
        hboxb1.setAlignment(Pos.CENTER);
        hboxb3.setAlignment(Pos.CENTER);
        button2.setAlignment(Pos.BASELINE_LEFT);
        button1.setAlignment(Pos.BASELINE_RIGHT);
        vboxb.getChildren().addAll(hboxb1,hboxb2,hboxb3);
        HBox hbox2 = new HBox(30);
        hbox2.setAlignment(Pos.CENTER);
        hbox1.getChildren().addAll(vboxa,vboxb);
        hbox2.getChildren().addAll(btn1,btn2);
        vbox.getChildren().addAll(hbox1,hbox2);
        StackPane root = new StackPane();
        root.getChildren().add(vbox);



        Scene scene = new Scene(root);

        primaryStage.setTitle("Jeu_v1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
