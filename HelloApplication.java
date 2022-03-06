package com.example.brainboxfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        Image Eiffel = new Image(getClass().getResourceAsStream("/images/photo-of-eiffel-tower-739407-1024x683.jpg"));
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));


        ImageView view = new ImageView(Eiffel);

        HBox hbox = new HBox(view);
        Scene ETowerQ1 = new Scene(hbox);

        primaryStage.setTitle("BrainBox.running");
        primaryStage.setMaximized(false);

        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: #8B0000;");
        Scene scene = new Scene(stackPane);


        primaryStage.setScene(scene);
        primaryStage.show();



        //tlacitka
        Button maximizeWindow = new Button("Fullscreen mode");
        Button exitMaximizedWindow = new Button("Exit fullscreen mode");
        Button startGame = new Button("Start game");


        //design tlacitek
        maximizeWindow.relocate(250, 619);


        //funkce tlacitek
        maximizeWindow.setOnMouseClicked(e -> primaryStage.setMaximized(true));
        exitMaximizedWindow.setOnMouseClicked(e -> primaryStage.setMaximized(false));
        startGame.setOnMouseClicked(e -> primaryStage.setScene(ETowerQ1));


        //usporadani tlacitek
        stackPane.getChildren().addAll(maximizeWindow, exitMaximizedWindow, startGame);
        //stackPane.setAlignment(maximizeWindow, );
        //stackPane.setAlignment(exitMaximizedWindow, Pos.TOP_LEFT);
       //stackPane.setAlignment(startGame, Pos.CENTER);
    }


    public static void main(String[] args)  {
        Application.launch(args);
    }
}