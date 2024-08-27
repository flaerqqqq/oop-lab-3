package com.example.palindromechecker.controllers;

import com.example.palindromechecker.util.PalindromeChecker;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PalindromeController {
    @FXML
    private TextField wordInput;

    @FXML
    private Button checkUsingStringReversal;

    @FXML
    private Button checkUsingPointers;

    @FXML
    private void checkUsingStringReversal() {
        String input = wordInput.getText();
        long startTime = System.nanoTime();
        boolean isPalindrome = PalindromeChecker.checkV2(input);
        double processTime = (System.nanoTime() - startTime)/1000000d;
        if (isPalindrome) {
            new Alert(Alert.AlertType.INFORMATION, "Given string is a palindrome.\n Resulted in %s millis.".formatted(processTime)).showAndWait();
        } else {
            new Alert(Alert.AlertType.ERROR, "Given string is not a palindrome.\n Resulted in %s millis.".formatted(processTime)).showAndWait();
        }
    }

    @FXML
    private void checkUsingPointers() {
        String input = wordInput.getText();
        long startTime = System.nanoTime();
        boolean isPalindrome = PalindromeChecker.checkV1(input);
        double processTime = (System.nanoTime() - startTime)/1000000d;
        if (isPalindrome) {
            new Alert(Alert.AlertType.INFORMATION, "Given string is a palindrome.\n Resulted in %s millis.".formatted(processTime)).showAndWait();
        } else {
            new Alert(Alert.AlertType.ERROR, "Given string is not a palindrome.\n Resulted in %s millis.".formatted(processTime)).showAndWait();
        }
    }
}
