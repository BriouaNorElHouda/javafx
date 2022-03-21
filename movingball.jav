package com.example.hopeworld;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 *
 * @author NOR
 */
public class balle extends Application {
        private CirclePane circleePane = new CirclePane();


        public void start(Stage primaryStage) {
                // Hold four buttons in an HBox
                HBox hBox = new HBox();
                hBox.setSpacing(10);
                hBox.setAlignment(Pos.CENTER);
                Button btgch = new Button("Gauche");
                Button btdrt = new Button("Droite");
                Button btht = new Button("Haut");
                Button btbas = new Button("Bas");
                hBox.getChildren().add(btgch);
                hBox.getChildren().add(btdrt);
                hBox.getChildren().add(btht);
                hBox.getChildren().add(btbas);

                // Create and register the handler

                btgch .setOnAction(new toleft());
                btdrt.setOnAction(new toright());
                btht.setOnAction(new up());
                btbas.setOnAction(new down());


                BorderPane borderPane = new BorderPane();
                borderPane.setCenter(circleePane);
                borderPane.setBottom(hBox);
                BorderPane.setAlignment(hBox, Pos.CENTER);

                // Create a scene and place it in the stage
                Scene scene = new Scene(borderPane, 400, 250);
                primaryStage.setTitle("balle-mobile"); // Set the stage title
                primaryStage.setScene(scene); // Place the scene in the stage
                primaryStage.show(); // Display the stage
        }

        class toleft implements EventHandler<ActionEvent> {
                @Override // Override the handle method
                public void handle(ActionEvent e) {
                        circleePane.left();
                }
        }

        class toright implements EventHandler<ActionEvent> {
                @Override // Override the handle method
                public void handle(ActionEvent e) {
                        circleePane.right();
                }
        }

        class up implements EventHandler<ActionEvent> {
                @Override // Override the handle method
                public void handle(ActionEvent e) {
                        circleePane.up();
                }
        }

        class down implements EventHandler<ActionEvent> {
                @Override // Override the handle method
                public void handle(ActionEvent e) {
                        circleePane.down();

                }
        }


        public static void main(String[] args) {
                launch(args);
        }}
class CirclePane extends StackPane {
        private Circle ciircle = new Circle(50);

        private double x=0;
        private double y=0;

        public CirclePane() {
                getChildren().add(ciircle);
                ciircle.setStroke(Color.GREEN);
                ciircle.setFill(Color.WHITE);
        }

        public void up(){

                ciircle.setCenterY(ciircle.getCenterY( ) );
                y =ciircle.getCenterY() -10 +y ;
                ciircle.setTranslateY(y);

        }
        public void down(){
                ciircle.setCenterY(ciircle.getCenterY( ) );
                y =ciircle.getCenterY() +10 +y;
                ciircle.setTranslateY(y);

        }
        public void left(){
                ciircle.setCenterY(ciircle.getCenterY( ) );
                x =ciircle.getCenterX() -10 +x;
                ciircle.setTranslateX(x);

        }
        public void right(){
                ciircle.setCenterY(ciircle.getCenterY( ) );
                x =ciircle.getCenterY() +10 +x;
                ciircle.setTranslateX(x);
        }



}
/**
 *
 * @author NOR
 */
