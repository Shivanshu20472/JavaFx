package com.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Controller1 {

    @FXML
    private Rectangle abcd;

    @FXML
    private Button next;


    public void showImage(){
        Image im = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\background.png");
        abcd.setFill(new ImagePattern(im));
        next.setVisible(true);
    }

    public void switchScene2() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
        Stage window = (Stage) next.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}