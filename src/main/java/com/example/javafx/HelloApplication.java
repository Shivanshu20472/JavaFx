package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\will_hero.png");
        stage.getIcons().add(icon);
        stage.setTitle("Will Hero");
        stage.setWidth(1200);
        stage.setHeight(600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}