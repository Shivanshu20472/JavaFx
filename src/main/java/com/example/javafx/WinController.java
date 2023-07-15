package com.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class WinController implements Initializable {

    @FXML
    private Rectangle GameWon;

    @FXML
    private Button move;

    @FXML
    private Label Points;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageShow();
    }

    Scene3_Controller s1 = new Scene3_Controller();
    int s2 = s1.a1;
    public void ImageShow(){
        Image i1 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\GameWon.png");
        GameWon.setFill(new ImagePattern(i1));
        move.setVisible(true);

        Points.setText("Total Points ; " + s2);
    }
}
