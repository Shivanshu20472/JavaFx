package com.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class Controller3 implements Initializable {

    static int n22 = 0;

    @FXML
    private Rectangle GameOver;

    @FXML
    private Button move;

    @FXML
    private Button chance;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageShow();
    }


    static Controller2 c2 = new Controller2();
    static int a2 = c2.c;
    public void ImageShow(){
        Image i1 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\GameOver.png");
        GameOver.setFill(new ImagePattern(i1));
        move.setVisible(true);

        if(a2>40 && n22==0){
            chance.setVisible(true);
            n22++;
        }
    }

    public void chance() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
        Stage window = (Stage) chance.getScene().getWindow();
        window.setScene(new Scene(root));
    }


}