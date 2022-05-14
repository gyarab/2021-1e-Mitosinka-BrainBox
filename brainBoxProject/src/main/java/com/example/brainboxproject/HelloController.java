package com.example.brainboxproject;


import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;




import java.util.Random;


public class HelloController {

    Random random = new Random();

    int points = 0; //points

    @FXML
    public Pane mainScene;

    @FXML
    public Pane questionBackground;

    @FXML
    public Button playButton;

    @FXML
    public Button howToPlayButton;

    @FXML
    public Button exitButton;

    @FXML
    public Button buttonA;

    @FXML
    public Button buttonB;

    @FXML
    public Button buttonC;

    @FXML
    public Button buttonD;

    @FXML
    public Button buttonNext;

    @FXML
    public Button buttonNextPicture;

    @FXML
    public Button buttonNextPicture2;

    @FXML
    public Button buttonNextPicture3;

    @FXML
    public Button buttonNextPicture4;

    @FXML
    public Button buttonNextPicture5;

    @FXML
    public ImageView eiffelTower;

    @FXML
    public ImageView burjKhalifa;

    @FXML
    public ImageView goldenGate;

    @FXML
    public ImageView statueOfLiberty;

    @FXML
    public ImageView petra;

    @FXML
    public Label question;

    @FXML
    public Label answer;

    @FXML
    public Label scoreLabel;

    @FXML
    public Label howToPlayLabel;


    @FXML
    public void onHowToPlayButtonClick(){
        playButton.setVisible(false);
        exitButton.setVisible(false);
        howToPlayButton.setVisible(false);
        buttonNext.setVisible(true);
        buttonNext.setText("Back    ");
        howToPlayLabel.setVisible(true);
        buttonNext.setOnAction(e -> {
            playButton.setVisible(true);
            exitButton.setVisible(true);
            buttonNext.setText("Next");
            howToPlayButton.setVisible(true);
            buttonNext.setVisible(false);
            howToPlayLabel.setVisible(false);
        });
    }



    @FXML
    public void onExitButtonClick(){

        System.exit(1);
    }



