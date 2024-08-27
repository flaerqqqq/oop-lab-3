package com.example.palindromechecker;

import com.example.palindromechecker.handlers.GlobalExceptionHandler;
import com.example.palindromechecker.util.PalindromeChecker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PalindromeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PalindromeApplication.class.getResource("palindrome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}