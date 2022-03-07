package com.example.brainboxx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    @FXML
    private Button exitButton;

    @FXML
    public int TotalPoints;

    @FXML
    private Button settingsButton;

    @FXML
    private Label closingScreen;


    @FXML
    private void onFullScreenExitButtonClick(){


    }



    @FXML
    public static Stage SettingsStage = new Stage();

    @FXML
    public static FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Settings.fxml"));



    @FXML
    public void onFullScreenButtonClick(ActionEvent event) throws IOException{

        Stage MainStage = new Stage();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene MainScene = new Scene(fxmlLoader1.load(), 900, 600);
        MainStage.setMaximized(true);
        SettingsStage.setMaximized(true);

    }

    @FXML
    public void onSettingsButtonClick(ActionEvent event) throws IOException{


        Stage Main = new Stage();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene Setting = new Scene(fxmlLoader.load(), 900, 600);
        Scene MainScene = new Scene(fxmlLoader1.load(), 900, 600);
        Main.setScene(MainScene);
        Main.close();
        SettingsStage.setTitle("Brain Box-settings");
        SettingsStage.setScene(Setting);
        SettingsStage.show();
    }

    @FXML
    public void onBackButtonClick() throws IOException{

        Scene Setting = new Scene(fxmlLoader.load(), 900, 600);

        SettingsStage.close();


    }

    @FXML
    protected void onExitButtonCLick() {
        closingScreen.isVisible();

        System.exit(1);


    }

    @FXML
    public void onPlayButtonClick() throws IOException{
        Stage Game = new Stage();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("GamePlay.fxml"));
        Scene PictureOne = new Scene(fxmlLoader1.load(), 900, 600);
        Game.setScene(PictureOne);
        Game.setTitle("Picture one!");
        Game.show();

    }
}