    @FXML
    public void onPlayButtonClick(){


        int x = random.nextInt(5);

        if(x == 0) {
            question.setText("Where is this building located"); //setting up question&answers for int x=0-5
            buttonA.setText("Paris");
            buttonB.setText("Prague");
            buttonC.setText("New York");
            buttonD.setText("Chicago");
        }
        else if(x == 1) {
            question.setText("How many bird are on the picture?");
            buttonA.setText("0");
            buttonB.setText("1");
            buttonC.setText("2");
            buttonD.setText("3");
        }
        else if(x == 2) {
            question.setText("When was the construction finished?");
            buttonA.setText("1987");
            buttonB.setText("1890");
            buttonC.setText("1889");
            buttonD.setText("1941");
        }
        else if(x == 3) {
            question.setText("Who founded this building?");
            buttonA.setText("Jan Novak");
            buttonB.setText("Gustave Eiffel");
            buttonC.setText("Ivo Petrik");
            buttonD.setText("Joe Biden");
        }
        else if(x == 4) {
            question.setText("What is the name of this building?");
            buttonA.setText("Prague castle");
            buttonB.setText("Petrinska rozhledna");
            buttonC.setText("Zizkovska Tower");
            buttonD.setText("Eiffel Tower");
        }
        else if(x == 5) {
            question.setText("What color was the tree in bottom right corner?");
            buttonA.setText("green");
            buttonB.setText("orange");
            buttonC.setText("purple");
            buttonD.setText("red");
        }

        eiffelTower.setVisible(true);//set visible image
        buttonNext.setVisible(true);//set visible button, which gets u to question screen
        buttonNext.setOnAction(e -> {//setting visible and hiding button and panes
            eiffelTower.setVisible(false);
            questionBackground.setVisible(true);
            question.setVisible(true);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            buttonNext.setVisible(false);

        });



        if(x == 0){ //correct/uncorrect answer for each button
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);//button that switches to next picture
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 1){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 2){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 3){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 4){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 5){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                buttonNextPicture.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });

        }



    }








    @FXML
    public void onNextButtonClick(){//same thing again, just with different questions, image and answers
        int x = random.nextInt(5);

        if(x == 0) {
            question.setText("Where is this building located");
            buttonA.setText("Paris");
            buttonB.setText("Ney Jersey");
            buttonC.setText("New York");
            buttonD.setText("Dubai");
        }
        else if(x == 1) {
            question.setText("How many floors does it have?");
            buttonA.setText("163");
            buttonB.setText("143");
            buttonC.setText("136");
            buttonD.setText("197");
        }
        else if(x == 2) {
            question.setText("When was the construction finished?");
            buttonA.setText("1980");
            buttonB.setText("2010");
            buttonC.setText("2004");
            buttonD.setText("2000");
        }
        else if(x == 3) {
            question.setText("Who founded this building?");
            buttonA.setText(" Adrian Smith");
            buttonB.setText("John Berry");
            buttonC.setText("Justin Jeffry");
            buttonD.setText("Adrey Antonow");
        }
        else if(x == 4) {
            question.setText("What is the name of this building?");
            buttonA.setText("Burj Khalifa");
            buttonB.setText("Empire state building");
            buttonC.setText("Zizkovska Tower");
            buttonD.setText("Eiffel Tower");
        }
        else if(x == 5) {
            question.setText("How many birds were on the picture?");
            buttonA.setText("2");
            buttonB.setText("4");
            buttonC.setText("0");
            buttonD.setText("3");
        }

        questionBackground.setVisible(false);
        question.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonNext.setVisible(false);
        burjKhalifa.setVisible(true);
        buttonNextPicture.setVisible(false);
        answer.setVisible(false);
        buttonNext.setVisible(true);

        buttonNext.setOnAction(e -> {
            buttonA.setDisable(false);
            buttonB.setDisable(false);
            buttonC.setDisable(false);
            buttonD.setDisable(false);
            burjKhalifa.setVisible(false);
            questionBackground.setVisible(true);
            question.setVisible(true);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            buttonNext.setVisible(false);
        });


        if(x == 0){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 1){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 2){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 3){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 4){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 5){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                buttonNextPicture2.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });

        }

    }









    @FXML
    public void onNextButton2Click(){
        int x = random.nextInt(5);

        if(x == 0) {
            question.setText("Where is this building located");
            buttonA.setText("Tokyo");
            buttonB.setText("Moscow");
            buttonC.setText("Los Angeles");
            buttonD.setText("San Francisko");
        }
        else if(x == 1) {
            question.setText("How long is the bridge?");
            buttonA.setText("920m");
            buttonB.setText("1280m");
            buttonC.setText("2230m");
            buttonD.setText("1860m");
        }
        else if(x == 2) {
            question.setText("When was the construction started?");
            buttonA.setText("1937");
            buttonB.setText("1945");
            buttonC.setText("1933");
            buttonD.setText("1922");
        }
        else if(x == 3) {
            question.setText("Who founded this building?");
            buttonA.setText("Joseph Strauss");
            buttonB.setText("Bill Gates");
            buttonC.setText("Francisko Ruby");
            buttonD.setText("Josh Writer");
        }
        else if(x == 4) {
            question.setText("What is the name of this building?");
            buttonA.setText("Golden Way Bridge ");
            buttonB.setText("Golden Gate Bridge");
            buttonC.setText("Golden Day Bridge");
            buttonD.setText("Golden Road Bridge");
        }
        else if(x == 5) {
            question.setText("What color is the bridge?");
            buttonA.setText("black");
            buttonB.setText("orange");
            buttonC.setText("yellow");
            buttonD.setText("red");
        }

        questionBackground.setVisible(false);
        question.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonA.setDisable(false);
        buttonB.setDisable(false);
        buttonC.setDisable(false);
        buttonD.setDisable(false);
        buttonNext.setVisible(false);
        goldenGate.setVisible(true);
        buttonNextPicture2.setVisible(false);
        answer.setVisible(false);
        buttonNext.setVisible(true);

        buttonNext.setOnAction(e -> {
            goldenGate.setVisible(false);
            questionBackground.setVisible(true);
            question.setVisible(true);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            buttonNext.setVisible(false);
        });


        if(x == 0){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 1){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 2){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 3){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 4){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 5){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                buttonNextPicture3.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });

        }

    }



    @FXML
    public void onNextButton3Click(){
        int x = random.nextInt(5);

        if(x == 0) {
            question.setText("Where is this building located?   ");
            buttonA.setText("Las Vegas");
            buttonB.setText("New York");
            buttonC.setText("Los Angeles");
            buttonD.setText("Old York");
        }
        else if(x == 1) {
            question.setText("How high is the statue?");
            buttonA.setText("93m");
            buttonB.setText("98m");
            buttonC.setText("90m");
            buttonD.setText("95m");
        }
        else if(x == 2) {
            question.setText("When was it dedicated?");
            buttonA.setText("1886");
            buttonB.setText("1868");
            buttonC.setText("1878");
            buttonD.setText("1867");
        }
        else if(x == 3) {
            question.setText("Who was the sculptor of this statue?");
            buttonA.setText("Frédéric Augustiny Bartholdi");
            buttonB.setText("Frédérico Auguste Bartholdi");
            buttonC.setText("Frédéric Auguste Bartholdi");
            buttonD.setText("Frédéric Auguste Bartholde");
        }
        else if(x == 4) {
            question.setText("What is the name of this building?");
            buttonA.setText("Statue of Liberty");
            buttonB.setText("Statue of Freedom");
            buttonC.setText("Statue of Augustiny");
            buttonD.setText("The Green Statue");
        }
        else if(x == 5) {
            question.setText("How many pillars are on the base?");
            buttonA.setText("2");
            buttonB.setText("3");
            buttonC.setText("4");
            buttonD.setText("5");
        }

        questionBackground.setVisible(false);
        question.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonA.setDisable(false);
        buttonB.setDisable(false);
        buttonC.setDisable(false);
        buttonD.setDisable(false);
        buttonNext.setVisible(false);
        statueOfLiberty.setVisible(true);
        buttonNextPicture3.setVisible(false);
        answer.setVisible(false);
        buttonNext.setVisible(true);

        buttonNext.setOnAction(e -> {
            statueOfLiberty.setVisible(false);
            questionBackground.setVisible(true);
            question.setVisible(true);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            buttonNext.setVisible(false);
        });


        if(x == 0){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 1){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 2){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 3){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 4){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 5){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                buttonNextPicture4.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });

        }

    }

    @FXML
    public void onNextButton4Click(){
        int x = random.nextInt(5);

        if(x == 0) {
            question.setText("Where is this building located?   ");
            buttonA.setText("Egypt");
            buttonB.setText("Iran");
            buttonC.setText("Iraq");
            buttonD.setText("Jordan");
        }
        else if(x == 1) {
            question.setText("How many camles are there?");
            buttonA.setText("2");
            buttonB.setText("1");
            buttonC.setText("3");
            buttonD.setText("0");
        }
        else if(x == 2) {
            question.setText("How many pillars are in the base?");
            buttonA.setText("4");
            buttonB.setText("6");
            buttonC.setText("7");
            buttonD.setText("8");
        }
        else if(x == 3) {
            question.setText("How many bushes are there?");
            buttonA.setText("0");
            buttonB.setText("1");
            buttonC.setText("2");
            buttonD.setText("3");
        }
        else if(x == 4) {
            question.setText("What is the name of this building?");
            buttonA.setText("Petr");
            buttonB.setText("Petra");
            buttonC.setText("Petrov");
            buttonD.setText("Petrova");
        }
        else if(x == 5) {
            question.setText("How many people are there?");
            buttonA.setText("2");
            buttonB.setText("1");
            buttonC.setText("0");
            buttonD.setText("3");
        }

        questionBackground.setVisible(false);
        question.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonA.setDisable(false);
        buttonB.setDisable(false);
        buttonC.setDisable(false);
        buttonD.setDisable(false);
        buttonNext.setVisible(false);
        petra.setVisible(true);
        buttonNextPicture4.setVisible(false);
        answer.setVisible(false);
        buttonNext.setVisible(true);

        buttonNext.setOnAction(e -> {
            petra.setVisible(false);
            questionBackground.setVisible(true);
            question.setVisible(true);
            buttonA.setVisible(true);
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            buttonD.setVisible(true);
            buttonNext.setVisible(false);
        });


        if(x == 0){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 1){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 2){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 3){
            buttonA.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 4){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
        }
        else if(x == 5){
            buttonA.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonB.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonC.setOnAction(e -> {
                System.out.println("RIGHT!");
                points++;
                answer.setText("Correct!");
                answer.setTextFill(Color.GREEN);
                answer.setVisible(true);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });
            buttonD.setOnAction(e -> {
                System.out.println("WRONG!");
                answer.setText("False!");
                answer.setTextFill(Color.RED);
                buttonNextPicture5.setVisible(true);
                buttonA.setDisable(true);
                buttonB.setDisable(true);
                buttonC.setDisable(true);
                buttonD.setDisable(true);
            });

        }

    }

    @FXML
    public void onNextButton5Click(){

        question.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonA.setDisable(false);
        buttonB.setDisable(false);
        buttonC.setDisable(false);
        buttonD.setDisable(false);
        answer.setVisible(false);
        buttonNextPicture5.setVisible(false);
        scoreLabel.setVisible(true);
        buttonNext.setVisible(true);
        if(points > 0){
            scoreLabel.setTextFill(Color.GREEN);
            scoreLabel.setText("Congratulations! You scored totally "+points+" points");
        }else if(points == 0){
            scoreLabel.setTextFill(Color.RED);
            scoreLabel.setText("Yayks, u got 0 questions right, better luck next time!");
        }
        buttonNext.setOnAction(e -> {
            questionBackground.setVisible(false);
            scoreLabel.setVisible(false);
            mainScene.setVisible(true);
            playButton.setVisible(true);
            exitButton.setVisible(true);
            howToPlayButton.setVisible(true);
            buttonNext.setVisible(false);
            points = 0;
        });

        System.out.println(points);
    }

}
